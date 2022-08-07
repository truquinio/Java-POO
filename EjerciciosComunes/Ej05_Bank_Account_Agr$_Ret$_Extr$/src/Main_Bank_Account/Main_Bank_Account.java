/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son:

a)   Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b)   Agregar los métodos getters y setters correspondientes 
c)   Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d)   Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a  retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f)    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g)   Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h)   Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

 */
package Main_Bank_Account;

import BankAccount.Cuenta;
import java.util.Scanner;

public class Main_Bank_Account {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Cuenta cuenta1 = new Cuenta();

        cuenta1.cuenta();
        int opcion;

        do {
            System.out.println("");
            System.out.println("Ingrese una opción:");
            System.out.println("1. Ingresar $$.");
            System.out.println("2. Retirar $$.");
            System.out.println("3. Extracción rápida.");
            System.out.println("4. Consultar saldo.");
            System.out.println("5. Consulta de datos.");
            System.out.println("0. Salir.");

            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("1. Ingreso:");
                    System.out.println("Ingrese un monto de $$:");
                    cuenta1.ingresarDinero(leer.nextDouble());

                    break;

                case 2:
                    System.out.println("2. Retiro:");
                    System.out.println("Monto de $$ a retirar:");
                    cuenta1.retirarDinero(leer.nextDouble());
                    break;

                case 3:
                    System.out.println("3. Extracción rápida:");
                    cuenta1.extraccionRapida();
                    break;

                case 4:
                    System.out.println("4. Saldo:");
                    cuenta1.consultarSaldo();
                    break;

                case 5:
                    System.out.println("5. Datos:");
                    cuenta1.consultarDatos();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    System.out.println("Vuelva pronto.");
                    break;
            }
        } while (opcion != 0);
        
        System.out.println("");
    }
}