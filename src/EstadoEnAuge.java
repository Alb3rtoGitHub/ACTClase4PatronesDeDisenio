public class EstadoEnAuge implements State {
    @Override
    public void mostrarDetalles(Cancion cancion) {
        System.out.println(Icono.ROCKET.texto() + " - " +
                cancion.getArtista() + " – " +
                cancion.getTitulo() + " (" +
                cancion.getAlbum() + " – " +
                cancion.getAnioAlbum() + ")");
        if (cancion.getReproducciones() > 50000 && cancion.getLikes() > 20000) {
            // Cambiar al estado En Tendencia
            cancion.setEstado(new EstadoEnTendencia());
        } else if (cancion.getDislikes() >= 5000) {
            // Volver al estado Normal
            cancion.setEstado(new EstadoNormal());
        }
    }
}
