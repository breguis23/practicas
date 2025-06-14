
import java.util.Arrays;
/**
 * Representa una película con información básica y un arreglo de calificaciones.
 *
 * Invariante de clase:
 * - titulo y director no son null ni vacíos
 * - año >= 1895  (año de la primera filmación reconocida)
 * - duracionMinutos > 0
 * - arregloCalificaciones no es null y su longitud es fija (MAX_CALIFICACIONES)
 * - Las calificaciones almacenadas están entre 1 y 10 inclusive.
 */
public class Pelicula {

    // ------------ Atributos ------------
    private String titulo;
    private String director;
    private int    anho;
    private int    duracionMinutos;
    private boolean esDocumental;

    /** Capacidad fija de calificaciones almacenadas */
    private static final int MAX_CALIFICACIONES = 20;
    /** Arreglo circular donde se guardan las últimas calificaciones */
    private int[] calificaciones;
    /** Índice de la próxima posición libre en el arreglo */
    private int proximoIdx;

    // ------------ Constructor ------------
    /**
     * @param titulo  título (no null/ vacío)
     * @param director director (no null/ vacío)
     * @param anho  año (>= 1895)
     * @param duracionMinutos duración > 0
     * @param esDocumental true si es documental
     * Precondición: se cumplen las restricciones anteriores
     * Postcondición: la película queda creada sin calificaciones
     */
    public Pelicula(String titulo,String director,int anho,int duracionMinutos,boolean esDocumental) {
        // TODO: implementar constructor con assert / IllegalArgumentException
    }

    // ------------ Getters básicos ------------
    public String obtenerTitulo()        { 
        return titulo; 
    }

    public String obtenerDirector()      {
        return director; 
    }

    public int    obtenerAnho()          { 
        return anho;
    }

    public int    obtenerDuracion()      {
        return duracionMinutos; 
    }

    public boolean esDocumental()        { 
        return esDocumental;
    }

    // ------------ Lógica con arreglos ------------
    /**
     * Agrega una nueva calificación de 1‑10.
     * Precondición: nota entre 1 y 10 inclusive
     * Postcondición: la nota se guarda sobrescribiendo la más antigua
     */
    public void agregarCalificacion(int nota) {
        // TODO: usar assert / excepción + almacenar en calificaciones[proximoIdx]
        //       después, avanzar proximoIdx circularmente.
    }

    /**
     * Calcula el promedio de calificaciones registradas hasta el momento.
     * Si no hay calificaciones, devuelve 0.
     * Debe usar un bucle `for` con índice para recorrer el arreglo.
     */
    public double promedioCalificaciones() {
        // TODO
        return 0.0;
    }

    /**
     * Devuelve true si es considerada "clásica": año < 1980.
     */
    public boolean esClasica() {
        return anho < 1980;
    }

    // ------------ Representación textual ------------
    @Override
    public String toString() {
        String tipo = esDocumental ? "Documental" : "Ficción";
        return titulo + " (" + anho + ") - " + director +
        ". " + tipo + ". Duración: " + duracionMinutos + " min.";
    }

    // ------------ Invariante de representación ------------
    public boolean repOK() {
        // TODO: implementar todos los chequeos listados arriba.
        return false;
    }
}

