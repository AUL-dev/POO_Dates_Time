package Ejercicio29;

public class Yema extends Huevo{
    private String color;

    public Yema(String[] tamanio, String color) {
        super(tamanio);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Yema{" +
                "color='" + color + '\'' +
                '}';
    }
}
