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

♦ Estado de la Batería: Hacer un método para que JARVIS informe el estado de la batería en porcentaje a través 
de la consola. Poner como carga máxima del reactor el mayor float posible. Ejecutar 
varias acciones y mostrar el estado de la misma. 

♦ Mostrar Información del Reactor: Hacer un método para que JARVIS informe el estado del reactor en otras dos unidades 
de medida. Hay veces en las que Tony tiene pretensiones extrañas. Buscar en Wikipedia 
la tabla de transformaciones. 

♦ Sufriendo Daños: A veces los dispositivos de la armadura sufren daños para esto cada dispositivo contiene 
un atributo público que dice si el dispositivo se encuentra broken o no. Al utilizar un 
dispositivo existe un 30% de posibilidades de que se dañe. 

La armadura solo podrá utilizar dispositivos que no se encuentren brokens.

Modifique las clases que sean necesarias para llevar adelante este comportamiento. 

♦ Reparando Daños: Hay veces que se puede reparar los daños de un dispositivo, en general es el 40% de las 
veces que se puede hacer. Utilizar la clase Random para modelar este comportamiento. 

En caso de estar dentro de la probabilidad (es decir probabilidad menor o igual al 40%) 
marcar el dispositivo como sano. Si no dejarlo broken.

♦ Revisando Dispositivos: Los dispositivos son revisados por JARVIS para ver si se encuentran brokens. En caso 
de encontrar un dispositivo broken se debe intentar arreglarlo de manera insistente. 

Para esos intentos hay un 30% de posibilidades de que el dispositivo quede destruido, pero 
se deberá intentar arreglarlo hasta que lo repare, o bien hasta que quede destruido. 

Hacer un método llamado revisar dispositivos que efectúe lo anteriormente descrito, el 
mecanismo insistente debe efectuarlo con un bucle do while. 

♦ Radar Versión 1.0: JARVIS posee también incorporado un sistema que usa ondas electromagnéticas para 
medir distancias, altitudes, ubicaciones de objetos estáticos o móviles como aeronaves 
barcos, vehículos motorizados, formaciones meteorológicas y por su puesto enemigos 
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
package IronMan;

public class Armor {

///PARÁMETROS
    public String colorPrim = "rojo";
    public String colorSec = "amarillo";
    public int energiaMaxArm = 2147483647;
    public int energiaActual = 2147483647;
    public int consumoBase = 20;
    public int resistenciaArm = 100;
    public int saludArm = 100;
    public int consumoSistema = 10;
    
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

            System.out.println("Imposible caminar: Uno o más propulsores dañados o destruídos.");

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

            System.out.println("Imposible correr: Uno o más propulsores dañados o destruídos.");

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

            System.out.println("Imposible propulsar: Uno o más propulsores dañados o destruídos.");

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

            System.out.println("Imposible volar: Uno o más dispositivos están dañados o destruídos.");

        } else {
            //Intensidad x3: INTENSIVO, consumo x3: TRIPLE + Intensidad x2: NORMAL, consumo x2: DOBLE.-
            int energiaConsum = ((((intensidad * 3) * consumoBase) * 3) + (((intensidad * 2) * consumoBase) * 2) * tiempo);

            System.out.println("Energía inicial: " + energiaActual);

            energiaActual -= energiaConsum * 4;  // x2 piernas + x2 guantes

            System.out.println("Energía consumida: " + energiaConsum);
            System.out.println("Energía actual dps caminar: " + energiaActual);

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
        if (propulsores.chequearStatus(guanteIzq.broken, guanteIzq.destroyed) && propulsores.chequearStatus(guanteDer.broken, guanteDer.destroyed)) {

            System.out.println("Imposible disparar: ambos repulsores están dañados o destruídos.");

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

        System.out.println("Energía actual sin consola: " + energiaActual);
        energiaActual -= consumoSistema;

        System.out.println("Consumo sistema: " + energiaActual);
    }
    
///MOSTRAR ESTADO:______________________________________________________________
    public void mostrarEstado() {

    }
}

/*
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