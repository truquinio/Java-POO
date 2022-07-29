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
package Entidad;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fecha;
  //  private int edad;

///CONSTRUCTORES:
    public Persona() {
    }

    public Persona(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Persona(String nombre, Date fecha, int edad) {
        this.nombre = nombre;
        this.fecha = fecha;
     //   this.edad = edad;
    }

///GET & SET:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
/*
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }*/

///CREAR PERSONA:
    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int dia, mes, anio;

        System.out.println("Ingrese nombre de la persona:");
        nombre = leer.nextLine();

        System.out.println("Ingrese día de nacimiento:");
        dia = leer.nextInt();

        System.out.println("Ingrese mes de nacimiento:");
        mes = leer.nextInt() - 1;

        System.out.println("Ingrese año de nacimiento:");
        anio = leer.nextInt() - 1900;

//Creo objeto fechaPersona para mostrarla por pantalla:        
        Date fechaPersona = new Date(anio, mes, dia);
        fecha = fechaPersona;
        
        System.out.println("");
        System.out.println("Fecha ingresada: " + fechaPersona);

        return new Persona(nombre, fecha);
    }

///CALCULAR EDAD:
    public int calcularEdad() {

        Date fechaActual = new Date();

        System.out.println("");

        System.out.println(fecha);
        System.out.println(fechaActual);
        
        
        int diferencia = fecha.getYear() - fechaActual.getYear();
        int edad;
                
        System.out.println(diferencia * -1);
        
        return edad = diferencia * -1;
    }

///MENOR QUE:
    public boolean menorQue(int edad2) {

        if (edad2 < calcularEdad()) {

            return true;

        } else {

            return false;
        }
    }

///MOSTRAR PERSONA:
    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fecha);
    }
}