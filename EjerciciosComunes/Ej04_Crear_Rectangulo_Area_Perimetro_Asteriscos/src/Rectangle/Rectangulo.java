/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Rectangle;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int base;
    private int altura;

// CONSTRUCTORES:
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

// GETTERS & SETTERS:
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

// MÉTODOS / FUNCIONES:
    public void crearRectangulo() {
        System.out.println("Ingrese base y altura del rectángulo:");
        base = leer.nextInt();
        altura = leer.nextInt();
    }

// CALCULAR AREA:
    public int area() {
        return base * altura;
    }

// CALCULAR PERÍMETRO:
    public int perimetro() {
        return (base + altura) * 2;
    }

// DIBUJAR RECTÁNGULO con ****:
    public void imprimirRectangle() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                if (i == 0 || j == 0 || i == (altura-1) || j == (base-1)){
                System.out.print("* ");
                
                }else{
                    
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}