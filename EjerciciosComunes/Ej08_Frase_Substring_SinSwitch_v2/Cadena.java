/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. 

En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser 
una palabra o varias palabras separadas por un espacio en blanco y a través de los métodos set, 
se guardará la frase y la longitud de manera automática según la longitud de la frase ingresada. 

Deberá además implementar los siguientes métodos:

a)   Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada.

b)   Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

c)   Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
-   Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

d)   Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.

e)   Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.

f)   Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.

g)   Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Pack_Cadena;

import java.util.Scanner;

public class Cadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String frase;
    private int longitud;

//CONSTRUCTORES:
    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

// GETTERS & SETTERS:
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

//MOSTRAR VOCALES:
    public void mostrarVocales() {

        int contador = 0;

        for (int i = 0; i < longitud; i++) {

            if ((frase).substring(i, i + 1).equals("a") || (frase).substring(i, i + 1).equals("e") || (frase).substring(i, i + 1).equals("i") || (frase).substring(i, i + 1).equals("o") || (frase).substring(i, i + 1).equals("u")) {

                contador++;
            }
        }
        System.out.println("Cant. de vocales: " + contador);
    }

//INVERTIR FRASE:
    public void invertirFrase() {

        System.out.println("Frase/Palabra invertida: ");

        //Invierto el FOR desde el final de la frase -1 hasta 0 y pongo i--
        for (int i = longitud - 1; i >= 0; i--) {
            System.out.print((frase).substring(i, i + 1));
        }
        System.out.println("");
    }

//LETRA REPETIDA:
    public int vecesRepetido(String letra1) {

        int repetida = 0;

        for (int i = 0; i < longitud; i++) {

            if ((frase).substring(i, i + 1).equals(letra1)) {

                repetida++;
            }
        }
        return repetida;
    }

// COMPARAR LONGITUD:
    public void compararLongitud(String fraseB) {

        if (fraseB.length() == longitud) {

            System.out.println("Ambas frases tienen la misma longitud.");

        } else {

            System.out.println("Las frases tienen diferente longitud.");
        }
    }

//  UNIR FRASES:
    public void unirFrases(String fraseC) {
        //Elimina todos los espacios, pero no los tabuladores ni retornos
        System.out.println(frase.replace(" ", "") + fraseC.replace(" ", ""));
    }

// REEMPLAZAR CARACTER:
    public void reemplazar(String caracter) {

        System.out.println(frase.replace("a", caracter));

        /*  Otra forma:     
        for (int i = 0; i < longitud; i++) {
            if ((frase).substring(i, i + 1).equals("a")) {
                System.out.print(caracter);
            } else {
                System.out.print((frase).substring(i, i + 1));
            }
        }
        System.out.println("");*/
    }

// CONTIENE:
    public void contiene(String letra2) {

        System.out.println("¿Contiene la letra: '" + letra2 + "'? " + frase.contains(letra2));

        /*  Otra forma:    
        public boolean contiene(String letra2) {
        boolean retorno = false;
        for (int i = 0; i < longitud; i++) {
            if ((frase).substring(i, i + 1).equals(letra2)) {
                retorno = true; 
            }
        }
        return retorno; */
    }
}