/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos:

a)  Método constructor con todos los atributos pasados por parámetro.

b)  Metodo constructor sin los atributos pasados por parámetro.

c)  Métodos get y set.

d)  Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
los atributos del objeto.

e)  Método sumar(): calcular la suma de los números y devolver el resultado al main.

f)  Método restar(): calcular la resta de los números y devolver el resultado al main

g)  Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si 
no, se hace la multiplicación y se devuelve el resultado al main

h)  Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
una división por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la división y se devuelve el resultado al main.
 */
package Operation;

import java.util.Scanner;

public class Operacion {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int numero1;
    private int numero2;

// CONSTRUCTORES:
    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

// GETTERS & SETTERS:
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

// METODOS & FUNCIONES:    
    public void crearOperacion() {     //VOID en lugar de INT porque no retorna nada, sólo asigna
        System.out.println("Ingrese 2 n°:");
        numero1 = leer.nextInt();      //puede ir el THIS. porque lo llamo desde la misma clase.
        numero2 = leer.nextInt();      //puede ir el THIS. porque lo llamo desde la misma clase.
    }

// SUMAR:
    public int sumar() {
        return numero1 + numero2;
    }

// RESTAR:
    public int restar() {
        return numero1 - numero2;
    }

// MULTIPLICAR:

    public int multiplicar() {
        if (numero1 == 0 || numero2 == 0) {    //puede ir el THIS. porque lo llamo desde la misma clase.
            int multiplicacion = 0;
            return multiplicacion;

        } else {

            int multiplicacion = numero1 * numero2;
            return multiplicacion;
        }
    }

// DIVIDIR:
    public int dividir() {
        if (numero1 == 0 || numero2 == 0) {    //puede ir el THIS. porque lo llamo desde la misma clase.
            int division = 0;
            return division;

        } else {

            int division = numero1 / numero2;
            return division;
        }
    }
}