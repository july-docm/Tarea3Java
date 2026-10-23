
package tarea3;

public class Cancion {

    String titulo;
    int duracionSegundos;
    String genero;
    String nombreArtista;

    public Cancion(String titulo, int duracionSegundos,
                   String genero, String nombreArtista) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.genero = genero;
        this.nombreArtista = nombreArtista;
    }

    public String mostrarDatos() {
        return "Título: " + titulo
                + "\nDuración (segundos): " + duracionSegundos
                + "\nGénero: " + genero
                + "\nArtista: " + nombreArtista;
    }
}
