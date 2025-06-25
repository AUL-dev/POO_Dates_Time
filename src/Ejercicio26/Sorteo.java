package Ejercicio26;

public class Sorteo {

    public static class Dado extends Sorteo {

        public static int lanzar() {
            int numAleatorio = 0;

            //(int) (Math.random() * 6) + 1; ESTO VALDRIA SIN PONER LOS PORCENTAJES??
            double probabilidad = (Math.random() * 100);
            if (probabilidad <= 16) {
                numAleatorio = 1;
            } else if (probabilidad <= 32) {
                numAleatorio = 2;
            } else if (probabilidad <= 48) {
                numAleatorio = 3;
            } else if (probabilidad <= 64) {
                numAleatorio = 4;
            } else if (probabilidad <= 80) {
                numAleatorio = 5;
            } else {
                numAleatorio = 6;
            }
            return numAleatorio;
        }
    }


    public static class Moneda extends Sorteo {
        public static String lanzar() {
            String opciones = "";
            double probabilidad = (Math.random() * 1);
            if (probabilidad <= 0.5) {
                opciones = "Cara";
            } else {
                opciones = "Cruz";
            }
            return opciones;
        }

    }

    public static void main(String[] args) {
        System.out.println("El número aleatorio es: " + Dado.lanzar());
        System.out.println("¿Será cara o cruz? " + Moneda.lanzar());
    }
}

