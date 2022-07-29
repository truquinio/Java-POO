/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una 
ecuación de 2do grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 

Hay que insertar estos 3 valores para construir el objeto a través de un método 
constructor. Luego, las operaciones que se podrán realizar son las siguientes:

•  Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 

•  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 

•  Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 

•  Método obtenerRaices(): llama a tieneRaíces() y si devolvió́  true, imprime las 2 posibles 
soluciones. 

•  Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́  true imprime una única raíz. Es 
en el caso en que se tenga una única solución posible. 

•  Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. 

Nota: Formula ecuación 2do grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package Root;

import java.util.Scanner;

public class Raices {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int a;
    private int b;
    private int c;

///CONSTRUCTORES:
    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
///G & S:
    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

///DISCRIMINANTE:
    public double getDiscriminante() {
        return (b * b) - 4 * a * c;
    }

///TIENE RAÍCES:
    public boolean tieneRaices() {

        if (getDiscriminante() > 0) {
            
            return true;
            
        } else {

            return false;
        }
    }
///TIENE RAIZ:

    public boolean tieneRaiz() {

        if (getDiscriminante() == 0) {
            
            return true;
        } else {
            
            return false;
        }
    }

///OBTENER RAÍCES:
    public void obtenerRaices() {

        if (tieneRaices() == true) {
            
            System.out.println((-b + Math.sqrt((getDiscriminante())) / (2 * a)));
            System.out.println((-b - Math.sqrt((getDiscriminante())) / (2 * a)));

        } else {

            System.out.println("No tiene 2 raíces.");
        }
    }

///OBTENER RAIZ:
    public void obtenerRaiz() {

        if (tieneRaiz() == true) {

            System.out.println((-b / (2 * a)));

        } else {
            System.out.println("No tiene una sola raíz.");
        }
    }

    /*
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. 
     */
///CALCULAR TODO:
    public void calcular() {

        if (tieneRaices()) {

            obtenerRaices();

        } else if (tieneRaiz()) {
            obtenerRaiz();

        } else {

            System.out.println("No tiene raíces.");
        }
    }
}