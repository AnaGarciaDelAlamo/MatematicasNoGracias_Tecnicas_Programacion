public interface InterfazPolinomio {

    public void agregarTermino(DatoPolinomio dato);
    public void modificarPolinomio(DatoPolinomio dato, int posicion);
    public void mostrarPolinomio();
    public Polinomio sumarPolinomios(Polinomio polinomio1, Polinomio polinomio2);
    public Polinomio multiplicarPolinomios(Polinomio polinomio1, Polinomio polinomio2);
}
