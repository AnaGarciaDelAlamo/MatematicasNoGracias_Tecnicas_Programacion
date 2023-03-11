/*traduce este programa en python a java:
class DatoPolinomio(object):
"""Clase dato polinomio"""

def_init_(self, valor, termino):
"""Crea un dato polinomio con valor y termino"""
self.valor = valor
self.termino = termino

 */

import java.util.Scanner;

public class DatoPolinomio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DatoPolinomio dato = new DatoPolinomio();
        System.out.println("Ingrese el valor del polinomio");
        dato.valor = sc.nextInt();
        System.out.println("Ingrese el termino del polinomio");
        dato.termino = sc.nextInt();
    }
}