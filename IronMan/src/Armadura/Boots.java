/*
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
 */
package Armadura;

//EN ESTA CLASE CREO TO2 LOS MÉTODOS PARA DAÑOS, REPARAR O DESTRUIR PROPULSORES (BOTAS).-

public class Boots {

    public boolean broken = false;            //Lo inicio en false xq está SANO.
    public boolean destroyed = false;         //Lo inicio en false xq está SANO.
    public String nombre;
    
///CONSTR:
    public Boots() {
    }

///SUFRIENDO DAÑOS:
    public void dañoBotas(Boots botaIzq, Boots botaDer) {

        //BOTA IZQUIERDA:
        if (Math.random() <= 0.3) {                   //Hasta 30% de posibilidades de que se dañe.

            botaIzq.broken = true;                    //DAÑADO

            System.out.println("Daños: Propulsor izquierdo dañado. ◙");

        } else {

            System.out.println("Daños: Propulsor izquierdo: Sin daños. ☺");
        }

        //BOTA DERECHA:
        if (Math.random() <= 0.3) {                     //30% de posibilidades de que se dañe.

            botaDer.broken = true;                      //DAÑADO

            System.out.println("Daños: Propulsor derecho dañado. ◙");

        } else {

            System.out.println("Daños: Propulsor derecho: Sin daños. ☺");
        }
    }

//REVISAR DAÑOS (DESTRUIDO):
    public void destruirBotas(Boots bota) {

            if (Math.random() <= 0.3) {               //30% de posibilidades de que el dispositivo quede destruido.

                bota.destroyed = true;               //DESTRUIDO.

                System.out.println("Destruido: Propulsor " + bota.nombre + " destruído al intentar repararse. Ø");
            }
    }

///REPARAR DAÑOS: 
    public void repararBotas(Boots botaIzq, Boots botaDer) {

        //BOTA IZQUIERDA:
        while (botaIzq.broken == true && botaIzq.destroyed == false) {  //Mientras esté broken pero no destuído.

            if (Math.random() <= 0.4) {                   //40% de posibilidades de repararlo.

                botaIzq.broken = false;                   //REPARADO

                System.out.println("Reparar: Propulsor izquierdo reparado. ☺");

            } else {

                destruirBotas(botaIzq);  //Verifico si están DESTRUIDAS o NO.-
            }
        }

        //BOTA DERECHA:
        while (botaDer.broken == true && botaDer.destroyed == false) {

            if (Math.random() <= 0.4) {                 //40% de posibilidades de repararlo.

                botaDer.broken = false;                 //REPARADO

                System.out.println("Reparar: Propulsor derecho reparado. ☺");

            } else {

                destruirBotas(botaDer);  //Verifico si están DESTRUIDAS o NO.-
            }
        }
    }
}