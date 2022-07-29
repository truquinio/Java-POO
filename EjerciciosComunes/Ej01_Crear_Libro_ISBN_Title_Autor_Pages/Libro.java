/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Libreria;

import java.util.Scanner;

public class Libro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

////    ATRIBUTOS     //////////////////////////////////////////////////////////  
    private int Isbn;
    private String Titulo;
    private String Autor;
    private int NumPaginas;

////    CONSTRUCTORES     //////////////////////////////////////////////////////  
    public Libro() {
    }

    public Libro(int Isbn, String Titulo, String Autor, int NumPaginas) {
        this.Isbn = Isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

////    GETTERS & SETTERS     ////////////////////////////////////////////////// 

    public int getIsbn() {
        return Isbn;
    }

    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }
    
////    TO STRING     ////////////////////////////////////////////////////////// 
    @Override
    public String toString() {
        return "Libro{" + "Isbn=" + Isbn + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + '}';
    }
}