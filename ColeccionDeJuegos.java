 

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Representa una colección de juegos de mesa, organizados por época.
 */
public class ColeccionDeJuegos {

    // nombre de la colección
    private String nombre;

    // juegos publicados antes del 2010
    private ArrayList<JuegoDeMesa> clasicos;

    // juegos publicados desde 2010 en adelante
    private ArrayList<JuegoDeMesa> modernos;

    /**
     * Crea una nueva colección con nombre y listas vacías.
     * Precondición: nombre no puede ser null ni vacío
     */
    public ColeccionDeJuegos(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        this.nombre = nombre;
        this.clasicos = new ArrayList<>();
        this.modernos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo juego a la colección.
     * Precondiciones:
     * - El juego no puede ser null
     * - No debe haber otro juego con el mismo nombre
     * - El año debe ser >= 1980
     */
    public void agregarJuego(JuegoDeMesa juego) {
        // TODO: implementar este método
    }

    /**
     * Devuelve un conjunto con los nombres de todos los juegos de un autor dado.
     * Precondición: autor no puede ser null
     */
    public HashSet<String> obtenerJuegosPorAutor(String autor) {
        // TODO: implementar este método
        return null;
    }

    /**
     * Chequea la consistencia del objeto.
     * La colección es válida si:
     * - El nombre no es null ni vacío
     * - Las listas no son null
     * - No hay nombres repetidos entre o dentro de las listas
     * - Cada juego está en la lista correcta según su año
     */
    public boolean repOK() {
        // TODO: implementar este método
        return false;
    }
}
