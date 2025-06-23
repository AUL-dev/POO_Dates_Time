package Ejercicio6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        LocalDateTime fechaHora = LocalDateTime.of(2001, 3, 10, 17, 16, 8);
        LocalDate fecha = LocalDate.of(2001, 3, 10);
        LocalTime hora = LocalTime.of(17, 16, 8);

        DateTimeFormatter fechaA = DateTimeFormatter.ofPattern(" dd, yyyy, h:mm a");
        DateTimeFormatter fechaB = DateTimeFormatter.ofPattern("MM.dd.yy");
        DateTimeFormatter fechaC = DateTimeFormatter.ofPattern("dd,M,yyyy");
        DateTimeFormatter fechaD = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter fechaE = DateTimeFormatter.ofPattern("hh-mm-ss,dd-MM-yy");
        DateTimeFormatter fechaF = DateTimeFormatter.ofPattern(" dd HH:mm:ss");

        String fechaAModificado = fechaHora.getMonth().name();
        String mesAMayuscula = fechaAModificado.toLowerCase().substring(0, 1).toUpperCase() + fechaAModificado.toLowerCase().substring(1, 5);

        String diaSemanaF = fechaHora.getDayOfWeek().name();
        String nombreMes = fechaHora.getMonth().name();
        String diaCortoF = diaSemanaF.substring(0, 3);
        String diaModificado = diaCortoF.toLowerCase().substring(0, 1).toUpperCase() + diaCortoF.toLowerCase().substring(1, 3);
        String mesCorto = nombreMes.substring(0, 3);
        String mesModificado = mesCorto.toLowerCase().substring(0, 1).toUpperCase() + mesCorto.toLowerCase().substring(1, 3);
        DateTimeFormatter fechaG = DateTimeFormatter.ofPattern("HH:mm:ss");

        String fechaPrimera = fechaHora.format(fechaA);
        String fechaSegunda = fecha.format(fechaB);
        String fechaTercera = fecha.format(fechaC);
        String fechaCuarta = fecha.format(fechaD);
        String fechaQuinta = fechaHora.format(fechaE);
        String fechaSexta = fechaHora.format(fechaF);
        String fechaSeptima = hora.format(fechaG);

        System.out.println(mesAMayuscula + "" + fechaPrimera);
        System.out.println(fechaSegunda);
        System.out.println(fechaTercera);
        System.out.println(fechaCuarta);
        System.out.println(fechaQuinta);
        System.out.println(diaModificado + " " + mesModificado + fechaSexta);
        System.out.println(fechaSeptima);
    }
}
