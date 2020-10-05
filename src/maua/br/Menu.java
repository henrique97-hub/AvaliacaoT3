package maua.br;

import maua.br.API.AnimeCRUD;
import maua.br.API.MangaCRUD;
import maua.br.dao.AnimeDAO;
import maua.br.dao.MangaDAO;
import maua.br.model.Animes;
import maua.br.model.Manga;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private AnimeDAO animeDao = new AnimeDAO();
    private static AnimeCRUD animeCRUD = new AnimeCRUD();
    private static List<Animes> animesList;
    private static List<Manga> mangaList;
    private MangaDAO mangaDAO = new MangaDAO();
    private static MangaCRUD mangaCRUD = new MangaCRUD();
    private static Scanner scanner = new Scanner(System.in);

    // Funções dos cases
    public static Animes escolhaAnimes(List<Animes> animesList) {
        int validacao = 0;
        System.out.println("Lista de animes: ");
        for (int i = 0; i < animesList.size(); i++) {
            System.out.println(i + " " + animesList.get(i).getNome());
        }
        return null;


    }

    public static Manga escolhaManga(List<Manga> mangaList) {
        int validacao = 0;
        System.out.println("Lista de animes: ");
        for (int i = 0; i < animesList.size(); i++) {
            System.out.println(i + " " + animesList.get(i).getNome());
        }
        return null;


    }

    public void validarAnime() {
        Animes anime;
        System.out.println("Digite o nome do anime: ");
        String nome = scanner.nextLine();
        if (animesList.size() != 0) {
            System.out.println("Anime encontrado");
            anime = escolhaAnimes(animesList);
        } else {
            System.out.println("Anime não encontrado..");
            System.out.println("Anime será procurado na api ");
            animesList = animeCRUD.nome(nome);
            anime = escolhaAnimes(animesList);
            animeDao.create(anime);
            anime.infos();
        }
    }

        public void validarMangas(){
            Manga manga;
            System.out.println("Digite o nome do manga: ");
            String nome = scanner.nextLine();
            if (mangaList.size() != 0) {
                System.out.println("Manga encontrado");
                manga = escolhaManga(mangaList);
            } else {
                System.out.println("Manga não encontrado nesta lista... aguarde a busca");

                mangaList = mangaCRUD.nome(nome);
                manga = escolhaManga(mangaList);
                mangaDAO.create(manga);
                manga.infos();
            }


        }

        public void exibirAnimes(){
        AnimeDAO ad = new AnimeDAO();
        List<Animes> animesList = ad.infos();
        for (Animes animes: animesList){
            animes.infos();
        }
        }

        public void exibirMangas(){
        MangaDAO md = new MangaDAO();
        List<Manga> mangaList = md.infos();
        for(Manga mangas: mangaList){
            mangas.infos();
        }
        }

// Interface que interage com o usuario:
    public void controle(){
    int sair = -1;
    int A;
    while (sair == -1){
        opcoes();
        A =Integer.parseInt(scanner.nextLine());
        switch (A){
            case 1:
                validarAnime();
                break;
            case 2:
                exibirAnimes();
                break;
            case 3:
                validarMangas();
                break;
            case 4:
                exibirMangas();
                break;
            case -1:
                System.out.println("Saindo");
                break;

        }
    }

    }

public void opcoes(){
    System.out.println("Escolha uma das opções abaixo: " +
            "1 - Anime "+ " " +
            "2 - Manga"+ ""+
            "3 - ListaMangas"+""+
            "4 - ListaAnimes"+""+
            "-1 - Sair"+"");

}


}

