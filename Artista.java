
package tarea3;

public class Artista {

    String nombre;
    String paisOrigen;
    int oyentesMensuales;

    public Artista(String nombre, String paisOrigen,
                   int oyentesMensuales) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.oyentesMensuales = oyentesMensuales;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre
                + "\nPaís de origen: " + paisOrigen
                + "\nOyentes mensuales: " + oyentesMensuales;
    }
}

