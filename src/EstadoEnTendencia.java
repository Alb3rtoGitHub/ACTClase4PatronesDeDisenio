import java.util.Date;

public class EstadoEnTendencia implements State {
    @Override
    public void mostrarDetalles(Cancion cancion) {
        System.out.println(Icono.FIRE.texto() + " - " +
                cancion.getTitulo() + " – " +
                cancion.getArtista() + " (" +
                cancion.getAlbum() + " – " +
                cancion.getAnioAlbum() + ")");
        if (cancion.getUltimaReproduccion() == null || !cancion.esReciente(cancion.getUltimaReproduccion())){
            // Volver al estado Normal
            cancion.setEstado(new EstadoNormal());
        }
    }
}
