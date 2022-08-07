/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. 

El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.

Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. 

Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
 */
package Main_Vectores;

import java.util.Arrays;
import java.util.Random;

public class Main_Vectores {

    public static void main(String[] args) {

      //DecimalFormat formato = new DecimalFormat("#.##");

        int[] vectorA = new int[50];

        String [] vectorB = new String[20];

        int[] vectorC = new int[20];

/// VECTOR A: LLLENAR y ESCRIBIR;
        System.out.println("Vector A:");
        for (int i = 0; i < 50; i++) {                                          //Recorremos VECTOR para Llenarlo e imprimirlo.-

            int valores = new Random().nextInt(100);                             //LLeno el vector de aleatorios.-

            vectorA[i] = valores;                                               //Asignamos un valor en la posición i del vector.-

            System.out.print("[" + vectorA[i] + "]");                           //SOUT sin ln para que imprima VECTOR horizontal.-
        //System.out.print("[" + formato.format(vectorA[i]) + "]");
        }
        System.out.println("\n");                                               //SOUT para bajar el BUIL PROJECT y dejar un espacio extra.-

/// ORDENAR VECTOR A: LLENAR y ESCRIBIR;
        System.out.println("Vector A: De menor a mayor:");
        
        Arrays.sort(vectorA,0,50);
        
        for (int i = 0; i < 50; i++) {
            
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println("\n");                                               //SOUT para bajar el BUIL PROJECT y dejar un espacio extra.-
  
/// VECTOR B:
        System.out.println("Vector B:");

        for (int i = 0; i < 20; i++) {
            
            if (i<10){
               
                vectorB[i] = Integer.toString(vectorA[i]);
                
            }else if(i>=10){
                
                vectorB[i] = "0.5";
            }
            System.out.print("[" + vectorB[i] + "]");
        }
        
        //System.out.println(Arrays.toString(vectorA));

        System.out.println ("\n");
    }
}