import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Representa una biblioteca de videojuegos, separados por década.
 */
public class BibliotecaDeJuegos {
    private String nombre;
    private ArrayList<Videojuego> clasicos;
    private ArrayList<Videojuego> modernos;

    /**
     * Crea una nueva biblioteca con nombre.
     */
    public BibliotecaDeJuegos(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre no válido.");
        }
        this.nombre = nombre;
        this.clasicos = new ArrayList<>();
        this.modernos = new ArrayList<>();
    }

    /**
     * Agrega un videojuego a la biblioteca según su año.
     * Precondición: el juego no debe ser null, ni repetido por título.
     * Postcondición: el juego se guarda en la lista correspondiente.
     */
    public void agregarJuego(Videojuego juego) {
        // TODO: Implementar el método.
    }

    /**
     * Devuelve todos los títulos de un género dado, sin repeticiones.
     * @param genero género no debe ser null.
     */
    public HashSet<String> obtenerTitulosPorGenero(String genero) {
        return null;
    }

    /**
     * Cuenta cuántos juegos tienen año mayor al indicado.
     * @param anio año límite (inclusive)
     */
    public int contarJuegosRecientes(int anio) {
        return 0;
    }

    /**
     * Devuelve los títulos de todos los juegos como arreglo.
     */
    public String[] obtenerTodosLosTitulos() {
        return null;
    }

    /**
     * Verifica si la biblioteca está bien formada:
     * - Nombre no null ni vacío.
     * - Listas no null.
     * - Juegos con año menor a 2000 van en clasicos, >= 2000 en modernos.
     * - No hay títulos repetidos entre listas ni dentro de una lista.
     */
    public boolean repOK() {
        // TODO: Implementar completamente
        return false;
    }
}
