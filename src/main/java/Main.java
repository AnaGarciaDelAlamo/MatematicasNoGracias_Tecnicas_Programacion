import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--POLINOMIOS--");
        System.out.println("Vamos a crear el primer polinomio");
        System.out.println("Ingrese el valor del primer termino: ");
        int valor = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el termino del primer termino: ");
        int termino = sc.nextInt();
        sc.nextLine();
        System.out.println("Vamos a crear el segundo termino");
        System.out.println("Ingrese el valor del termino: ");
        int valor2 = sc.nextInt();
        System.out.println("Ingrese el termino del segundo termino: ");
        int termino2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Vamos a crear el tercer termino");
        System.out.println("Ingrese el valor del termino: ");
        int valor3 = sc.nextInt();
        System.out.println("Ingrese el termino del tercer termino: ");
        int termino3 = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el grado del polinomio");
        int grado = sc.nextInt();

        NodoPolinomio t1 = new NodoPolinomio(new DatoPolinomio(valor, termino), null);
        NodoPolinomio t2 = new NodoPolinomio(new DatoPolinomio(valor2, termino2), null);
        NodoPolinomio t3 = new NodoPolinomio(new DatoPolinomio(valor3, termino3), null);

        t2.siguiente = t1;
        t3.siguiente = t2;

        Polinomio polinomio1 = new Polinomio(grado, t3);






    }
}
