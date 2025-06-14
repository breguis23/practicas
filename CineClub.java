 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Gestiona una colección de películas, separándolas por época.
 *
 * Invariante de clase:
 * - nombre no null/ vacío
 * - listas no null
 * - sin títulos duplicados (ni dentro ni entre listas)
 * - cada película en la lista correcta (clásicas <1980, modernas ≥1980)
 */
public class CineClub {

    // ------------ Atributos ------------
    private String nombre;
    private ArrayList<Pelicula> clasicas;   // < 1980
    private ArrayList<Pelicula> modernas;   // ≥ 1980

    // ------------ Constructor ------------
    /**
     * @param nombre nombre del cineclub (no null/ vacío)
     * Precondición cumplida
     */
    public CineClub(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        this.nombre   = nombre;
        this.clasicas = new ArrayList<>();
        this.modernas = new ArrayList<>();
    }

    // ------------ Métodos a completar ------------

    /**
     * Agrega una película.
     * Precondiciones:
     *  - peli no null
     *  - título único en toda la colección
     *  - año >= 1895
     * Postcondición: peli se inserta en la lista correcta
     * Requerimiento: usar al menos un `while` o `Iterator`
     */
    public void agregarPelicula(Pelicula peli) {
        // TODO
    }

    /**
     * Devuelve un conjunto con los títulos de todas las películas
     * de un director dado (sin importar la lista).
     * Precondición: director no null
     * Requerimiento: usar `for‑each` y `HashSet`.
     */
    public HashSet<String> obtenerTitulosPorDirector(String director) {
        // TODO
        return null;
    }

    /**
     * Devuelve un ArrayList con las películas cuya duración
     * excede `minutosMin` (busca en ambas listas).
     * Requerimiento: usar un bucle `for` con índice en al menos una lista.
     */
    public ArrayList<Pelicula> filtrarDuracionMayorA(int minutosMin) {
        // TODO
        return null;
    }

    /**
     * Imprime cada película del cineclub con un Iterator explícito.
     */
    public void imprimirCatalogo() {
        Iterator<Pelicula> itClas = clasicas.iterator();
        while (itClas.hasNext()) {
            System.out.println(itClas.next());
        }
        // TODO: repetir para modernas con otro tipo de iteración (p.ej. for‑each)
    }

    /**
     * Invariante de representación (ver javadoc de la clase).
     * Requerimiento: usar al menos una estructura HashSet
     * para detectar títulos duplicados entre listas.
     */
    public boolean repOK() {
        // TODO
        return false;
    }
}

