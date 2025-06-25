package Ejercicio24;


public class Encargado extends Empleado {
    private int sueldoFinal;

    public Encargado(int sueldo) {
        super(sueldo);

        sueldoFinal += sueldo + (sueldo * 10 / 100);
    }

    @Override
    public int getSueldo() {
        return sueldoFinal;
    }
}
