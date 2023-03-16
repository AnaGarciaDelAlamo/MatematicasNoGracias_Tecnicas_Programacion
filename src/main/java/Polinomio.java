import java.util.Scanner;

public class Polinomio implements InterfazPolinomio {
    int grado;
    NodoPolinomio terminoMayor;

    Polinomio polinomioActual;

    public Polinomio(int grado, NodoPolinomio terminoMAyor){
        this.grado = grado;
        this.terminoMayor = terminoMayor;
    }

    @Override
    public void caragarPolinomio(Polinomio polinomio) {
        polinomioActual = polinomio;

    }

    @Override
    public void modificarPolinomio(DatoPolinomio dato, int posicion) {
        NodoPolinomio nodoActual = polinomioActual.terminoMayor;
        for(int i = 0; i < posicion; i++){
            nodoActual = nodoActual.siguiente;
        }
        if (nodoActual != null){
            nodoActual.dato = dato;
        }

    }

    @Override
    public int obtenerValorPolinomio(int x) {
        return 0;
    }

    @Override
    public Polinomio sumarPolinomios(Polinomio polinomio1, Polinomio polinomio2) {
        return null;
    }

    @Override
    public Polinomio multiplicarPolinomios(Polinomio polinomio1, Polinomio polinomio2) {
        return null;
    }
}



