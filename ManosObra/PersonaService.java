package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
////    MÉTODO CREAR PERSONA     ///////////////////////////////////////////////
    public Persona crearPersona() {

        // Instanciamos un objeto persona con sus atributos vacíos
        Persona personaCompleta = new Persona();

        // Pedimos al usuario que ingrese la informacion
        // que se alojará en el atributo por consola
        System.out.println("Ingrese el nombre de la persona");

        // Utilizamos el objeto para invocar al método SET
        //Y con el Scanner recibimos la información
        personaCompleta.setNombre(leer.next());    
        
// este método retorna un objeto persona son sus atributos
        // 1lenos de información
        return personaCompleta;
    }    
}