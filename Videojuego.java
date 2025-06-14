import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Representa un videojuego.
 */
public class Videojuego {
    private String titulo;
    private String genero;
    private int anio;

    /**
     * Crea un videojuego.
     * @param titulo no debe ser null ni vacío.
     * @param genero no debe ser null ni vacío.
     * @param anio debe ser mayor o igual a 1980.
     */
    public Videojuego(String titulo, String genero, int anio) {
        //Implementar
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public String obtenerGenero() {
        return genero;
    }

    public int obtenerAnio() {
        return anio;
    }

    public String toString() {
        //TODO
        return null;
    }
}
