package maua.br.testes;


import maua.br.model.Animes;
import maua.br.model.ListaAnimes;
import maua.br.model.ListaMangas;

public class TesteAnime {


    public static void main(String[] args) {
        Animes anime1 = new Animes("aaa","Teste teste","isso é apenas um teste",4,2);
        ListaAnimes lista = new ListaAnimes();
        lista.addAnime(anime1);
        System.out.println(lista);

    }




}
