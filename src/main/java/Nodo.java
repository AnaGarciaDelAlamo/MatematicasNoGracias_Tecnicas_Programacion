import java.util.Scanner;

public class Nodo {
    String info;
    Nodo sig;

    public Nodo(String info){
        this.info = info;
        this.sig = null;
    }

    public Nodo(String valor, Nodo sig){
        this.info = valor;
        this.sig = sig;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nodo aux = new Nodo("Primer nodo");
        Nodo naux = aux;
        String palabra = sc.nextLine();
        while(!palabra.isEmpty()){
            Nodo nodo = new Nodo(palabra);
            naux.sig = nodo;
            naux = nodo;
            palabra = sc.nextLine();
        }
        while(aux != null){
            System.out.println(aux.info);
            aux = aux.sig;
        }



    }
}