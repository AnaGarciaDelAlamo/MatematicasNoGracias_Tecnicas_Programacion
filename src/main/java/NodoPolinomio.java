public class NodoPolinomio {
    public DatoPolinomio dato;
    public NodoPolinomio siguiente;

    public NodoPolinomio(DatoPolinomio dato, NodoPolinomio siguiente) {
        this.dato = dato;
        this.siguiente = null;
    }

    public DatoPolinomio getDato() {
        return dato;
    }

    public void setDato(DatoPolinomio dato) {
        this.dato = dato;
    }

    public NodoPolinomio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPolinomio siguiente) {
        this.siguiente = siguiente;
    }
}
