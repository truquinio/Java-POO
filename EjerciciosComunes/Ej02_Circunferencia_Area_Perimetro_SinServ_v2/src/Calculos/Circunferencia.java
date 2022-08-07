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
package Calculos;

public class Circunferencia {

    private double radio;
    public double area;
    public double perimetro;

/// CONSTRUCTORES   //////////////////////////////////////////////////////////// 
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

/// GETTERS Y SETTERS   ////////////////////////////////////////////////////////
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

/// FUNCIÓN PARA CALCULAR ÁREA   ///////////////////////////////////////////////
    public double area() {
//      double area = (3.14 * radio * radio);
        area = Math.PI * Math.pow(radio,2);
        return area;
    }

/// FUNCIÓN PARA CALCULAR PERÍMETRO   //////////////////////////////////////////
    public double perimetro() {
//      double perimetro = (2 * 3.14 * radio);
        perimetro = (2 * Math.PI * radio);
        return perimetro;
    }

///    TO STRING     ///////////////////////////////////////////////////////////    

    @Override
    public String toString() {
        return "Circunferencia {" + "Radio: " + radio + ", Área: " + area() + ", Perímetro: " + perimetro() + '}';
    }
}