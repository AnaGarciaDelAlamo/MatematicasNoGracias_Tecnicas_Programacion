public class NodoPolinomio {
    private DatoPolinomio dato;
    private NodoPolinomio siguiente;

    public NodoPolinomio(DatoPolinomio dato) {
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
