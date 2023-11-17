public class EstadoNormal implements State{
    @Override
    public void mostrarDetalles(Cancion cancion) {
        System.out.println(Icono.MUSICAL_NOTE.texto() + " - " +
                cancion.getArtista() + " – " +
                cancion.getAlbum() + " – " +
                cancion.getTitulo());
        if (cancion.getReproducciones() > 1000) {
            // Cambiar al estado En Auge
            cancion.setEstado(new EstadoEnAuge());
        }
    }
}
