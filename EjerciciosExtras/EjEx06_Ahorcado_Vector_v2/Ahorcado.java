/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los 
parámetros que sean necesarios: 

• Constructores, tanto el vacío como el parametrizado. 

• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con 
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el 
valor que ingresó el usuario y encontradas en 0. 

• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
buscar como se usa el vector.length. 

• Método buscar(letra):  este método recibe una letra dada por el usuario y busca sila 
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. 

• Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades. 

• Método intentos(): para mostrar cuantas oportunidades le queda al jugador. 

• Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main. 
 
Un ejemplo de salida puede ser así: 
Ingrese una letra: 
a 
Longitud de la palabra: 6 
Mensaje: La letra pertenece a la palabra 
Número de letras (encontradas, faltantes): (3,4) 
Número de oportunidades restantes: 4 
---------------------------------------------- 
Ingrese una letra: 
z 
Longitud de la palabra: 6 
Mensaje: La letra no pertenece a la palabra 
Número de letras (encontradas, faltantes): (3,4) 
Número de oportunidades restantes: 3 
--------------------------------------------- 
Ingrese una letra: 
b 
Longitud de la palabra: 6 
Mensaje: La letra no pertenece a la palabra 
Número de letras (encontradas, faltantes): (4,3) 
Número de oportunidades restantes: 2 
---------------------------------------------- 
Ingrese una letra: 
u 
Longitud de la palabra: 6 
Mensaje: La letra no pertenece a la palabra 
Número de letras (encontradas, faltantes): (4,3) 
Número de oportunidades restantes: 1 
---------------------------------------------- 
Ingrese una letra: 
q 
Longitud de la palabra: 6 
Mensaje: La letra no pertenece a la palabra 
Mensaje: Lo sentimos, no hay más oportunidades
 */
package Hanged;

import java.util.Scanner;

public class Ahorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String[] palabra;
    private int letras_encontradas;
    private int jugadas_maximas;

//Adicional no lo pide el ejercicio
    private String[] letras_acertadas;

///CONSTRUCTORES:
    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letras_encontradas, int jugadas_maximas) {
        this.palabra = palabra;
        this.letras_encontradas = letras_encontradas;
        this.jugadas_maximas = palabra.length;
    }

///CREAR JUEGO:
    public void crearJuego() {

        System.out.println("Ingrese una palabra: ");
        String palabra_ingresada = leer.nextLine();

        palabra = new String[palabra_ingresada.length()];

        letras_encontradas = 0;

        System.out.println("Ingrese la cantidad de jugadas maximas: ");
        jugadas_maximas = leer.nextInt();

        for (int i = 0; i < palabra_ingresada.length(); i++) {

            palabra[i] = palabra_ingresada.substring(i, i + 1);
        }

//Adicional no lo pide:
        letras_acertadas = new String[palabra_ingresada.length()];

        for (int i = 0; i < palabra_ingresada.length(); i++) {
            letras_acertadas[i] = "_ ";
        }
    }

///LONGITUD:
    public void longitud() {
        System.out.println("\nLongitud de la palabra: " + palabra.length + " letras.\n");
    }

///BUSCAR:
    public void buscar(char letra) {

        boolean letra_encontrada = false;

        for (int i = 0; i < palabra.length; i++) {

            if (palabra[i].equals(String.valueOf(letra))) {

                letra_encontrada = true;

                break;
            }
        }
        if (letra_encontrada) {
            
            System.out.println("\nLa letra pertenece a la palabra\n");
            
        } else {
            
            System.out.println("\nLa letra no pertenece a la palabra\n");
        }
    }

///LETRAS ENCONTRADAS:
    public boolean encontradas(char letra) {

        int cantidad_letras_encontradas = 0;

        for (int i = 0; i < palabra.length; i++) {

            if (palabra[i].equals(String.valueOf(letra))) {

                cantidad_letras_encontradas++;

//Adicional no lo pide:
        letras_acertadas[i] = String.valueOf(letra) + " ";
            }
        }
        
        if (cantidad_letras_encontradas == 0) {
            jugadas_maximas -= 1;
        }
        letras_encontradas += cantidad_letras_encontradas;
        System.out.println("Letras totales encontradas: " + letras_encontradas);
        System.out.println("Letras faltantes: " + (palabra.length - letras_encontradas));

//Adicional no lo pide el ejercicio
        System.out.println("\nLetras acertadas: " + String.join("", letras_acertadas));

        return cantidad_letras_encontradas > 0;
    }

///INTENTOS:
    public void intento() {
        System.out.println("\nQuedan " + jugadas_maximas + " intentos");
    }

///JUEGO:
    public void juego() {
        crearJuego();
        longitud();

        do {
            
            System.out.println("Ingrese una letra: ");
            char letra = leer.next().charAt(0);
            buscar(letra);
            encontradas(letra);
            intento();
            System.out.println("\n----------------------------------------------------\n");
            
        } while (jugadas_maximas > 0 && letras_encontradas < palabra.length);

        if (letras_encontradas == palabra.length) {
            
            System.out.println("¡GANASTE!\n");
            
        } else {
            
            System.out.println("PERDISTE\n");
        }
    }
}