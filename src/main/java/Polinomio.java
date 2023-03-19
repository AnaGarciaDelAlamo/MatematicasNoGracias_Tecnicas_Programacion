import java.util.Scanner;

public class Polinomio implements InterfazPolinomio {
    Scanner sc = new Scanner(System.in);
private int grado;
private NodoPolinomio terminoMayor;

public Polinomio(){
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

    while(actual != null && actual.getDato().getTermino() > t){
        actual = actual.getSiguiente();
    }
    if(actual == null || actual.getDato().getTermino() < t){
        NodoPolinomio nuevo = new NodoPolinomio(new DatoPolinomio(v, t), actual);
        terminoMayor = nuevo;
        grado = t;
    }else{
        actual.getDato().setValor(v);
    }

    }

    @Override
    public double obtenerValor(int termino) {
    NodoPolinomio actual = terminoMayor;

    while(actual != null && actual.getDato().getTermino() > termino){
        actual = actual.getSiguiente();
    }
    if(actual == null || actual.getDato().getTermino() < termino){
        return 0;
    }else{
        return actual.getDato().getValor();
    }
    }

    @Override
    public void sumarPolinomio(Polinomio p) {


    }

    @Override
    public void multiplicarPolinomio(Polinomio p) {

    }

    @Override
    public void mostrarContenido() {

    }

    @Override
    public void eliminarTermino(int t) {

    }

    @Override
    public boolean existeTermino(int t) {
        return false;
    }
}



