import br.com.dani.poo.model.Musica;
import br.com.dani.poo.model.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Heartbreak Warfare");

        for (int i=0; i< 9000;i++) {
            musica.curtir();
        }

        for (int i=0; i< 3000;i++) {
            musica.reproduzir();
        }

        System.out.println(String.format("O total de reproduções dessa música é: %s",musica.getTotalDeReproducoes()));
        System.out.println(String.format("A classificação dessa música é: %s",musica.getClassificacao()));

        Podcast podcast = new Podcast();
        podcast.setTitulo("Ciência sem fim");

        for (int i=0; i< 600;i++) {
            podcast.curtir();
        }

        for (int i=0; i< 1;i++) {
            podcast.reproduzir();
        }

        System.out.println(String.format("O total de reproduções do podcast é: %s",podcast.getTotalDeReproducoes()));
        System.out.println(String.format("A classificação do podcast é: %s",podcast.getClassificacao()));
    }
}