/*
En esta primera etapa con una armadura podremos: caminar, correr, propulsar, volar, 
escribir y leer.

•  Al caminar la armadura hará un uso básico de las botas y se consumirá la energía 
establecida como consumo en la bota por el tiempo en el que se camine.

•  Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la 
energía establecida como consumo en la bota por el tiempo en el que se corra. 

•  Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la 
energía por el tiempo que dure la propulsión. 

• Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal 
consumiendo el triple de la energía establecida para las botas y el doble para los 
guantes. 

•  Al utilizar los guantes como armas el consumo se triplica durante el tiempo del 
disparo.

•  Al utilizar las botas para caminar o correr el consumo es normal durante el tiempo 
que se camina o se corra.

•  Cada vez que se escribe en la consola o se habla a través del sintetizador se consume 
lo establecido en estos dispositivos. Solo se usa en nivel básico. 

• Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le 
pasa  el  nivel  de  intensidad  y  el  tiempo.  El  dispositivo  debe  retornar  la  energía 
consumida  y  la  armadura  deberá  informar  al  generador  que se  ha  consumido  esa 
cantidad de energía.  

Modele las clases, los atributos y los métodos necesarios para poder obtener un modelo 
real de la armadura y del estado de la misma. 

♦ Mostrando Estado: Hacer un método que JARVIS muestre el estado de todos los dispositivos y toda la 
información de la Armadura. 

♦ Estado de la Batería: Hacer un método para que JARVIS informe el estado de la batería en porcentaje
a través de la consola. Poner como carga máxima del reactor el mayor float posible. Ejecutar 
varias acciones y mostrar el estado de la misma. 

♦ Mostrar Información del Reactor: Hacer un método para que JARVIS informe el estado del reactor en 
otras dos unidades de medida. Hay veces en las que Tony tiene pretensiones extrañas.
Buscar en Wikipedia la tabla de transformaciones. 



 */
package Armadura;

import static java.lang.Float.MAX_VALUE;  //Importación, para trabajar con valores máximos.-

