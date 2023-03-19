import java.util.Scanner;

public class Polinomio implements InterfazPolinomio {
    Scanner sc = new Scanner(System.in);
    private int grado;
    private NodoPolinomio terminoMayor;

    public Polinomio() {
        this.grado = -1;
        this.terminoMayor = null;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public NodoPolinomio getTerminoMayor() {
        return terminoMayor;
    }

    public void setTerminoMayor(NodoPolinomio terminoMayor) {
        this.terminoMayor = terminoMayor;
    }

    @Override
    public void cargarPolinomio() {

    }

    @Override
    public void modificarPolinomio(int t, double v) {
        NodoPolinomio actual = terminoMayor;

        while (actual != null && actual.getDato().getTermino() > t) {
            actual = actual.getSiguiente();
        }
        if (actual == null || actual.getDato().getTermino() < t) {
            NodoPolinomio nuevo = new NodoPolinomio(new DatoPolinomio(v, t), actual);
            terminoMayor = nuevo;
            grado = t;
        } else {
            actual.getDato().setValor(v);
        }

    }

    @Override
    public double obtenerValor(int termino) {
        NodoPolinomio actual = terminoMayor;

        while (actual != null && actual.getDato().getTermino() > termino) {
            actual = actual.getSiguiente();
        }
        if (actual == null || actual.getDato().getTermino() < termino) {
            return 0;
        } else {
            return actual.getDato().getValor();
        }
    }

    @Override
    public void sumarPolinomio(Polinomio p) {
        NodoPolinomio actual = terminoMayor;
        NodoPolinomio actual2 = p.getTerminoMayor();
        NodoPolinomio ultimo = null;

        while (actual != null || actual2 != null) {
            int termino1 = (actual != null) ? actual.getDato().getTermino() : -1;
            int termino2 = (actual2 != null) ? actual2.getDato().getTermino() : -1;

            if (termino1 > termino2) {
                NodoPolinomio nuevo = new NodoPolinomio(new DatoPolinomio(actual.getDato().getValor(), termino1), ultimo);
                ultimo = nuevo;
                actual = actual.getSiguiente();
            } else if (termino1 < termino2) {
                NodoPolinomio nuevo = new NodoPolinomio(new DatoPolinomio(actual2.getDato().getValor(), termino2), ultimo);
                ultimo = nuevo;
                actual2 = actual2.getSiguiente();
            } else {
                double valor = actual.getDato().getValor() + actual2.getDato().getValor();
                if (valor != 0) {
                    NodoPolinomio nuevo = new NodoPolinomio(new DatoPolinomio(valor, termino1), ultimo);
                    ultimo = nuevo;
                }
                actual = actual.getSiguiente();
                actual2 = actual2.getSiguiente();
            }
        }


    }

    @Override
    public void multiplicarPolinomio(Polinomio p) {
        Polinomio resultado = new Polinomio();
        NodoPolinomio actual = terminoMayor;
        NodoPolinomio actual2 = p.getTerminoMayor();

        while (actual != null) {
            while (actual2 != null) {
                int termino = actual.getDato().getTermino() + actual2.getDato().getTermino();
                double valor = actual.getDato().getValor() * actual2.getDato().getValor();
                resultado.modificarPolinomio(termino, valor);
                actual2 = actual2.getSiguiente();
            }
            actual = actual.siguiente;
            actual2 = p.getTerminoMayor();
        }
        terminoMayor = resultado.getTerminoMayor();
        grado = resultado.getGrado();
    }

    @Override
    public void mostrarContenido() {

    }

    @Override
    public void eliminarTermino(int t) {
        NodoPolinomio actual = terminoMayor;
        NodoPolinomio anterior = null;

        while(actual != null && actual.getDato().getTermino() != t){
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if(actual == null){
            System.out.println("El término " + t + " no existe");
        }else if(anterior == null){
            terminoMayor = actual.getSiguiente();
        }else{
            anterior.setSiguiente(actual.getSiguiente());
        }
        grado = calcularGrado();

    }

    @Override
    public boolean existeTermino(int t) {
        NodoPolinomio actual = terminoMayor;

        while (actual != null) {
            if (actual.getDato().getTermino() == t) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int calcularGrado() {
        NodoPolinomio actual = terminoMayor;
        int grado = -1;
        while(actual != null){
            if(actual.getDato().getTermino() > grado){
                grado = actual.getDato().getTermino();
            }
            actual = actual.getSiguiente();
        }
        return grado;
    }
}




