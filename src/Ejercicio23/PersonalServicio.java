package Ejercicio23;

public class PersonalServicio extends Empleado {
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, String DNI, String estdoCivil, int anioIncorporcion, int numDespacho, String seccion) {
        super(nombre, apellidos, DNI, estdoCivil, anioIncorporcion, numDespacho);
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
                continue;
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
