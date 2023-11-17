import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Casos de prueba
        Cancion theScientist = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);

        // Caso 1: "The Scientist" recién se lanza (tiene popularidad normal)
        theScientist.reproducir();

        // Caso 2: "The Scientist" está en auge por superar el mínimo de reproducciones esperadas.
        theScientist.setReproducciones(980);
        for (int i = 0; i < 30; i++) {
            theScientist.reproducir();
        }

        // Caso 3: "The Scientist" baja del auge por tener muchos dislikes.
        theScientist.darDislike();
        theScientist.reproducir();
        theScientist.setDislikes(4000);

        // Caso 4: "The Scientist" es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema.
        theScientist.darLike();
        theScientist.setReproducciones(49990);
        for (int i = 0; i < 30; i++) {
            theScientist.reproducir();
        }

        // Caso 5: "The Scientist" era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas.
        //Usar por ej. fechaDomingoPasado para establecer la última reproducción
        theScientist.setUltimaReproduccion(LocalDate.of(2023, 11, 12));
        theScientist.reproducir();
        theScientist.reproducir();
    }
}