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
package Math;

import static java.lang.Math.max;

public class Matematica {

    private float num1;
    private float num2;

//CONSTRUCTORES:
    public Matematica() {
    }

    public Matematica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

//GETTERS & SETTERS:
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    //ToSTRING:
    @Override
    public String toString() {
        return "N° aleatorios: {" + "num1 = " + num1 + ", num2 = " + num2 + '}';
    }

//DEVOLVER MAYOR:
    public int devolverMayor() {

        int numeroMayor = 0;

        numeroMayor = (int) max(num1, num2);

        return numeroMayor;
    }

//CALCULAR POTENCIA:    / Math. round (num) / Math.pow(num)
    public void calcularPotencia() {

        //Calculo e imprimo los valores redondeados de c/ número:
        System.out.println("Redondeo Num1: " + Math.round(num1));  //num1 = Math.round(num1);
        System.out.println("Redondeo Num2: " + Math.round(num2)); //num2 = Math.round(num2);

        if (Math.round(num1) > Math.round(num2)) {

            int potencia = (int) Math.pow(Math.round(num1), Math.round(num2));
            System.out.println("\nPotencia = " + potencia + "\n");

        } else {

            int potencia = (int) Math.pow(Math.round(num2), Math.round(num1));
            System.out.println("\nPotencia = " + potencia + "\n");
        }
    }

//CALCULAR RAIZ:  / Math.abs(num) / Math.sqrt(num)
    public void calculaRaiz() {

    //Calculo e imprimo los valores absolutos de c/ número:
        int valMinimo = (int) Math.abs(Math.min(num1, num2));
        
        System.out.println("Valor Absoluto Num1: " + Math.abs(num1));  //num1 = Math.abs(num1);
        System.out.println("Valor Absoluto Num2: " + Math.abs(num2)); //num2 = Math.abs(num2);
    
    //Calculo e imprimo Raiz cuadrada del número menor:
        double raizValMinimo = Math.sqrt(valMinimo);
        
        System.out.println("La raiz cuadrada del N° menor es: " + raizValMinimo);
    }
}