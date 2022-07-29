/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. 

En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, 
para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date.

Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay 
entre esa fecha y la fecha actual, que se puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Main_Date;

import Pack_Date.Class_Date;
import java.util.Scanner;

public class Main_Date {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Class_Date fechaActual = new Class_Date();
        Class_Date fechaUsuario = new Class_Date();

        System.out.println("Ingrese un dia:");
        fechaUsuario.dia = leer.nextInt();

        System.out.println("Ingrese un mes:");
        fechaUsuario.mes = leer.nextInt();

        System.out.println("Ingrese un año: '85, '90, '99...");
        fechaUsuario.anio = leer.nextInt();

        fechaUsuario.diferencia();
    }
}