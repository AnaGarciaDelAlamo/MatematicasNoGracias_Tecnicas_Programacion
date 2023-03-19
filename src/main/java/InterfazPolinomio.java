public interface InterfazPolinomio {
public void cargarPolinomio();
public void modificarPolinomio(int t, double v);
public double obtenerValor(int termino);
public void sumarPolinomio(Polinomio p);
public void multiplicarPolinomio(Polinomio p);
public void mostrarContenido();
public void eliminarTermino(int t);
public boolean existeTermino(int t);
public int calcularGrado();

}
