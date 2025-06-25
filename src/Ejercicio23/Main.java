package Ejercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[6];
        personas[0] = new Persona("Andrés", "Wilson Wilsonson", "5235347f", "Soltero");
        personas[1] = new Empleado("Chuck", "Norris", "6523412W", "Casado", 1989, 2);
        personas[2] = new Profesor("Bruce", "Willis", "1841948T", "Divorciado", 1992, 2, "Lenguaje");
        personas[3] = new PersonalServicio("Steven", "Seagal", "1481904J", "Pareja de hecho", "Cocina");
        personas[4] = new Estudiante("John", "Carpenter", "3638989Y", "Separado", "Historia");
        System.out.println("El nombre es: " + personas[0].getNombre());
        System.out.println("Los apellidos son: " + personas[0].getApellidos());
        System.out.println("El DNI es: " + personas[0].getDNI());
        System.out.println("El estado civil es: " + personas[0].getEstadoCivil());
        personas[0].cambioEstadoCivil();
        System.out.println("El nuevo estado civil es: " + personas[0].getEstadoCivil());
        System.out.println("*********");
        System.out.println("El nombre es: " + personas[1].getNombre());
        System.out.println("Los apellidos son: " + personas[1].getApellidos());
        System.out.println("El DNI es: " + personas[1].getDNI());
        System.out.println("El estado civil es: " + personas[1].getEstadoCivil());
        Empleado empleado = (Empleado) personas[1];
        System.out.println("El año de incorporación es: " + empleado.getAnioIncorporcion());
        System.out.println("El número de despacho es: " + empleado.getNumDespacho());
        empleado.reasignacionDespacho(empleado.getNumDespacho());
        System.out.println("El nuevo despacho es el: " + empleado.getNumDespacho());
        System.out.println("***************");
        System.out.println("El nombre es: " + personas[2].getNombre());
        System.out.println("Los apellidos son: " + personas[2].getApellidos());
        System.out.println("El DNI es: " + personas[2].getDNI());
        System.out.println("El estado civil es: " + personas[2].getEstadoCivil());
        Profesor profesor = (Profesor) personas[2];
        System.out.println("El año de incorporación es: " + profesor.getAnioIncorporcion());
        System.out.println("El número de despacho es: " + profesor.getNumDespacho());
        System.out.println("El departamento es: " + profesor.getDepartamento());
        profesor.cambioDepartamento(profesor.getDepartamento());
        System.out.println("El nuevo departamento es: " + profesor.getDepartamento());
        System.out.println("***************");
        System.out.println("El nombre es: " + personas[3].getNombre());
        System.out.println("Los apellidos son: " + personas[3].getApellidos());
        System.out.println("El DNI es: " + personas[3].getDNI());
        System.out.println("El estado civil es: " + personas[3].getEstadoCivil());
        PersonalServicio personal = (PersonalServicio) personas[3];
        System.out.println("La sección es: " + personal.getSeccion());
        personal.trasladoSeccion(personal.getSeccion());
        System.out.println("La nueva sección es: " + personal.getSeccion());
        System.out.println("***************");
        System.out.println("El nombre es: " + personas[4].getNombre());
        System.out.println("Los apellidos son: " + personas[4].getApellidos());
        System.out.println("El DNI es: " + personas[4].getDNI());
        System.out.println("El estado civil es: " + personas[4].getEstadoCivil());
        Estudiante estudiante = (Estudiante) personas[4];
        System.out.println("El curso en el que se ha matriculado es: " + estudiante.getCursoMatriculacion());
        estudiante.matriculaNuevoCurso();
        System.out.println("El nuevo curso en el que se ha matriculado es: " + estudiante.getCursoMatriculacion());

    }
}
