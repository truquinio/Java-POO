/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. 

A continuación, se deben crear los siguientes métodos:
a)   Método constructor que inicialice el radio pasado como parámetro.
b)   Métodos get y set para el atributo radio de la clase Circunferencia.
c)   Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d)   Método area(): para calcular el área de la circunferencia (Area = Pi * radio2).
e)   Método perimetro(): para calcular el perímetro (Perímetro = 2 * Pi * radio).
*/

package Main_Circunferencia;

import Calculos.Circunferencia;

public class Main_Circunferencia {

    public static void main(String[] args) {
       
        Circunferencia circulo = new Circunferencia();
        circulo.setRadio(1.0);
        
        System.out.println(circulo.toString());
        System.out.println("");
    }
}