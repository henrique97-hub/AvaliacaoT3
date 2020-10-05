package maua.br.model;

import java.util.ArrayList;
import java.util.List;


public class ListaAnimes {
    private List<Animes> animes;

    /**
     * Cria a lista de animes
     */

    public ListaAnimes(){this.animes = new ArrayList<>();}

    /**Adiciona animes à lista
     * @param animes - animes
     */

    public void addAnime(Animes animes) {this.animes.add(animes);}

    /**
     * @return retorna os animes listados
     */

    public final List<Animes> getAnimes(){return this.animes ;}

    @Override
    public String toString() {
        return "ListaAnimes{" +
                "animes=" + animes +
                '}';
    }
}
