package Ejercicio23;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String DNI, String estdoCivil, int anioIncorporcion, int numDespacho, String departamento) throws Exception {

        super(nombre, apellidos, DNI, estdoCivil, anioIncorporcion, numDespacho);

        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String cambioDepartamento(String departamento) {
        String[] listaDepartamentos = new String[5];
        listaDepartamentos[0] = "Matemáticas";
        listaDepartamentos[1] = "Arquitectura";
        listaDepartamentos[2] = "Filosofía";
        listaDepartamentos[3] = "Historia";
        listaDepartamentos[4] = "Lenguaje";


        while (true) {
            int nuevaPosicion = (int) (Math.random() * listaDepartamentos.length);
            String nuevoDepartamento = listaDepartamentos[nuevaPosicion];
            if (nuevoDepartamento.equalsIgnoreCase(departamento)) {
                nuevaPosicion = (int) (Math.random() * listaDepartamentos.length);
                nuevoDepartamento = listaDepartamentos[nuevaPosicion];
                setDepartamento(nuevoDepartamento);
            } else {
                setDepartamento(nuevoDepartamento);
            }
            return getDepartamento();
        }
    }


    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
