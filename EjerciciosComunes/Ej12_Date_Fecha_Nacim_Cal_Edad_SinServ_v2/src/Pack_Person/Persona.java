/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento 
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 

•  Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.

•  Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra 
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.

•  Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.

 */
package Pack_Person;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private int dia;
    private int mes;
    private int anio;
    private int edad;

//CONSTRUCTORES:
    public Persona() {
    }

    public Persona(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

//GETTERS && SETTERS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

//CREAR PERSONA:
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Parametros: nombre, fechaNacimiento
        System.out.println("Ingrese nombre del sujeto:");
        nombre = leer.nextLine();

        System.out.println("Ingrese día de nacimiento:");
        dia = leer.nextInt();

        System.out.println("Ingrese mes de nacimiento:");
        mes = leer.nextInt();

        System.out.println("Ingrese un año: '85, '90, '99...");
        anio = leer.nextInt();

        return new Persona(nombre, dia, mes, anio);
    }

//CALCULAR EDAD:
    public void calcularEdad() {

        Date fechaActual = new Date();
        Date fechaNacimiento = new Date(getAnio(), getMes() - 1, getDia());                  //Debo restar uno al mes, porque si no pasa al siguiente.-

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");            //Importo el formato de la fecha: dd/mm/yyyy.-

        System.out.println("Fecha Nacim: " + fechaNacimiento);

        String fechaActual_str = formatoFecha.format(fechaActual);                               //Aplico el formato a fecha1.-
        String fechaNacimiento_str = formatoFecha.format(fechaNacimiento);                               //Aplico formato a fecha2.-

        System.out.println("\n_ " + fechaActual_str);                              //Imprimo la fecha1.-
        System.out.println("  " + fechaNacimiento_str + "\n");                         //Impromo la fecha2.-

        long resta = (fechaActual.getTime() - fechaNacimiento.getTime());                   //Hago la resta de fechas.-

        edad = (int) Math.floor((resta / (1000 * 60 * 60 * 24) / 365));       //Al resultado en miliseg la divido *1000ms *60segundos *60minutos y *24hs / 365 días. 

        System.out.println(nombre + " tiene: " + edad + " años.\n"); //Imprimo la diferencia.-
    
    }

//MENOR QUE:
    public boolean menorQue(int edad2) {
               
        if (edad2 < edad) {

            return true;

        } else {

            return false;
        }
    }

    @Override
    public String toString() {
        return "Sujeto: " + nombre + ", nació el: " + dia + "/" + mes + "/" + anio + ", su edad es: " + edad + " años." +'}';
    }
}