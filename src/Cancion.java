import java.time.LocalDate;
//CLASE CONTEXTO (Cancion)
public class Cancion {
    private String titulo;
    private String artista;
    private String album;
    private int anioAlbum;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private LocalDate ultimaReproduccion;
    private State estado;

    public Cancion(String titulo, String artista, String album, int anioAlbum) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.anioAlbum = anioAlbum;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.ultimaReproduccion = LocalDate.now();
        this.estado = new EstadoNormal();
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnioAlbum() {
        return anioAlbum;
    }

    public void setAnioAlbum(int anioAlbum) {
        this.anioAlbum = anioAlbum;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public LocalDate getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(LocalDate ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public void reproducir() {
        this.reproducciones++;
        if (!esReciente(this.getUltimaReproduccion())) {
            estado.mostrarDetalles(this);
        } else {
            this.ultimaReproduccion = LocalDate.now();
            estado.mostrarDetalles(this);
        }
    }

    public void darLike() {
        this.likes = 21000;
    }

    public void darDislike() {
        this.dislikes = 5000;
        estado.mostrarDetalles(this);
    }

    public boolean esReciente(LocalDate fecha) {
        // Obtener la fecha
        LocalDate ahora = LocalDate.now();

        // Calcular la diferencia en días entre la fecha actual y la fecha de la última reproducción
        long diferenciaEnDias = ahora.toEpochDay() - fecha.toEpochDay();

        // Devolver true si la diferencia es menor a 24 horas, false en caso contrario
        return diferenciaEnDias < 1;
    }
}
