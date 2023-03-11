/*traduce este codigo de python a java:
class Polinomio(object):
"""Clase polinomio"""

def_init_(self):
    """Crea un polinomio de grado cero"""
    self.termino_mayor = None
    self.grado = -1

def agregar_termino(polinomio, termino, valor):
"""Agrega un termino y su valor al polinomio"""
aux = Nodo()
dato = DatoPolinomio(valor, termino)
aux.info = dato
if(termino > polinomio.grado):
    aux.sig = polinomio.termino_mayor
    polinomio.termino_mayor = aux
    polinomio.grado = termino
else:
    actual = polinomio.termino_mayor
    while(actual.sig in not None and termino < actual.sig.info.termino)
       actual = actual.sig
    aux.sig = actual.sig
    actual.sig = aux

def modificar_termino(polinomio, termino, valor):
"""Modificar un termino del polinomio"""
aux = polinomio.termino_mayor
while(aux is not None and aux.info.termino != termino):
    aux = aux.sig
  aux.info.valor = valor

  def obtener_valor(polinomio, termino):
  """Devuelve el valor de un termino del polinomio"""
  aux = polinomio.termino_mayor
  while(aux is not None and aux.info.termino > termino):
      aux = aux.sig
  if(aux is not None and aux.info.termino == termino):
        return aux.info.valor
    else:
        return 0


def mostrar(polinomio):
"""Muestra el polinomio"""
aux = polinomio.termino_mayor
pol = ''
if(aux is not None):
    while(aux is not None):
        signo = ''
        if(aux.info.valor >= 0):
            signo += '+'
        pol += signo + str(aux.info.valor) + 'x^' + str(aux.info.termino)
        aux = aux.sig
return pol

def sumar(polinomio1, polinomio2):
"""Suma dos polinomios y devuelve el resultado"""
paux = Polinomio()
mayor = polinomio1 if(polinomio1.grado > polinomio2.grado) else polinomio2
for i in range(0, mayor.grado+1):
    total = obtener_valor(polinomio1, i) + obtener_valor(polinomio2, i)
    if(total != 0):
          agregar_termino(paux, i, total)
return paux

def multiplicar(polinomio1, polinomio2):
"""Multiplica dos polinomios y devuelve el resultado"""
paux = Polinomio()
pol1 = polinomio1.termino_mayor
while(pol1 is not None):
    pol2 = polinomio2.termino_mayor
    while(pol2 is not None):
        termino = pol.info.termino + pol2.info.termino
        valor = pol.info.valor * pol2.info.valor
        if(obtener_valor(paux, termino) != 0):
          valor += obtener_valor(paux, termino, valor)
        else:
          agregar_termino(paux, termino, valor)
        pol2 = pol2.sig
    pol1 = pol1.sig
return paux


 */

import java.util.Scanner;

public class Polinomio {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polinomio polinomio = new Polinomio();
        System.out.println("Ingrese el valor del polinomio");
        polinomio.valor = sc.nextInt();
        System.out.println("Ingrese el termino del polinomio");
        polinomio.termino = sc.nextInt();
    }
}



