/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. 

El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.

Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. 

Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
 */
package Arrays;

public class Vector {
    
    private int longitud;
    private float valores;
    
//CONSTRUCTORES:

    public Vector() {
    }

    public Vector(int longitud, float valores) {
        this.longitud = longitud;
        this.valores = valores;
    }

//GETTERS & SETTERS:

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public float getValores() {
        return valores;
    }

    public void setValores(float valores) {
        this.valores = valores;
    }
    
//ToSTRING:

    @Override
    public String toString() {
        return "Vector: {" + " Longitud = " + longitud + ", valores = " + valores + '}';
    }
}