package Ejercicio29;

import java.util.Arrays;

public class Huevo {
    private String tamanio;

    public Huevo(String tamanio) throws Exception {
        switch (tamanio) {
            case "S":
            case "M":
            case "L":
            case "XL":
                break;
            default:
                throw new Exception("Escoge una opción válida");
        }
        this.tamanio = tamanio;

    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Huevo{" +
                "tamanio='" + tamanio + '\'' +
                '}';
    }


    public static class Yema extends Huevo {
        private String color;

        public Yema(String tamanio, String color) throws Exception {
            super(tamanio);
            this.color = color;
        }

        @Override
        public String toString() {
            return "Yema{" +
                    "tamaño='" + this.getTamanio() + '\'' +
                    "color='" + color + '\'' +
                    '}';
        }
    }

    public static class Clara extends Huevo {
        private String color;

        public Clara(String tamanio, String color) throws Exception {
            super(tamanio);
            this.color = color;
        }

        @Override
        public String toString() {
            return "Clara{" +
                    "tamaño='" + this.getTamanio() + '\'' +
                    "color='" + color + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) throws Exception {
        Huevo huevo = new Huevo("S");
        Clara clara = new Clara("XL","Blanca");
        Yema yema = new Yema("M","Amarilla");
        System.out.println(huevo);
        System.out.println(clara);
        System.out.println(yema);
    }
}

