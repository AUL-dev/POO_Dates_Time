package Ejercicio24;


public class Encargado extends Empleado {
    private int porcentaje;
    private int sueldoFinal;

    public Encargado(int sueldo, int porcentaje) {
        super(sueldo);
        this.porcentaje = porcentaje;
        sueldoFinal += sueldo + (sueldo * porcentaje / 100);
    }

    @Override
    public int getSueldo() {
        return sueldoFinal;
    }
}
