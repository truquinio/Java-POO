/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

public class Main_Persona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Instanciación usando constructor vacío:
        Persona persona1 = new Persona();

        //Instanciación usando constructor por parámetros:
        Persona persona2 = new Persona("Mariano", "Ugarte", 12345678);  //CTRL + <espacio> para agregar atributos
        
        System.out.println("print persona2: " + persona2);
        System.out.println("");
        
        //persona2.nombre = "Mariano"
        persona2.setNombre("Federico");  // Cambio los atributos con un SET<ATRIBUTO> siempre que haya un SET en Persona
        persona2.setApellido("Trucco");  // y los atributos de esa entidad sean privados.

        System.out.println("Cambio de nombre: " + persona2.getNombre() + ", Cambio de apellido: " + persona2.getApellido() + ", DNI: " + persona2.getDni());
        System.out.println("");
        
        System.out.println("persona2 con toString: " + persona2);
        System.out.println("");
        
        // Debemos instanciar un objeto del tipo Servicio para acceder a sus métodos
        PersonaService persServicio = new PersonaService();
        
        // Alojamos el retorno del método en un objeto tipo Persona
        Persona persona3 = persServicio.crearPersona();
        
        System.out.println("");
        System.out.println(persona3);
        System.out.println("");
    }
}