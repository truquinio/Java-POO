/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. 

En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, 
para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date.

Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay 
entre esa fecha y la fecha actual, que se puede conseguir instanciando un objeto Date 
con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia); 
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Pack_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class_Date {

    public int dia;
    public int mes;
    public int anio;

//CONSTRUCTORES:
    public Class_Date() {
    }

    public Class_Date(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

//GETTERS & SETTERS:
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


//OBTENER FECHA ACTUAL:  / LocalDate.now() / Calendar.getInstance()

    public void diferencia(){
        
        Date fechaActual = new Date();
        Date fechaUser = new Date(anio, mes-1, dia);                          //Debo restar uno al mes, porque si no pasa al siguiente.-
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");        //Importo el formato de la fecha: dd/mm/yyyy.-
        
        String fechaActual_str = formato.format(fechaActual);                 //Aplico el formato a fecha1.-
        String fechaUser_str = formato.format(fechaUser);                     //Aplico formato a fecha2.-
        
        System.out.println("\n_ " + fechaActual_str);                         //Imprimo la fecha1.-
        System.out.println("  " + fechaUser_str + "\n");                      //Imprimo la fecha2.-
        
        long resta = (fechaActual.getTime() - fechaUser.getTime());           //Hago la resta de fechas.-
        
        int diferencia = (int) Math.floor((resta/(1000*60*60*24)/365));       //Al resultado en miliseg la divido *1000ms *60segundos *60minutos y *24hs / 365 días. 
        
        System.out.println("La diferencia es de " + diferencia + " años.\n"); //Imprimo la diferencia.-
    }
}