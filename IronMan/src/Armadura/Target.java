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

♦ Destruyendo Enemigos: Desarrollar un método para que JARVIS que analice todos los objetos del 
radar y si son hostiles que les dispare. El alcance de los guantes es de 5000 metros, si el 
objeto se encuentra fuera de ese rango no dispara.

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

public class Target {

//ATRIBUTOS:    
    public String tipoObjetivo;
    public boolean estatico;
    public boolean hostilidad;
    public int posicionX;
    public int posicionY;
    public int posicionZ;

///Plantilla VECTORES con posibles VALORES según los ATRIBUTOS:
    public String[] nombreObjetivos = {"Aeronave", "Barco", "Vehículo motorizado", "Form. meteorológica", "Alien"};

    public boolean[] staticMove = {true, false};    //VECTOR para ESTÁTICO.-

    public boolean[] hostil = {true, false};        //VECTOR para HOSTIL.-

    public int resistencia;

///CONSTR:
    public Target() {
    }

///ASIGNAR ATRIBUTOS A OBJETIVOS:
    //Paso x parámetro el objeto "OBJETIVOS" desde MAIN.-
    public void crearObjetivos(Target vectorObjetivos[]) {

        for (int i = 0; i < (vectorObjetivos.length); i++) {

            //Igualo VECTOR: Para la posición [i], CREAR nuevo TARGET.-
            vectorObjetivos[i] = new Target();

            //LLENO VECTORES con MATH.RANDOM: Asisgno ATRIBUTOS a los OBJETOS.-
            vectorObjetivos[i].tipoObjetivo = nombreObjetivos[(int) (Math.random() * nombreObjetivos.length)];

            vectorObjetivos[i].estatico = staticMove[(int) (Math.random() * 2)]; //RANDOM ESTÁTICO o MÓVIL

            vectorObjetivos[i].hostilidad = hostil[(int) (Math.random() * 2)];   //RANDOM HOSTILIDAD

            vectorObjetivos[i].resistencia = (int) (Math.random() * 100);        //RANDOM RESISTENCIA

            vectorObjetivos[i].posicionX = (int) (Math.random() * 10000);        //RANDOM DISTANCIA X

            vectorObjetivos[i].posicionY = (int) (Math.random() * 10000);        //RANDOM DISTANCIA Y

            vectorObjetivos[i].posicionZ = (int) (Math.random() * 10000);        //RANDOM DISTANCIA Z
        }
    }

///CALCULAR DISTANCIA 2D PITÁGORAS para DISTANCIA en PLANO 2D (ejes X,Y)
    //Paso x parámetro el objeto "OBJETIVOS" desde MAIN.-
    public float distanciaXY(Target objetivos) {

        //PITÁGORAS: √(catetoX² + catetoY²)                                                                             //  /|
        return (float) Math.sqrt((posicionX * posicionX) + (posicionY * posicionY));    // /_|

    }
///CALCULAR DISTANCIA 3D PITÁGORAS para DISTANCIA en PLANO 3D (ejes X,Y,Z)

    //Paso x parámetro el objeto "OBJETIVOS" desde MAIN.-
    public float distanciaXYZ(Target objetivos) {

        //PITÁGORAS: √(catetoXY² + catetoZ²)   
        return (float) Math.sqrt(Math.pow(distanciaXY(objetivos), 2) + (Math.pow(posicionZ, 2))); // /_|
    }

///RADAR V1.0:
    public void radar(Target vectorObjetivos[]) {

        System.out.println("\nCantidad de objetivos encontrados: " + vectorObjetivos.length + "\n");

        for (int i = 0; i < vectorObjetivos.length; i++) {

            System.out.println(">> Tipo: " + vectorObjetivos[i].tipoObjetivo + "\n");

            if (vectorObjetivos[i].estatico == true){
                
                System.out.println("Movilidad: Móvil.");
                
            }else{
                
                System.out.println("Movilidad: Estático.");
            }
            
            if (vectorObjetivos[i].hostilidad == true){
                
                System.out.println("Hostilidad: Hostil.");
                                
            }else{
                
                System.out.println("Hostilidad: No hostil.");
                
            }

            System.out.println("Resistencia: " + vectorObjetivos[i].resistencia + " ♥");

            System.out.println("Distancia: " + vectorObjetivos[i].distanciaXY(vectorObjetivos[i]) + " mts.");
            System.out.println("Altura: " + vectorObjetivos[i].distanciaXYZ(vectorObjetivos[i]) + " mts.\n");
        }
    }

///DISPARAR:
    public void disparar(Target vectorObjetivos[], Gloves guanteIzq, Gloves guanteDer, Armor jarvis) {

        for (int i = 0; i < vectorObjetivos.length; i++) {

            if (vectorObjetivos[i].hostilidad == true
                    && vectorObjetivos[i].distanciaXY(vectorObjetivos[i]) < 5000
                    && vectorObjetivos[i].resistencia > 0) {

                while ((Check.chequearStatus(guanteIzq.broken, guanteIzq.destroyed)
                        || Check.chequearStatus(guanteDer.broken, guanteDer.destroyed))
                        && (vectorObjetivos[i].resistencia > 0) && (float) ((jarvis.energiaActual * 100) / jarvis.energiaMaxArm) > 10) {

                    //método reparar para guantes:
                    
                    
                    
                    
                    System.out.println("Disparando en 3... 2... 1");
                    
                int danio = 25;
                
                
                    
                    
                    
                    
                    
                    //5000 m = 0% daño
                    //1250 m = 25% daño
                    //2500 m = 50% daño
                    //3750 m = 25 % daño
                    //0 m = 100% daño
                    
                    
                }
            } else {
                
                System.out.println("Objetivo fuera de rango.");

            }
        }
    }
}
