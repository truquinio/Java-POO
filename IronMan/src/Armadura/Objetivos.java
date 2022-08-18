/*
♦ Radar Versión 1.0: JARVIS posee también incorporado un sistema que usa ondas electromagnéticas para 
medir distancias, altitudes, ubicaciones de objetos estáticos o móviles como:
aeronaves barcos, vehículos motorizados, formaciones meteorológicas y por su puesto enemigos 
de otro planeta. 

Su funcionamiento se basa en emitir un impulso de radio, que se refleja en el objetivo y 
se recibe típicamente en la misma posición del emisor.  

Las ubicaciones de los objetos están dadas por las coordenadas X, Y y Z. Los objetos 
pueden ser marcados o no como hostiles. JARVIS también puede detectar la resistencia 
del objeto, y puede detectar hasta 10 objetos de manera simultánea.  

JARVIS puede calcular la distancia a la que se encuentra cada uno de los objetos, para 
esto siempre considera que la armadura se encuentra situada en la coordenada (0,0,0).
Hacer un método que informen a qué distancia se encuentra cada uno de los enemigos. 

Usar la clase Math de Java. 

♦ Simulador: Hacer un método en JARVIS que agregue en radar objetos, hacer que la resistencia, las 
coordenadas y la hostilidad sean aleatorios utilizando la clase random. Utilizar la clase 
Random.

¿Qué ocurre si quiero añadir más de 10 objetos? 
¿Qué ocurre si cuando llevo 8 enemigos aumento la capacidad del vector? 

♦ Destruyendo Enemigos: Desarrollar un método para que JARVIS que analice todos los objetos del radar y si son 
hostiles que les dispare. El alcance de los guantes es de 5000 metros, si el objeto se 
encuentra fuera de ese rango no dispara.

JARVIS al detectar un enemigo lo atacará hasta destruirlo, la potencia del disparo es 
inversamente  proporcional  a  la  distancia  al  a  que  se  encuentra  el  enemigo  y  se 
descontará de la resistencia del enemigo.  El enemigo se considera destruido si su 
resistencia es menor o igual a cero. 

JARVIS solo podrá disparar si el dispositivo está sano y si su nivel de batería lo permite. 
Si tiene los dos guantes sanos podrá disparar con ambos guantes haciendo más daño.  
Resolver utilizando un for each para recorrer el arreglo y un while para destruir al enemigo.

♦ Acciones Evasivas: Desarrollamos un método para que JARVIS que analice todos los objetos del radar y si 
son hostiles que les dispare. Modificar ese método para que si el nivel de batería es 
menor al 10% se corten los ataques y se vuelve lo suficientemente lejos para que el 
enemigo no nos ataque. Deberíamos alejarnos por lo menos 10 km enemigo. Tener en 
cuenta que la velocidad de vuelo promedio es de 300 km / hora. 
 */
package Armadura;

import java.util.Arrays;

public class Objetivos {

    public String[] nombreObjetivos = {"Aeronaves", "Barcos", "Vehículos motorizados", "Form. meteorológicas", "Aliens"};

//ATRIBUTOS con los RANDOM:    
    public int tipoObjetivo;
    public int estatico;
    public int hostilidad;
    public int resistencia;
    public int posicionX;
    public int posicionY;
    public int posicionZ;

//CONSTR:
    public Objetivos() {
    }

///CREAR OBJETIVOS:     
    public void crearObjetivos(Objetivos vectorObjetivos[]) {

        for (int i = 0; i < (vectorObjetivos.length); i++) {

            //vectorObjetivos[i] = new Target();
        //  vectorObjetivos[i].tipoObjetivo = vectorObjetivos[i].nombreObjetivos[(int) (Math.random() * nombreObjetivos.length)];
            vectorObjetivos[i].estatico = (int) (Math.random() * 2);
            vectorObjetivos[i].hostilidad = (int) (Math.random() * 2);
            vectorObjetivos[i].resistencia = (int) (Math.random() * 100);
            vectorObjetivos[i].posicionX = (int) (Math.random() * 10000);
            vectorObjetivos[i].posicionY = (int) (Math.random() * 10000);
            vectorObjetivos[i].posicionZ = (int) (Math.random() * 10000);
        }
    }

///CALCULAR DISTANCIA 2D PITÁGORAS para DISTANCIA en PLANO 2D (ejes X,Y)
    public float distanciaXY() {

        //PITÁGORAS: √(catetoX² + catetoY²)      
        float distancia2D = (float) Math.sqrt((posicionX * posicionX) + (posicionY * posicionY));

        return distancia2D;
    }
///CALCULAR DISTANCIA 3D PITÁGORAS para DISTANCIA en PLANO 3D (ejes X,Y,Z)

    //Paso x parámetro el objeto "OBJETIVOS" desde MAIN.-
    public float distanciaXYZ() {

        //PITÁGORAS: √(catetoXY² + catetoZ²)   
        float distancia3D = (float) Math.sqrt((Math.pow(distanciaXY(), 2)) + (Math.pow(posicionZ, 2)));

        return distancia3D;
    }

///RANDOM:
    public void random(Objetivos vectorRandom) {
        
        for (int i = 0; i < tipoObjetivo; i++) {    //Vector.lenght           
            
           // vectorRandom[i] = nota; // Llenamos el vector
        }
    }

///RADAR V1.0:
    public void radar(Objetivos vectorObjetivos[], Objetivos objetivos) {

        System.out.println("\nObjetivos encontrados: " + vectorObjetivos.length + "\n");

        for (int i = 0; i < (vectorObjetivos.length); i++) {

            vectorObjetivos[i] = new Objetivos();

            System.out.println("Objetivo #" + (i + 1));

            //System.out.println("Tipo de objetivo: " + objetivos.nombreObjetivos + "\n");
            if (objetivos.estatico == 1) {

                System.out.println("Movilidad: Móvil.");

            } else {
                System.out.println("Movilidad: Estático.");
            }

            if (objetivos.hostilidad == 1) {
                //   String hostil = Integer.toString(estatico);

                System.out.println("Hostilidad: Hostil.");

            } else {
                System.out.println("Hostilidad: No hostil.");
            }

            System.out.println("Resistencia: " + objetivos.resistencia + " ♥");

            System.out.println("Distancia: " + distanciaXY() + " mts.");
            System.out.println("Altura: " + distanciaXYZ() + " mts.\n");
        }
    }
}

/*switch (i + 1) {

                case 1:
                    System.out.println("Tipo: Aeronave");
                    break;

                case 2:
                    System.out.println("Tipo: Barcos");
                    break;

                case 3:
                    System.out.println("Tipo: Vehículo motorizado");
                    break;

                case 4:
                    System.out.println("Tipo: Form. meteorológica");
                    break;

                case 5:
                    System.out.println("Tipo: Alien");
                    break;
            }*/
