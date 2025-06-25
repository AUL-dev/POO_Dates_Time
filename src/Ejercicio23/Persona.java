package Ejercicio23;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String estadoCivil;

    public Persona(String nombre, String apellidos, String DNI, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.estadoCivil = estadoCivil;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String cambioEstadoCivil() throws Exception {
        Scanner sacanner = new Scanner(System.in);
        String opcion = "";
        do {
            System.out.println("Escriba su nuevo estado civil: ");
            System.out.println("1.-Soltero");
            System.out.println("2.-Casado");
            System.out.println("3.-Divorciado");
            System.out.println("4-Viudo");
            System.out.println("5.-Separado");
            System.out.println("6.-Pareja de hecho");
            opcion = sacanner.nextLine();
            switch (opcion) {
                case "1":
                    opcion = "Soltero";
                    break;
                case "2":
                    opcion = "Casado";
                    break;
                case "3":
                    opcion = "Divorciado";
                    break;
                case "4":
                    opcion = "Viudo";
                    break;
                case "5":
                    opcion = "Separado";
                    break;
                case "6":
                    opcion = "Pareja de hecho";
                    break;
                default:
                    throw new Exception("Escoge una opción válida");
            }
        } while (opcion.equalsIgnoreCase(getEstadoCivil()));
        setEstadoCivil(opcion);
        return getEstadoCivil();
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
