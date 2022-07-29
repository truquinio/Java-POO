/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a)   Método constructor que inicialice el radio pasado como parámetro.
b)   Métodos get y set para el atributo radio de la clase Circunferencia.
c)   Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d)   Método area(): para calcular el área de la circunferencia (Area = Pi * radio2).
e)   Método perimetro(): para calcular el perímetro (Perímetro = 2 * Pi * radio).
 */
package ServicioCircunferencia;

import Calculos.Circunferencia;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

/// FUNCIÓN PARA CREAR Y LLENAR CON INFO LA CIRCUNFERENCIA:
    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese el radio de la circunferencia:");
        double radio = leer.nextDouble();
        
//      double area = (3.14 * radio * radio);
        double area = Math.PI * Math.pow(radio,2);

//      double perimetro = (2 * 3.14 * radio);
        double perimetro = (2 * Math.PI * radio);
        
        System.out.println("El radio de la circunferencia es: " + radio);
        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
        
        return new Circunferencia();
    }   
}