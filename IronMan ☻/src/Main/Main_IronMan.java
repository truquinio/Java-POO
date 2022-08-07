/*
El objetivo de JARVIS es que analice intensivamente toda la información de la armadura 
y del entorno y en base a esto tome decisiones inteligentes. 

En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele 
toda la información y las acciones que pueden efectuarse con la Armadura de Iron Man.  

Las  armaduras  de  Stark  se  encuentran  definidas  por  un  color  primario  y  un color 
secundario. Se encuentran compuestas de dos propulsores, uno en cada bota; y dos 
repulsores, uno en cada guante (los repulsores se utilizan también como armas). Tony los 
utiliza en su conjunto para volar.

La armadura tiene un nivel de resistencia, que depende del material con el que está 
fabricada, y se mide con un número entero cuya unidad de medida de dureza es 
Rockwell (https://es.wikipedia.org/wiki/Dureza_Rockwell). 

Todas las armaduras poseen un nivel de salud el cual se mide de 0 a 100.  
Además, Tony tiene un generador, el cual le sirve para salvarle la vida en cada instante de tiempo alejando las metrallas de metal de 
su corazón y también para alimentar de energía a la armadura. La batería a pesar de estar 
en el pecho de Tony, es considerada como parte de la armadura. 

La armadura también posee una consola en el casco, a través de la cual JARVIS le 
escribe información a Iron Man. En el casco también se encuentra un sintetizador por 
donde JARVIS susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron 
Man (botas, guantes, consola y sintetizador) tienen un consumo de energía asociado.
 */
package Main;

import IronMan.Armor;
import IronMan.Boots;
import IronMan.Console;
import IronMan.Gloves;
import java.util.Scanner;

public class Main_IronMan {

    public static void main(String[] args) {

///OBJETOS a usar:
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Armor jarvis = new Armor();

        //Objs para botas:
        Boots botaIzq = new Boots();
        Boots botaDer = new Boots();
        botaIzq.nombre = "izquierdo";
        botaDer.nombre = "derecho";

        //Objs para guantes:
        Gloves guanteIzq = new Gloves();
        Gloves guanteDer = new Gloves();
        guanteIzq.nombre = "izquierdo";
        guanteDer.nombre = "derecho";

        //Obj para consola:
        Console consola = new Console();
//______________________________________________________________________________

        int opcion;

        do {
            System.out.println("\nSr. Stark, ¿Qué desea hacer? ☻\n");
            System.out.println("1. Caminar.");
            System.out.println("2. Correr."); //Pedir tiempo
            System.out.println("3. Propulsar."); //Pedir tiempo
            System.out.println("4. Volar."); //Pedir tiempo
            System.out.println("5. Disparar.");
            System.out.println("6. Mostrar estado.");
            //  System.out.println("6a. Estado de la batería.");
            //  System.out.println("6b. Mostrar información del reactor.");
            System.out.println("7. Radar v1.0.");
            //  System.out.println("7a. Simulador.");
            //  System.out.println("7b. Destruir enemigos.");
            //  System.out.println("7c. Acciones Evasivas.");

            opcion = leer.nextInt();
            int intensidad = 10;
            int tiempo;

            switch (opcion) {

                case 1:
                    System.out.println("¿Cuánto tiempo desea caminar?");
                    tiempo = leer.nextInt();

                    jarvis.caminar(intensidad, tiempo, botaIzq, botaDer);

                    jarvis.consumoSistema();

                    break;

                case 2:
                    System.out.println("¿Cuánto tiempo desea correr?");
                    tiempo = leer.nextInt();

                    jarvis.correr(intensidad, tiempo, botaIzq, botaDer);

                    jarvis.consumoSistema();
//                    
                    break;

                case 3:
                    System.out.println("¿Cuánto tiempo desea propulsarse?");
                    tiempo = leer.nextInt();

                    jarvis.propulsar(intensidad, tiempo, botaIzq, botaDer);

                    jarvis.consumoSistema();

                    break;

                case 4:
                    System.out.println("¿Cuánto tiempo desea volar?");
                    tiempo = leer.nextInt();

                    jarvis.volar(intensidad, tiempo, botaIzq, botaDer, guanteIzq, guanteDer);

                    jarvis.consumoSistema();

                    break;

            }
        } while (opcion != 0);
    }
}


/*
    caminar        
    correr        
    propulsar                
    volar                
    leer                        
    escribir        
    atacar        
    mostrarEstado
    estadoReactor
    sufrirDanio
    repararDanio
    revisarTodo
    radar
    simulador                        
    destruirEnemigos                
    accionesEvasivas            
 */
