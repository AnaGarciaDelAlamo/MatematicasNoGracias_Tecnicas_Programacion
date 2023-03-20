import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polinomio polinomio = new Polinomio();

        while(true){
            System.out.println("--MENÚ PRINCIPAL");
            System.out.println("0. Salir");
            System.out.println("1. Cargar polinomio");
            System.out.println("2. Modificar polinomio");
            System.out.println("3. Obtener valor");
            System.out.println("4. Sumar polinomio");
            System.out.println("5. Multiplicar polinomio");
            System.out.println("6. Mostrar contenido");
            System.out.println("7. Eliminar término");
            System.out.println("8. Existe término");
            System.out.println("9. Calcular grado");


            int opcion = sc.nextInt();

            switch(opcion){
                case 0:
                    System.out.println("Hasta pronto");
                    return;
                case 1:
                    polinomio.cargarPolinomio();
                    polinomio.mostrarContenido();
                    break;
                case 2:
                    polinomio.modificarPolinomio(3, 4.0);
                    break;
                case 3:
                    polinomio.obtenerValor(3);
                    break;
                case 4:
                    Polinomio polinomio2 = new Polinomio();
                    polinomio2.cargarPolinomio();
                    polinomio.sumarPolinomio(polinomio2);
                    polinomio.mostrarContenido();
                    break;
                case 5:
                    Polinomio polinomio3 = new Polinomio();
                    polinomio3.cargarPolinomio();
                    polinomio.multiplicarPolinomio(polinomio3);
                    polinomio.mostrarContenido();
                    break;
                case 6:
                    polinomio.mostrarContenido();
                    break;
                case 7:
                    polinomio.eliminarTermino(3);
                    break;
                case 8:
                    polinomio.existeTermino(3);
                    break;
                case 9:
                    polinomio.calcularGrado();
                default:
                    System.out.println("Opción inválida, intentelo otra vez");
                    break;

            }
        }


    }
}
