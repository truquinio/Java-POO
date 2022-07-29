/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:

•  Un constructor por defecto.
•  Un constructor con todos los atributos como parámetro.
•  Métodos getters y setters de cada atributo.

•  Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
•  Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 

•  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package Main_Persona;

import Sujeto.Persona;
import Pack_Servicio.Class_Servicio;
import java.util.Scanner;

public class Main_Persona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Llamo al servicio:
        Class_Servicio Pack_Servicio = new Class_Servicio();

//Defino cantidad de personas: Ej, 4 personas
        int num = 2;

//Vectores para Persona, IMC y si es mayor de edad
        Persona[] personasCreadas = new Persona[num];
        
        float[] imc = new float[num];  //Vector IMC
        
        boolean[] mayorDeEdad = new boolean[num];

        for (int i = 0; i < num; i++) {
            personasCreadas[i] = Pack_Servicio.crearPersonas();

            imc[i] = personasCreadas[i].calcularIMC();

            mayorDeEdad[i] = personasCreadas[i].esMayorDeEdad();
        }

//Calculo porcentaje de personas:
        int porcentajeDebajo = 0;
        int porcentajePesoIdeal = 0;
        int porcentajePorEncima = 0;
        int porcentajeMayorDeEdad = 0;
        int porcentajeMenorDeEdad = 0;

        for (int i = 0; i < num-1; i++) {

            if (imc[i] == -1) {
                porcentajeDebajo++;

            } else if (imc[i] == 0) {
                porcentajePesoIdeal++;

            } else if (imc[i] == 1) {
                porcentajePorEncima++;
            }

            if (mayorDeEdad[i]) {
                porcentajeMayorDeEdad++;
            } else {
                porcentajeMenorDeEdad++;
            }
        }

//Muestro porcentaje de personas
        System.out.println("");
        System.out.println("Personas debajo de peso ideal: " + (porcentajeDebajo * 100 / num) + "%");
        System.out.println("Personas en peso ideal: " + (porcentajePesoIdeal * 100 / num) + "%");
        System.out.println("Personas encima de peso ideal: " + (porcentajePorEncima * 100 / num) + "%");
        System.out.println("Personas mayores de edad: " + (porcentajeMayorDeEdad * 100 / num) + "%");
        System.out.println("Personas menores de edad: " + (porcentajeMenorDeEdad * 100 / num) + "%");
        System.out.println("");
    }
}
