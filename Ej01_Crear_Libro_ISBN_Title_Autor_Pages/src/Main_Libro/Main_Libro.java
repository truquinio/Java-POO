/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Main_Libro;

import Libreria.Libro;
import ServicioLibro.Servicio;


public class Main_Libro {

    public static void main(String[] args) {

        Servicio ServicioLibro = new Servicio();
        
        Libro Libro1 = ServicioLibro.crearLibro();
        
        System.out.println(Libro1);
    }
}
