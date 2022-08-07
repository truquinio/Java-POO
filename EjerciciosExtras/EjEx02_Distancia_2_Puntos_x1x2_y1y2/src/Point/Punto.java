/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. 

Para conocer como calcular la distancia entre dos puntos consulte el siguiente link: 
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/
package Point;

import java.util.Scanner;

public class Punto {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

/// CONSTRUCTORES:
    public Punto() {
    }
    public Punto(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
/// G&S:
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

///PEDIR COORDENADAS:
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese coordenadas del 1er punto: ");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        System.out.println("Ingrese coordenadas del 2do punto: ");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
    }
    
///TEOREMA DE PITÁGORAS:
    public void pitagoras() {

        int x = x2 - x1;
        int y = y2 - y1;
        float distancia = (float) Math.sqrt(x * x + y * y);

        System.out.println("Distancia entre los 2 puntos: " + distancia + "\n");
    }    
}