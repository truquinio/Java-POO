/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 

a)   Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b)   Agregar los métodos getters y setters correspondientes.
c)   Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d)   Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e)   Método retirar(double retiro): el método recibe una cantidad de dinero a  retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0.
f)    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g)   Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h)   Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package BankAccount;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int numeroCuenta;
    private int DNI;
    private double SaldoActual;
    private int interes;

// CONSTRUCTORES:
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, int SaldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
        this.interes = interes;
    }

// GETTERS & SETTERS:
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

// CREAR OBJETO CUENTA:
    public void cuenta() {
        System.out.println("Ingrese su n° de cta:");
        numeroCuenta = leer.nextInt();

        System.out.println("Ingrese su DNI:");
        DNI = leer.nextInt();

        SaldoActual = 0.0;
    }

// INGRESAR DINERO:    
    public void ingresarDinero(double ingreso) {

        if (ingreso > 0) {
            SaldoActual += ingreso;
        } else {
            System.out.println("Ingrese un monto de $$:");
        }
        System.out.println("Saldo actual: " + SaldoActual);

    }

// RETIRAR DINERO:    
    public void retirarDinero(double retiro) {

        if (retiro > 0 && SaldoActual > retiro) {

          SaldoActual -= retiro;

        } else if (retiro > 0 && SaldoActual < retiro) {
            
            SaldoActual = 0;
        }
        
        System.out.println("Saldo insuficiente: " + SaldoActual);
    }

// EXTRACCIÓN RÁPIDA (20%)
    public void extraccionRapida() {

        System.out.println("Saldo actual: " + SaldoActual);
        System.out.println("");

        System.out.println("Ingrese porcentaje a extraer: (Hasta 20%)");
        double extraccion = leer.nextDouble();

        if (extraccion <= 20) {

            extraccion = SaldoActual * extraccion / 100;

            SaldoActual -= extraccion;

        } else {
            System.out.println("Ingrese un monto menor al 20%:");
        }

        System.out.println("Saldo actual: " + SaldoActual);
    }

//  CONSULTAR SALDO:
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + SaldoActual);
    }

//  CONSULTAR DATOS:
    public void consultarDatos() {

        System.out.println("N° de cuenta: " + numeroCuenta);
        System.out.println("D.N.I.: " + DNI);
    }
}
