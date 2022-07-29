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

e)    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.

f)   Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.

g)   Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Main_Frase;

import Pack_Cadena.Cadena;
import java.util.Scanner;

public class Main_Frase {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cadena fraseUsuario = new Cadena();

//Pido frase y seteo el valor x defecto (del constructor) x la nueva frase del usuario
        System.out.println("Ingrese una palabra o frase:");
        fraseUsuario.setFrase(leer.nextLine().toLowerCase());

//Seteo la longitud de la frase:
        fraseUsuario.setLongitud(fraseUsuario.getFrase().length());
        
        int opcion;

        do {
            System.out.println("");
            System.out.println("Ingrese una opción:");
            System.out.println("1. Mostrar vocales.");
            System.out.println("2. Invertir frase.");
            System.out.println("3. Letra repetida.");
            System.out.println("4. Comparar longitud.");
            System.out.println("5. Unir frases.");
            System.out.println("6. Reemplazar caracter.");
            System.out.println("7. Contiene letra.");
            System.out.println("0. Salir.");

            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("1. Mostrar vocales:");
                    fraseUsuario.mostrarVocales();
                    break;

                case 2:
                    System.out.println("2. Invertir frase:");
                    fraseUsuario.invertirFrase();
                    break;

                case 3:
                    System.out.println("3. Letra repetida:");
                    System.out.println("Ingrese una letra:");
                    String letra = leer.next();
                    System.out.println("El caracter '" + letra + "' se repite " + fraseUsuario.vecesRepetido(letra) + " veces.");
                    break;

                case 4:
                    System.out.println("4. Comparar longitud:");
                    System.out.println("Ingrese una frase nueva:");
                    String fraseB = leer.next();
                    fraseUsuario.compararLongitud(fraseB);
                    break;

                case 5:
                    System.out.println("5. Unir frases:");
                    System.out.println("Ingrese una frase nueva:");
                    String fraseC = leer.next().toLowerCase();
                    fraseUsuario.unirFrases(fraseC);
                    break;

                case 6:
                    System.out.println("6. Reemplazar caracter:");
                    System.out.println("Ingrese un caracter:");
                    String caracter = leer.next();
                    fraseUsuario.reemplazar(caracter);
                    break;

                case 7:
                    System.out.println("7. Contiene letra:");
                    System.out.println("Ingrese una letra:");
                    String letra2 = leer.next();
                    fraseUsuario.contiene(letra2);
                    break;

                case 0:
                    System.out.println("\nSaliendo...\nVuelva pronto.\n");
                    break;
            }
        } while (opcion != 0);
    }
}