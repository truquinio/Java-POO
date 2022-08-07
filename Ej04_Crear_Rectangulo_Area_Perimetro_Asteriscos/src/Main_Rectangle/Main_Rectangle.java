/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
base y un atributo privado altura. 

La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, 
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Main_Rectangle;

import Rectangle.Rectangulo;

public class Main_Rectangle {

    public static void main(String[] args) {
        
    Rectangulo rectangle1 = new Rectangulo();    
        
        rectangle1.crearRectangulo();
        System.out.println("");
        
        System.out.println("Perímetro: " + rectangle1.perimetro());
        System.out.println("Área: " + rectangle1.area());
        System.out.println("");
        
        rectangle1.imprimirRectangle();
        System.out.println("");
    }
}