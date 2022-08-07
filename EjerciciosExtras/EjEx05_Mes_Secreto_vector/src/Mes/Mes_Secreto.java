/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga 
los doce meses del año, en minúsculas.

A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array
(por ejemplo, mesSecreto = mes[9]. 

El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar 
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  Un 
ejemplo de ejecución del programa podría ser este:

Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero 
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto

¡Ha acertado!
 */
package Mes;

import java.util.Scanner;

public class Mes_Secreto {
    
    private Scanner scanner = new Scanner(System.in);
    
///PARÁMETROS:
    private String[] vector = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = vector[(int) (Math.random() * 12)];
    private String mesUsuario;
    
///CONST:
    public Mes_Secreto() {
    }
    public Mes_Secreto(String mesUsuario) {
        this.mesUsuario = mesUsuario;
    }

///ADIVINAR MES SECRETO:
    public void adivinarMesSecreto(){
        
        do {
            System.out.println("Adivine el mes secreto:");
            mesUsuario = scanner.nextLine();
            
            if (mesUsuario.equalsIgnoreCase(mesSecreto)) {
                
                System.out.println("¡Ha acertado!\n");
                
            } else {
                
                System.out.println("No ha acertado. Pruebe con otro mes:\n");
            }
        } while (!mesUsuario.equalsIgnoreCase(mesSecreto));
    }
}