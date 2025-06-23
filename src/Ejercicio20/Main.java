package Ejercicio20;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1990, 10, 5);
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(fecha, fechaActual);
        Alumno alumno = new Alumno(1, "Luis", "Mas Ros", fecha, 7.5f);
        System.out.println("El código del alumno es: " + alumno.getCodigo());
        System.out.println("El nombre del alumno es: " + alumno.getNombre());
        System.out.println("Los apellidos del alumno son: " + alumno.getApellidos());
        System.out.println("La fecha de nacimiento del alumno es: " + alumno.getFechaNacimiento());
        System.out.println("La calificación del alumno es de: " + alumno.getCalificacion());
        System.out.println("La edad del alumno es de: " + edad.getYears());
    }
}
