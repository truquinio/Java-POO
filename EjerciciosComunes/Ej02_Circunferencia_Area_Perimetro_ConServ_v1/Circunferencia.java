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
    private double area;
    private double perimetro;

/// CONSTRUCTORES   ////////////////////////////////////////////////////////////
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

/// GETTERS Y SETTERS   ////////////////////////////////////////////////////////
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

////    TO STRING     //////////////////////////////////////////////////////////
   @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
}