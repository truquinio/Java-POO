/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. 

Para conocer como calcular la distancia entre dos puntos consulte el siguiente link: 
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Main_Punto;

import Point.Punto;
import java.util.Scanner;

public class Main_Punto {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

///DECLARO LAS VARIABLES:
    //    int x, y, x1, x2, y1, y2;
    //    double distancia;

        Punto points = new Punto();
        
        points.crearPuntos();
        
        System.out.println("");
        
        points.pitagoras();
    }
}