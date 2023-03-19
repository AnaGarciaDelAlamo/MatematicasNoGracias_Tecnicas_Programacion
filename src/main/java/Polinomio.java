import java.util.Scanner;

public class Polinomio implements InterfazPolinomio {
private int grado;
private DatoPolinomio terminoMayor;

public Polinomio(){
    this.grado = 0;
    this.terminoMayor = new DatoPolinomio(0.0, 0);
}

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public DatoPolinomio getTerminoMayor() {
        return terminoMayor;
    }

    public void setTerminoMayor(DatoPolinomio terminoMayor) {
        this.terminoMayor = terminoMayor;
    }

    @Override
    public void cargarPolinomio() {

    }

    @Override
    public void modificarPolinomio() {

    }

    @Override
    public double obtenerValor(int termino) {
        return 0;
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



