/*
Cada vez que se escribe en la consola o se habla a través del sintetizador se consume 
lo establecido en estos dispositivos. Solo se usa en nivel básico.
 */
package IronMan;

public class Console {

    public boolean status = true;

///CONSTR:
    public Console() {
    }

/*

//CONSUMO SISTEMA:
    public void consumoSistema() {

        System.out.println("Energía actual sin consola: " + energiaActual);
        energiaActual -= consumoSistema;

        System.out.println("Consumo sistema: " + energiaActual);
    }
*/
}