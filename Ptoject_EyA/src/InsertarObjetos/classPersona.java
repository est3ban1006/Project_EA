package InsertarObjetos;

/**
 *
 * @author Personal
 */
public class classPersona {

    String nombre;
    int edad;
    char genero;

    public classPersona(String nombre1, int edad1, char genero1) {
        nombre = nombre1;
        edad = edad1;
        genero = genero1;
    }

    public void impInfo() {
        System.out.println("Nombre: " + nombre + "\n Edad: "+edad + "\n Genero: "+genero);
    }
}
