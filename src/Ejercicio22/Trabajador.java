package Ejercicio22;

import java.time.LocalDate;

public class Trabajador {
    private String nombre;
    private String apellidos;
    private int sueldo;
    private LocalDate fechaAlta;

    public Trabajador(String nombre, String apellidos, int sueldo, LocalDate fechaAlta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int retencion(int sueldo) {
        if (fechaAlta.getYear() < 1980) {
            sueldo -= sueldo * 20 / 100;
        } else if (fechaAlta.getYear() >= 1980 && fechaAlta.getYear() <= 2000) {
            sueldo -= sueldo * 15 / 100;
        } else if (fechaAlta.getYear() > 2000) {
            sueldo -= sueldo * 5 / 100;
        }
        return sueldo;
    }
}
