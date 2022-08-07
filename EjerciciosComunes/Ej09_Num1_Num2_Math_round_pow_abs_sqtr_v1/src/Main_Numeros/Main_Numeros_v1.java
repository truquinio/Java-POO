/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. 

En el main se creará el objeto y se usará el Math.random para generar los dos números
y se guardaran en el objeto con su respectivos set. 

Deberá además implementar los siguientes métodos:
a)   Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b)   Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c)   Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.

Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Main_Numeros;

import Math.Matematica;
import java.util.Scanner;

public class Main_Numeros_v1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Matematica numUsuario = new Matematica();
        
        numUsuario.setNum1((float) (Math.random() * 10));
        numUsuario.setNum2((float) (Math.random() * 10));

        System.out.println(numUsuario.toString());
        System.out.println("");

        numUsuario.devolverMayor();
        numUsuario.calcularPotencia();
        numUsuario.calculaRaiz();
    }
}