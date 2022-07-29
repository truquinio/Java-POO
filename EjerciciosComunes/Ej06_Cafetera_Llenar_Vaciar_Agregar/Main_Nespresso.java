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
package Main_Nespresso;

import Coffee_Maker.Cafetera;
import java.util.Scanner;

public class Main_Nespresso {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cafetera coffee = new Cafetera();
        
        coffee.crearCafetera();
        
        int opcion;

        do {
            System.out.println("");
            System.out.println("Ingrese una opción:");
            System.out.println("1. Llenar cafetera.");
            System.out.println("2. Servir taza.");
            System.out.println("3. Vaciar cafetera.");
            System.out.println("4. Agregar café.");
            System.out.println("0. Salir.");

            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("1. Llenar:");
                    coffee.llenarCafetera();
                    break;

                case 2:
                    System.out.println("2. Servir:");
                    coffee.servirTaza();
                    break;

                case 3:
                    System.out.println("3. Vaciar:");
                    coffee.vaciarCafetera();
                    break;

                case 4:
                    System.out.println("4. Ingrese cant. de café.:");
                    coffee.agregarCafe(leer.nextInt());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    System.out.println("Vuelva pronto.");
                    break;
            }
        } while (opcion != 0);

        System.out.println("");
    }
}
