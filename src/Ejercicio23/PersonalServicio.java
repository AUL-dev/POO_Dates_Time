package Ejercicio23;

public class PersonalServicio extends Persona {
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, String DNI, String estdoCivil, String seccion) {
        super(nombre, apellidos, DNI, estdoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String trasladoSeccion(String seccion) {
        String[] listaSecciones = new String[4];
        listaSecciones[0] = "Biblioteca";
        listaSecciones[1] = "Secretaria";
        listaSecciones[2] = "Decanato";
        listaSecciones[3] = "Cocina";

        while (true) {
            int listaPosiciones = (int) (Math.random() * listaSecciones.length);
            String nuevaSeccion = listaSecciones[listaPosiciones];

            if (nuevaSeccion.equalsIgnoreCase(seccion)) {
                listaPosiciones = (int) (Math.random() * listaSecciones.length);
                nuevaSeccion = listaSecciones[listaPosiciones];
                setSeccion(nuevaSeccion);
            } else {
                setSeccion(nuevaSeccion);

            }
            return getSeccion();

        }


    }

    @Override
    public String toString() {
        return "PersonalServicio{" +
                "seccion='" + seccion + '\'' +
                '}';
    }
}
