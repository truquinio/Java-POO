/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́  definir 
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y 
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además 
definir los métodos getters y setters correspondientes.
 */
package Main_Cancion;

import Song.Cancion;
import java.util.Scanner;

public class Main_Cancion {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cancion music = new Cancion();
        
        System.out.println(music.toString());
        
        System.out.println("");
        
        System.out.println("Ingrese título de la canción:");
        music.setTitulo(leer.nextLine());
        
        System.out.println("Ingrese el autor de la canción:");
        music.setAutor(leer.nextLine());
        
        System.out.println("");
        
        System.out.println(music.toString());
        
        System.out.println("");
    }
}