public class Armor {

///PARÁMETROS
    public int energiaMaxArm = (int) MAX_VALUE;         //Mayor int posible
    public int energiaActual = (int) MAX_VALUE;         //Mayor int posible
    public int consumoBase = 100000;
    public int resistenciaArm = 100;
    public int saludArm = 100;
    public int consumoSistema = 10;
    public float cargaMaxReactor = MAX_VALUE;           //Mayor int posible

///OBJETOS a usar:______________________________________________________________
    Boots botas = new Boots();
    Gloves guantes = new Gloves();
    Check propulsores = new Check();
    Check repulsores = new Check();

///CONSTR:______________________________________________________________________
    public Armor() {
    }

///CAMINAR:_____________________________________________________________________
//Paso x parámetros INTENSIDAD, TIEMPO, BOTAIZQ, BOTADER desde MAIN.-
    public void caminar(int intensidad, int tiempo, Boots botaIzq, Boots botaDer) {

        //Paso x parámetros BROKEN y DESTROYED desde clase CHECK.-
        if (propulsores.chequearStatus(botaIzq.broken, botaIzq.destroyed) || propulsores.chequearStatus(botaDer.broken, botaDer.destroyed)) {

            System.out.println("Imposible caminar: Uno o más propulsores dañados o destruídos. Ø");

        } else {

            int energiaConsum = (intensidad * consumoBase) * tiempo;

            System.out.println("Energía inicial: " + energiaActual);

            energiaActual -= energiaConsum * 2;         // x2 piernas;

            System.out.println("Energía consumida: " + energiaConsum);
            System.out.println("Energía actual dps caminar: " + energiaActual);

            botas.dañoBotas(botaIzq, botaDer);      //Calcula si se rompieron o no.- (Viene de clase BOOTS)

            botas.repararBotas(botaIzq, botaDer);   //Calcula si se rompieron o no.- (Viene de clase BOOTS)
        }
    }

///CORRER:______________________________________________________________________
    //Paso x parámetros INTENSIDAD, TIEMPO, BOTAIZQ, BOTADER desde MAIN.- 
    public void correr(int intensidad, int tiempo, Boots botaIzq, Boots botaDer) {

        //Paso x parámetros BROKEN y DESTROYED desde clase CHECK.-
        if (propulsores.chequearStatus(botaIzq.broken, botaIzq.destroyed) || propulsores.chequearStatus(botaDer.broken, botaDer.destroyed)) {

            System.out.println("Imposible correr: Uno o más propulsores dañados o destruídos. Ø");

        } else {

            //Intensidad x2: NORMAL, consumo x2: DOBLE.-
            int energiaConsum = (((intensidad * 2) * consumoBase) * 2) * tiempo;

            System.out.println("Energía inicial: " + energiaActual);

            energiaActual -= energiaConsum * 2;  // x2 piernas;

            System.out.println("Energía consumida: " + energiaConsum);
            System.out.println("Energía actual dps caminar: " + energiaActual);

            botas.dañoBotas(botaIzq, botaDer);      //Calcula si se rompieron o no.- (Viene de clase BOOTS)

            botas.repararBotas(botaIzq, botaDer);   //Calcula si se rompieron o no.- (Viene de clase BOOTS)
        }
    }

///PROPULSAR:___________________________________________________________________
    //Paso x parámetros INTENSIDAD, TIEMPO, BOTAIZQ, BOTADER desde MAIN.-
    public void propulsar(int intensidad, int tiempo, Boots botaIzq, Boots botaDer) {

        //Paso x parámetros BROKEN y DESTROYED desde clase CHECK.-
        if (propulsores.chequearStatus(botaIzq.broken, botaIzq.destroyed) || propulsores.chequearStatus(botaDer.broken, botaDer.destroyed)) {

            System.out.println("Imposible propulsar: Uno o más propulsores dañados o destruídos. Ø");

        } else {

            //Intensidad x3: INTENSIVO, consumo x3: TRIPLE.-
            int energiaConsum = (((intensidad * 3) * consumoBase) * 3) * tiempo;

            System.out.println("Energía inicial: " + energiaActual);

            energiaActual -= energiaConsum * 2;

            System.out.println("Energía consumida: " + energiaConsum);
            System.out.println("Energía actual dps caminar: " + energiaActual);

            botas.dañoBotas(botaIzq, botaDer);      //Calcula si se rompieron o no.- (Viene de clase BOOTS)

            botas.repararBotas(botaIzq, botaDer);   //Calcula si se rompieron o no.- (Viene de clase BOOTS)
        }
    }

///VOLAR:_______________________________________________________________________
    //Paso x parámetros INTENSIDAD, TIEMPO, BOTAIZQ, BOTADER desde MAIN.-
    public void volar(int intensidad, int tiempo, Boots botaIzq, Boots botaDer, Gloves guanteIzq, Gloves guanteDer) {

        //Paso x parámetros BROKEN y DESTROYED desde clase CHECK.-
        if (propulsores.chequearStatus(botaIzq.broken, botaIzq.destroyed) || propulsores.chequearStatus(guanteIzq.broken, guanteIzq.destroyed) || propulsores.chequearStatus(botaDer.broken, botaDer.destroyed) || propulsores.chequearStatus(guanteDer.broken, guanteDer.destroyed)) {

            System.out.println("Imposible volar: Uno o más dispositivos están dañados o destruídos. Ø");

        } else {
            //Intensidad x3: INTENSIVO, consumo x3: TRIPLE + Intensidad x2: NORMAL, consumo x2: DOBLE.-
            int energiaConsum = ((((intensidad * 3) * consumoBase) * 3) + (((intensidad * 2) * consumoBase) * 2) * tiempo);

            System.out.println("Energía inicial: " + energiaActual);

            energiaActual -= energiaConsum * 4;  // x2 piernas + x2 guantes

            System.out.println("Energía consumida: " + energiaConsum);
            System.out.println("Energía actual dps volar: " + energiaActual);

            botas.dañoBotas(botaIzq, botaDer);      //Calcula si se rompieron o no.- (Viene de clase BOOTS)
            botas.repararBotas(botaIzq, botaDer);   //Calcula si se rompieron o no.- (Viene de clase BOOTS)
            guantes.dañoGuantes(guanteIzq, guanteDer);      //Calcula si se rompieron o no.- (Viene de clase GLOVES)
            guantes.repararGuantes(guanteIzq, guanteDer);   //Calcula si se rompieron o no.- (Viene de clase GLOVES)
        }
    }

///DISPARAR:____________________________________________________________________
    //Paso x parámetros INTENSIDAD, TIEMPO, BOTAIZQ, BOTADER desde MAIN.-
    public void disparar(int intensidad, int tiempo, Boots guanteIzq, Boots guanteDer) {

        //Paso x parámetros BROKEN y DESTROYED desde clase CHECK.-
        if (repulsores.chequearStatus(guanteIzq.broken, guanteIzq.destroyed) && repulsores.chequearStatus(guanteDer.broken, guanteDer.destroyed)) {

            System.out.println("Imposible disparar: ambos repulsores están dañados o destruídos. Ø");

        } else {

            //Consumo x3: TRIPLE
            int energiaConsum = (consumoBase * 3) * tiempo;

            System.out.println("Energía inicial: " + energiaActual);

            energiaActual -= energiaConsum;

            System.out.println("Energía consumida: " + energiaConsum);
            System.out.println("Energía actual dps caminar: " + energiaActual);
        }
    }

//CONSUMO SISTEMA:______________________________________________________________
    public void consumoSistema() {

        //  System.out.println("Energía actual sin consola: " + energiaActual);
        energiaActual -= consumoSistema;

        System.out.println("Consumo consola/sintetizador: " + energiaActual + " J");
    }

///MOSTRAR ESTADO:______________________________________________________________
    public void mostrarEstado(Boots botaIzq, Boots botaDer, Gloves guanteIzq, Gloves guanteDer) {

        System.out.println("Energía Actual: " + energiaActual + " J");
        System.out.println("Resistencia armadura: " + resistenciaArm + " HR");
        System.out.println("Salud armadura: " + saludArm + " ♥");

        if (propulsores.chequearStatus(botaIzq.broken, botaIzq.destroyed) == false) {

            System.out.println("Estado propulsor izquierdo: OK ☺");

        } else {

            System.out.println("Estado propulsor izquierdo: Destruido Ø");
        }

        if (propulsores.chequearStatus(botaDer.broken, botaDer.destroyed) == false) {

            System.out.println("Estado propulsor derecho: OK ☺");

        } else {

            System.out.println("Estado propulsor derecho: Destruido Ø");
        }

        if (repulsores.chequearStatus(guanteIzq.broken, guanteIzq.destroyed) == false) {

            System.out.println("Estado repulsor izquierdo: OK ☺");

        } else {

            System.out.println("Estado repulsor izquierdo: Destruido Ø");
        }

        if (repulsores.chequearStatus(guanteDer.broken, guanteDer.destroyed) == false) {

            System.out.println("Estado repulsor derecho: OK ☺");

        } else {

            System.out.println("Estado repulsor derecho: Destruido Ø");
        }
        
        System.out.println("Potencia reactor: " + cargaMaxReactor + " J");
        //System.out.println("¿Propulsor izquierdo dañado/destruido? " + propulsores.chequearStatus(botaIzq.broken, botaIzq.destroyed));
        //System.out.println("¿Propulsor derecho dañado/destruido? " + propulsores.chequearStatus(botaDer.broken, botaDer.destroyed));
        //System.out.println("¿Repulsor izquierdo dañado/destruido? " + repulsores.chequearStatus(guanteIzq.broken, guanteIzq.destroyed));
        //System.out.println("¿Repulsor derecho dañado/destruido? " + repulsores.chequearStatus(guanteDer.broken, guanteDer.destroyed));
    }

///BATERÍA:
    public void estadoDeLaBateria() {
        
        System.out.println("Batería al " + (((float)energiaActual * 100) / energiaMaxArm) + " %");    //Pongo LONG para que no muestre 0% (sino se va de rango)
        //System.out.println("Porcentaje de Batería: " + (((energiaActual * 100) / energiaMaxArm) + 100 + "%."));
    }
    
///MOSTRAR REACTOR:
    public void infoReactor(){
        
        System.out.println("Carga máxima reactor: " + cargaMaxReactor + " J");
        System.out.println("Energía actual reactor/armadura: " + energiaActual + " J");
        System.out.println("Carga reactor: " + energiaActual / 3600000 + " KW/h");
        System.out.println("Carga reactor: " + energiaActual / 4184 + " KCal");
    }
    
    
}


/*

    public String colorPrim = "rojo";
    public String colorSec = "amarillo";
    public int energiaMaxArm = 2147483647;
    public int energiaActual = 2147483647;
    public int consumoBase = 20;
    public int resistenciaArm = 100;
    public int saludArm = 100;
    public int consumoSistema = 10;




    caminar        
    correr        
    propulsar                
    volar                
    leer                        
    escribir        
    disparar        
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
