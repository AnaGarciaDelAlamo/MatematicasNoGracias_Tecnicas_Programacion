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
        int valorPolinomio = 0;
        NodoPolinomio nodoActual = polinomioActual.terminoMayor;
        while(nodoActual != null){
            valorPolinomio += nodoActual.dato.valor * Math.pow(x, nodoActual.dato.termino);
            nodoActual = nodoActual.siguiente;
        }
        return valorPolinomio;
    }

    @Override
    public Polinomio sumarPolinomios(Polinomio polinomio1, Polinomio polinomio2) {
        NodoPolinomio nodo1 = polinomio1.terminoMayor;
        NodoPolinomio nodo2 = polinomio2.terminoMayor;
        NodoPolinomio terminoMayor = null;
        NodoPolinomio nodoActual = null;
        int gradoSuma = Math.max(polinomio1.grado, polinomio2.grado);
        for(int i = gradoSuma; i >= 0; i--){
            int valor = 0;
            if(nodo1 != null && nodo1.dato.termino == i){
                valor += nodo1.dato.valor;
                nodo1 = nodo1.siguiente;
            }
            if(nodo2 != null && nodo2.dato.termino == i){
                valor += nodo2.dato.valor;
                nodo2 = nodo2.siguiente;
            }
            if(valor != 0) {
                NodoPolinomio nuevoTermino = new NodoPolinomio(new DatoPolinomio(valor, i), null);
                if (terminoMayor == null) {
                    terminoMayor = nuevoTermino;
                    nodoActual = nuevoTermino;
                } else {
                    nodoActual.siguiente = nuevoTermino;
                    nodoActual = nodoActual.siguiente;
                }
            }
        }
        return new Polinomio(gradoSuma, terminoMayor);
    }

    @Override
    public Polinomio multiplicarPolinomios(Polinomio polinomio1, Polinomio polinomio2) {
        NodoPolinomio nodo1 = polinomio1.terminoMayor;
        NodoPolinomio nodo2 = polinomio2.terminoMayor;
        Polinomio resultado = new Polinomio(polinomio1.grado + polinomio2.grado, null);
        while(nodo1 != null){
            NodoPolinomio terminoActual = null;
            NodoPolinomio nodo2Actual = nodo2;
            while(nodo2Actual != null){
                DatoPolinomio datoMultiplicado = new DatoPolinomio(
                        nodo1.dato.valor * nodo2Actual.dato.valor,
                        nodo1.dato.termino + nodo2Actual.dato.termino
                );
                NodoPolinomio nuevoTermino = new NodoPolinomio(datoMultiplicado, null);
                if(terminoActual == null){
                    terminoActual = nuevoTermino;
                }else{
                    terminoActual.siguiente = nuevoTermino;
                    terminoActual = terminoActual.siguiente;
                }
                nodo2Actual = nodo2Actual.siguiente;
            }
            resultado = sumarPolinomios(resultado, new Polinomio(polinomio1.grado + polinomio2.grado, terminoActual));
            nodo1 = nodo1.siguiente;
        }
        return resultado;
    }
}



