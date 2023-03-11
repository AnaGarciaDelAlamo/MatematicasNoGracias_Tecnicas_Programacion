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



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nodo aux = new Nodo();
        aux.info = "Primer nodo";
        String palabra = sc.nextLine();
        Nodo naux = aux;
        while (!palabra.equals("")) {
            Nodo nodo = new Nodo();
            nodo.info = palabra;
            naux.sig = nodo;
            naux = nodo;
            palabra = sc.nextLine();
        }
        while (aux != null) {
            System.out.println(aux.info);
            aux = aux.sig;
        }
    }
}