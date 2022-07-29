/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. 

En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, 
para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date.

Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay 
entre esa fecha y la fecha actual, que se puede conseguir instanciando un objeto Date 
con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ej11_date_;

import java.util.Date;
import java.util.Scanner;

public class Ej11_Date_ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int dia, mes, anio;
        
        System.out.println("Ingrese día de nacimiento:");
        dia = leer.nextInt();
        
        System.out.println("Ingrese mes de nacimiento:");
        mes = leer.nextInt();
        
        System.out.println("Ingrese año de nacimiento:");
        anio = leer.nextInt() - 1900;
        
        Date fechaUser = new Date(anio, mes - 1, dia);
        
        System.out.println("");
        System.out.println("Fecha ingresada: " + fechaUser);
        
        Date fechaActual = new Date();
        
        System.out.println("Fecha actual: " + fechaActual);
        
        System.out.println("");
        
        int diferencia = fechaUser.getYear() - fechaActual.getYear();
        System.out.println("diferencia: " + (diferencia * - 1) + " años.\n");     
    }
}