/*
1. EJERCICIO PERSONA
Crea tu propio proyecto con la clase Persona.

¿CÓMO CREAMOS OBJETOS?
Para llevar cierto orden, por cada uno de los ejercicios de esta guía crearemos un nuevo 
proyecto en NetBeans. 
Primero crearemos el proyecto:

Luego, necesitamos crear una clase. Una clase es un molde para crear múltiples objetos que 
encapsula datos y comportamiento. Una clase es una combinación específica de atributos y 
métodos y puede considerarse un tipo de dato de cualquier tipo no primitivo. 
Las clases deberán guardarse en un paquete llamado Entidad:

public class NombreClase {
// atributos
// constructores 
// metodos propios
}

2. EJERCICIO PERSONA – ATRIBUTOS
Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás sumarle 3 atributos 
que creas pertinentes.
 */
package Entidad;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
    public String nombre;
    public String apellido;
    public int dni;
     */
//  cambio los atributos de públicos a privados para meter SET y luego GET
    private String nombre;
    private String apellido;
    private int dni;

////    CONSTRUCTORES     //////////////////////////////////////////////////////
    public Persona() {      //Constructor vacío.-
    }

    public Persona(String nombre) {     //Constructor con un atributo.-
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido, int dni) {       //Constructor lleno.-
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

////    SETTERS     ////////////////////////////////////////////////////////////
    public void setNombre(String nombre) {

        if (nombre.length() > 3) {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {

        if (apellido.length() > 3) {
            this.apellido = apellido;
        }
    }

    public void setDni(int dni) {
        if (dni > 8) {
            this.dni = dni;
        }
    }

////    GETTERS     ////////////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }
    
    

////    TO STRING     //////////////////////////////////////////////////////////
    @Override
    public String toString() {      //Puedo mostrar todos los atributos en un sólo mensaje.-

        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
}