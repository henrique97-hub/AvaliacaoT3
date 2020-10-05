package maua.br.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que contém a lista de todos os mangas
 */
public class ListaMangas {
    private List<Manga> mangas;

    /**
     * Construtor da lista
     */

    public ListaMangas(){this.mangas = new ArrayList<>();}

    /** Adiciona mangas à lista
     * @param manga - mangas
     */

    public void addManga(Manga manga) {this.addManga(manga);}

    /** Pega todos os mangas e retorna-os ao usuário
     * @return - retorna uma string contendo os mangas
     */

    public final List<Manga> getMangas(){return this.mangas;}

    /**
     * @return informações do tipo string
     */
    @Override
    public String toString() {
        return "ListaMangas{" +
                "mangas=" + mangas +
                '}';
    }
}
