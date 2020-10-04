package maua.br.model;

import java.util.ArrayList;
import java.util.List;


public class ListaAnimes {
    private List<Animes> animes;

    // Cria a lista
    public ListaAnimes(){this.animes = new ArrayList<>();}
   // Adiciona
    public void addAnime(Animes animes) {this.animes.add(animes);}
    // Mostra
    public final List<Animes> getAnimes(){return this.animes ;}

    @Override
    public String toString() {
        return "ListaAnimes{" +
                "animes=" + animes +
                '}';
    }
}
