import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--POLINOMIOS--");
        /*System.out.println("Vamos a crear el primer polinomio");
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
        sc.nextLine();*/

        /*System.out.println("Introduce el grado del polinomio");
        int grado = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el grado del otro polinomio: ");
        int grado2 = sc.nextInt();

        NodoPolinomio t1 = new NodoPolinomio(new DatoPolinomio(valor, termino), null);
        NodoPolinomio t2 = new NodoPolinomio(new DatoPolinomio(valor2, termino2), null);
        NodoPolinomio t3 = new NodoPolinomio(new DatoPolinomio(valor3, termino3), null);

        t2.siguiente = t1;
        t3.siguiente = t2;

        Polinomio polinomio1 = new Polinomio(grado, t3);

        Polinomio polinomio2 = new Polinomio(grado2, t3);*/

        Polinomio polinomio1 = null;
        Polinomio polinomio2 = null;
        Polinomio resultados = null;
        boolean salir = false;

        while(!salir ){
            System.out.println("Seleccione una opcion: ");
            System.out.println("0.- Salir");
            System.out.println("1.- Crear polinomio 1");
            System.out.println("2.-Crear polinomio 2");
            System.out.println("3.-Sumar polinomios");
            System.out.println("4.-Multiplicar polinomios");

            int opcion = sc.nextInt();

            switch(opcion){
                case 0:
                    System.out.println("Adiós");
                    salir = true;
                    return;
                case 1:
                    //Primer término
                    System.out.println("Introduce el valor del primer término: ");
                    int valor = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce el término del primer término: ");
                    int termino = sc.nextInt();
                    NodoPolinomio termino1 = new NodoPolinomio(new DatoPolinomio(valor, termino), null);

                    //Segundo término
                    System.out.println("Introduce el valor del segundo término: ");
                    int valor2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce el término del segundo término: ");
                    int t2 = sc.nextInt();
                    NodoPolinomio termino2 = new NodoPolinomio(new DatoPolinomio(valor2, t2), null);

                    //Tercer término
                    System.out.println("Introduce el valor del tercer término: ");
                    int valor3 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce el término del tercer término: ");
                    int t3 = sc.nextInt();
                    NodoPolinomio termino3 = new NodoPolinomio(new DatoPolinomio(valor3, t3), null);

                    termino2.siguiente = termino1;
                    termino3.siguiente = termino2;

                    System.out.println("Introduce el grado del polinomio: ");
                    int grado = sc.nextInt();
                    polinomio1 = new Polinomio(grado, termino3);
                    System.out.println("Polinomio 1 creado");
                    break;
                    case 2:
                        //Primer término
                        System.out.println("Introduce el valor del primer término: ");
                        int valor4 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduce el término del primer término: ");
                        int termino4 = sc.nextInt();
                        NodoPolinomio t4 = new NodoPolinomio(new DatoPolinomio(valor4, termino4), null);

                        //Segundo término
                        System.out.println("Introduce el valor del segundo término: ");
                        int valor5 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduce el término del segundo término: ");
                        int termino5 = sc.nextInt();
                        NodoPolinomio t5 = new NodoPolinomio(new DatoPolinomio(valor5, termino5), null);

                        //Tercer término
                        System.out.println("Introduce el valor del tercer término: ");
                        int valor6 = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduce el término del tercer término: ");
                        int t6 = sc.nextInt();
                        NodoPolinomio termino6 = new NodoPolinomio(new DatoPolinomio(valor6, t6), null);

                        t5.siguiente = t4;
                        termino6.siguiente = t5;

                        System.out.println("Introduce el grado del polinomio: ");
                        int grado2 = sc.nextInt();
                        polinomio1 = new Polinomio(grado2, termino6);
                        System.out.println("Polinomio 2 creado");
                        break;
                case 3:
                    if(polinomio1 != null && polinomio2 != null){
                        resultados = polinomio1.sumarPolinomios(polinomio1, polinomio2);
                        System.out.println("El resultado de la suma es: " + resultados);
                    }else{
                        System.out.println("Tiene que crear los polinomios antes de sumarlos");
                    }
                    break;
                case 4:
                    if(polinomio1 != null && polinomio2 != null){
                        resultados = polinomio1.multiplicarPolinomios(polinomio1, polinomio2);
                        System.out.println("El resultado de la multiplicación es: " + resultados);
                    }else{
                        System.out.println("Tiene que crear los polinomios antes de multiplicarlos");
                    }
                    break;
            }
        }






    }
}
