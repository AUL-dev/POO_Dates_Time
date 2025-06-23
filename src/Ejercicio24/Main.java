package Ejercicio24;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(1000);
        Encargado encargado = new Encargado(2000, 10);
        System.out.println(empleado.getSueldo());
        System.out.println(encargado.getSueldo());
    }
}
