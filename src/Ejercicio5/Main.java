package Ejercicio5;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //el 1 de Enero de 1970 a las 0:00:00
        int dia = 1;
        int mes = 1;
        int anio = 1970;
        int hora = 0;
        int minutos = 0;
        int segundos = 0;

        LocalDateTime fechaDada = LocalDateTime.of(anio, mes, dia, hora, minutos, segundos);
        LocalDateTime fechaActual = LocalDateTime.now();

        Duration segundosTranscurridos = Duration.between(fechaDada, fechaActual);
        System.out.println("La cantidad de segundos que han transcurridos desde la fecha dad hasta la actual es de: " + segundosTranscurridos.getSeconds());
    }
}
