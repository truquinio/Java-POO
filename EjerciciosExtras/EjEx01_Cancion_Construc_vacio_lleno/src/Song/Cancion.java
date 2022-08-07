/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá definir 
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y 
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además 
definir los métodos getters y setters correspondientes.
 */
package Song;

import java.util.Scanner;

public class Cancion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String titulo;
    private String autor;
    
//CONSTRUCTORES:

    public Cancion() {
        this.titulo = " ";
        this.autor = " ";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
//GETTERS & SETTERS:

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Canción {" + "titulo: " + titulo + ", autor: " + autor + '}';
    }
}


