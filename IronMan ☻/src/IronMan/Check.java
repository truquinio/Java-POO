package IronMan;

public class Check {

    public boolean dañado = false;            //Lo inicio en false xq está SANO.
    public boolean destroyed = false;         //Lo inicio en false xq está SANO.

///CONSTR:
    public Check() {
    }

///CHEQUEAR ESTADO: Paso por parámetros DAÑADO y DESTRUÍDO desde BOTAS/GUANTES.-
    public boolean chequearStatus(boolean broken, boolean destroyed) {

        boolean disabled;

        if (broken == true || destroyed == true) {

            disabled = true;

        } else {

            disabled = false;
        }
        return disabled;
    }
}
