 

/**
 * Representa un juego de mesa, con su información básica.
 */
public class JuegoDeMesa {

    // nombre del juego
    private String nombre;

    // autor del juego
    private String autor;

    // año de publicación
    private int anho;

    // número recomendado de jugadores
    private int jugadores;

    /**
     * Crea un nuevo juego de mesa con los datos indicados.
     * @param nombre nombre del juego (no puede ser null ni vacío)
     * @param autor autor del juego (cadena vacía si es desconocido, pero no null)
     * @param anho año de publicación (debe ser mayor o igual a 1980)
     * @param jugadores número recomendado de jugadores (debe ser mayor a 0)
     * Precondiciones: nombre no null ni vacío, autor no null, anho >= 1980, jugadores > 0
     */
    public JuegoDeMesa(String nombre, String autor, int anho, int jugadores) {
        // TODO: implementar el constructor con validaciones usando assert
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerAutor() {
        return autor;
    }

    public int obtenerAnho() {
        return anho;
    }

    public int obtenerJugadores() {
        return jugadores;
    }

    @Override
    public String toString() {
        // TODO: implementar
        return null;
    }
}

