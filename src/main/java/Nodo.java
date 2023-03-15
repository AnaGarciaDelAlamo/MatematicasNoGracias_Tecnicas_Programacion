/*Traduce esto que esta en python a java:
class Nodo(object):
"""Clase nodo simplemente enlazado"""

info, sig = None, None

aux = Nodo()
aux.info = "Primer nodo"
palabra = input("Ingrese una palabra: ")
naux = aux
while (palabra != ""):
    nodo = Nodo()
    nodo.info = palabra
    naux.sig = nodo
    naux = nodo
    palabra = input("Ingrese una palabra: ")

while(aux is not None):
    print(aux.info)
    aux = aux.sig
 */


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