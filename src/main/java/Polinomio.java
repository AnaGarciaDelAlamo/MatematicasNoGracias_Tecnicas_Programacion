import java.util.Scanner;

public class Polinomio {
    private Nodo termino_mayor;
    private int grado;

    public Polinomio(){
        this.termino_mayor = null;
        this.grado = -1;
    }

    public Nodo getTermino_mayor() {
        return termino_mayor;
    }

    public void setTermino_mayor(Nodo termino_mayor) {
        this.termino_mayor = termino_mayor;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void agregarTermino(int termino, double valor){
        Nodo aux = new Nodo();
        DatoPolinomio dato = new DatoPolinomio(valor, termino);
        aux.info = dato.toString();
        if(termino > grado){
            aux.setSig(termino_mayor);
            termino_mayor = aux;
            grado = termino;
        } else {
            Nodo actual = termino_mayor;
            while(actual.getSig() != null && termino < actual.getSig().getInfo().getTermino()){
                actual = actual.getSig();
            }
            aux.setSig(actual.getSig());
            actual.setSig(aux);
        }
    }

    public void modificarTermino(int termino, double valor){
        Nodo aux = termino_mayor;
        while(aux != null && aux.getInfo().getTermino() != termino){
            aux = aux.getSig();
        }
        if(aux != null){
            aux.getInfo().setValor(valor);
        }
    }

    public double obtenerValor(int termino){
        Nodo aux = termino_mayor;
        while(aux != null && aux.getInfo().getTermino() > termino){
            aux = aux.getSig();
        }
        if(aux != null && aux.getInfo().getTermino() == termino){
            return aux.getInfo().getValor();
        } else {
            return 0;
        }
    }

    public String mostrar(){
        Nodo aux = termino_mayor;
        String pol = "";
        if(aux != null){
            while(aux != null){
                String signo = "";
                if(aux.getInfo().getValor() >= 0){
                    signo = "+";
                }
                pol += signo + aux.getInfo().getValor() + "x^" + aux.getInfo().getTermino();
                aux = aux.getSig();
            }
        }
        return pol;
    }

    public Polinomio sumar(Polinomio polinomio2){
        Polinomio paux = new Polinomio();
        Polinomio mayor = this;
        if(grado < polinomio2.grado){
            mayor = polinomio2;
        }
        for(int i = 0; i< mayor.grado; i++){
            double total = obtenerValor(i) + polinomio2.obtenerValor(i);
            if(total != 0){
                paux.agregarTermino(i, total);
            }
        }
        return paux;
    }

    public Polinomio multiplicar(Polinomio polinomio2){

    }
}



