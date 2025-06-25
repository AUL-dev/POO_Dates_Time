package Ejercicio23;

import java.util.Scanner;

public class Estudiante extends Persona {
    private String cursoMatriculacion;

    public Estudiante(String nombre, String apellidos, String DNI, String estdoCivil, String cursoMatriculacion) {
        super(nombre, apellidos, DNI, estdoCivil);
        this.cursoMatriculacion = cursoMatriculacion;
    }

    public String getCursoMatriculacion() {
        return cursoMatriculacion;
    }

    public void setCursoMatriculacion(String cursoMatriculacion) {
        this.cursoMatriculacion = cursoMatriculacion;
    }

    public String matriculaNuevoCurso() throws Exception {
        //matematicas, lenguaje, historia,arquitectura,filosofia
        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        do {
            System.out.println("Escriba un curso distinto al actual: ");
            System.out.println("1.-Matemáticas");
            System.out.println("2.-Lenguaje");
            System.out.println("3.-Historia");
            System.out.println("4.-Arquitectura");
            System.out.println("5.-Filosofía");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    opcion = "Matemáticas";
                    break;
                case "2":
                    opcion = "Lenguaje";
                    break;
                case "3":
                    opcion = "Historia";
                    break;
                case "4":
                    opcion = "Arquitectura";
                    break;
                case "5":
                    opcion = "Filosofía";
                    break;
                default:
                    throw new Exception("Escoge una opción válida.");
            }

        } while (opcion.equalsIgnoreCase(getCursoMatriculacion()));
        setCursoMatriculacion(opcion);
        return getCursoMatriculacion();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "cursoMatriculacion='" + cursoMatriculacion + '\'' +
                '}';
    }
}
