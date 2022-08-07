/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:

•  Constructor predeterminado o vacío
•  Constructor con la capacidad máxima y la cantidad actual 
•  Métodos getters y setters.
•  Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
•  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
•  Método vaciarCafetera(): pone la cantidad de café actual en cero.  
•  Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Coffee_Maker;

import java.util.Scanner;

public class Cafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int capacidadMaxima;
    private int cantidadActual;

/// CONSTRUCTORES:
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

/// GETTERS & SETTERS:
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

/// FUNCIÓN CREAR CAFETERA:
    public void crearCafetera() {

        System.out.println("Ingrese capacidad máxima de la cafetera: (En ml)");
        capacidadMaxima = leer.nextInt();

        do {
            System.out.println("Ingrese cantidad actual de café:");
            cantidadActual = leer.nextInt();

            System.out.println("");
            System.out.println("Cap. máxima: " + capacidadMaxima);
            System.out.println("Cant. actual: " + cantidadActual);
            System.out.println("");

        } while (cantidadActual > capacidadMaxima);
    }

/// FUNCIÓN LLENAR CAFETERA:
    public void llenarCafetera() {
        
    if (capacidadMaxima < cantidadActual){    
        
        System.out.println("Se sobrellenó la cafetera.");
        
    }else{
        cantidadActual = capacidadMaxima;
        System.out.println("Cant. actual: " + cantidadActual);
        
    }
    
    
    }

//  SERVIR TAZA:
    public void servirTaza() {
        System.out.println("Cant. actual: " + cantidadActual);

        System.out.println("");

        System.out.println("Ingrese capacidad de la taza: (En ml)");
        int taza = leer.nextInt();

        System.out.println("");

        if (taza <= cantidadActual) {
            System.out.println("Se sirvió la taza entera");

            cantidadActual -= taza;

            System.out.println("Cant. actual: " + cantidadActual);

        } else {
            System.out.println("No alcanza para llenar la taza");
            System.out.println("Se llenó la taza con " + this.cantidadActual + " de café");
            cantidadActual = 0;
        }
    }

// VACIAR CAFETERA:
    public void vaciarCafetera() {

        cantidadActual = 0;

        System.out.println("Cant. actual: " + cantidadActual);
    }

// AGREGAR CAFÉ:
    public void agregarCafe(int Cafe) {

        if (Cafe > 0) {
            cantidadActual += Cafe;
        } else {
            System.out.println("Agregue café.");
        }
        System.out.println("Cant. actual: " + cantidadActual);
    }
}