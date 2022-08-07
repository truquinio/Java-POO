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
Si no es correcto se deberá mostrar un mensaje.

•  Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)).
- Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1.
- Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. 
- Si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
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
package Sujeto;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//  Parametros: nombre, edad, sexo, peso y altura
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;

//  CONSTRUCTORES:
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

//  GETTERS & SETTERS:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

// CALCULAR IMC:
    public float calcularIMC() {

        float imc = peso / (altura * altura);  //peso /(altura * altura)

        if (imc < 20) {                     //Si resultado es un valor menor que 20:
            System.out.println("IMC Sujeto " + nombre + ": " + imc + " = Está por debajo de su peso ideal.");
            return -1;                      //La persona está por debajo de su peso ideal y la función devuelve un -1.

        } else if (imc >= 20 && imc <= 25) { //Si resultado es un número entre 20 y 25 (incl):
            System.out.println("IMC Sujeto " + nombre + ": " + imc + " = Está en su peso ideal.");
            return 0;                       //La persona está en su peso ideal y la función devuelve un 0. 

        } else {                            //Si resultado es un valor mayor que 25:
            System.out.println("IMC Sujeto " + nombre + ": " + imc + " = Tiene sobrepeso.");
            return 1;                       //La persona tiene sobrepeso, y la función devuelve un 1.  
        }
    }

//MAYOR DE EDAD:
    public boolean esMayorDeEdad() {

        return edad >= 18;
    }
}
