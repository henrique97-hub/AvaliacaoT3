package maua.br.model;

import java.util.ArrayList;
import java.util.List;

public class ListaMangas {
    private List<Manga> mangas;
    // Construtor da lista
    public ListaMangas(){this.mangas = new ArrayList<>();}
    // Adiciona na lista
    public void addManga(Manga manga) {this.addManga(manga);}
    // Exibe o que contem na lista
    public final List<Manga> getMangas(){return this.mangas;}

    @Override
    public String toString() {
        return "ListaMangas{" +
                "mangas=" + mangas +
                '}';
    }
}
