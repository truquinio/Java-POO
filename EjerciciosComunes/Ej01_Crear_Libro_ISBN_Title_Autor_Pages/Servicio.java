
package ServicioLibro;

import Libreria.Libro;
import java.util.Scanner;

public class Servicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

/// FUNCIÓN PARA CREAR Y LLENAR CON INFO UN LIBRO:

    public Libro crearLibro() {

        System.out.println("Ingrese el ISBN del libro:");
        int Isbn = leer.nextInt();

        System.out.println("Ingrese el título del libro:");
        String Titulo = leer.next();

        System.out.println("Ingrese el autor del libro:");
        String Autor = leer.next();

        System.out.println("Ingrese el n° de páginas del libro:");
        int NumPaginas = leer.nextInt();

        return new Libro(Isbn, Titulo, Autor, NumPaginas);
    }
}