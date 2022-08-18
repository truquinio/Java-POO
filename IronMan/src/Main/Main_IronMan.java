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

Además, Tony tiene un generador, el cual le sirve para salvarle la vida en cada instante de tiempo 
alejando las metrallas de metal de su corazón y también para alimentar de energía a la armadura. 

La batería a pesar de estar en el pecho de Tony, es considerada como parte de la armadura. 

La armadura también posee una consola en el casco, a través de la cual JARVIS le 
escribe información a Iron Man. En el casco también se encuentra un sintetizador por 
donde JARVIS susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron 
Man (botas, guantes, consola y sintetizador) tienen un consumo de energía asociado.
 */
package Main;

import Armadura.Armor;
import Armadura.Boots;
import Armadura.Gloves;
import Armadura.Target;
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

        //Objeto para objetivos:
        Target objetivos = new Target();

        //VECTOR de OBJETIVOS para RADAR:
        Target vectorObjetivos[] = new Target[(int) (Math.random() * 10) + 1];  //Dimensiono el vector
        objetivos.crearObjetivos(vectorObjetivos);  //CREANDO LOS OBJETIVOS

//______________________________________________________________________________
        int opcion;

        do {
            System.out.println("¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯ ¯\n");
            System.out.println("Sr. Stark, elija una opción: ☻\n");
            System.out.println("1. Caminar.");
            System.out.println("2. Correr."); //Pedir tiempo
            System.out.println("3. Propulsar."); //Pedir tiempo
            System.out.println("4. Volar."); //Pedir tiempo
            System.out.println("5. Estado armadura.");
            System.out.println("6. Estado batería.");
            System.out.println("7. Información reactor.");
            System.out.println("8. Radar v1.0.");
            System.out.println("9. Simulador.");
            System.out.println("10. Disparar.");

            //  System.out.println("11. Acciones Evasivas.");
            opcion = leer.nextInt();
            int intensidad = 10;
            int tiempo;

            switch (opcion) {

                case 1:
                    System.out.println("\n¿Cuánto tiempo desea caminar?");
                    tiempo = leer.nextInt();

                    System.out.println("");
                    
                    jarvis.caminar(intensidad, tiempo, botaIzq, botaDer);

                    jarvis.consumoSistema();

                    System.out.println("");

                    break;

                case 2:
                    System.out.println("\n¿Cuánto tiempo desea correr?");
                    tiempo = leer.nextInt();

                    System.out.println("");

                    jarvis.correr(intensidad, tiempo, botaIzq, botaDer);

                    jarvis.consumoSistema();

                    System.out.println("");

                    break;

                case 3:
                    System.out.println("\n¿Cuánto tiempo desea propulsarse?");
                    tiempo = leer.nextInt();

                    System.out.println("");

                    jarvis.propulsar(intensidad, tiempo, botaIzq, botaDer);

                    jarvis.consumoSistema();

                    System.out.println("");

                    break;

                case 4:
                    System.out.println("\n¿Cuánto tiempo desea volar?");
                    tiempo = leer.nextInt();

                    System.out.println("");

                    jarvis.volar(intensidad, tiempo, botaIzq, botaDer, guanteIzq, guanteDer);

                    jarvis.consumoSistema();

                    System.out.println("");

                    break;

                case 5:
                    System.out.println("");

                    jarvis.mostrarEstado(botaIzq, botaDer, guanteIzq, guanteDer);

                    jarvis.consumoSistema();

                    jarvis.estadoDeLaBateria();

                    System.out.println("");

                    break;

                case 6:
                    System.out.println("");
                    
                    jarvis.estadoDeLaBateria();

                    System.out.println("");

                    break;

                case 7:
                    System.out.println("");
                    
                    jarvis.infoReactor();

                    System.out.println("");

                    break;

                case 8:
                    System.out.println("");
                    
                    objetivos.radar(vectorObjetivos);

                    System.out.println("");

                    break;

                case 9:
                    System.out.println("\nIngrese la cant. de objetivos a simular:");
                    Target simularObjetivos[] = new Target[leer.nextInt()];  //Dimensiono el vector
                    
                    System.out.println("");
                    
                    objetivos.crearObjetivos(simularObjetivos);             //CREANDO LOS OBJETIVOS
                    objetivos.radar(simularObjetivos);

                    System.out.println("");

                    break;

                case 10:
                    //chequearStatus(broken, destroyed);

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
