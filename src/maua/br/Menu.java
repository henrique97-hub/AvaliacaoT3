package maua.br;

import maua.br.API.AnimeCRUD;
import maua.br.API.MangaCRUD;
import maua.br.dao.AnimeDAO;
import maua.br.dao.MangaDAO;
import maua.br.model.Animes;
import maua.br.model.Manga;

import java.util.List;
import java.util.Scanner;

/**
 * Classe Menu possui todas as funções do programa, e é através dela
 * que o programa será executado
 */
public class Menu {
    private AnimeDAO animeDao = new AnimeDAO();
    private static AnimeCRUD animeCRUD = new AnimeCRUD();
    private static List<Animes> animesList;
    private static List<Manga> mangaList;
    private MangaDAO mangaDAO = new MangaDAO();
    private static MangaCRUD mangaCRUD = new MangaCRUD();
    private static Scanner scanner = new Scanner(System.in);


    /** exibira a lista de nomes de animes encontradas em buscas SQL/API
     * @param animesList - lista de animes
     * @return - retorna um anime
     */
    public static Animes escolhaAnimes(List<Animes> animesList) {
        int validacao = 0;
        System.out.println("Lista de animes: ");
        for (int i = 0; i < animesList.size(); i++) {
            System.out.println(i + " " + animesList.get(i).getNome());
        }
        return null;


    }

    /** Possui o nome de todos os mangas
     * @param mangaList - lista de mangas
     * @return - retorna um manga
     */
    public static Manga escolhaManga(List<Manga> mangaList) {
        int validacao = 0;
        System.out.println("Lista de animes: ");
        for (int i = 0; i < animesList.size(); i++) {
            System.out.println(i + " " + animesList.get(i).getNome());
        }
        return null;


    }

    /**
     * Valida se o anime está ou não no database,sendo assim,
     * ele apenas exibe-o ou executa um pedido para a API
     */
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

    /**
     * Valida se o manga está ou não no database,sendo assim,
     * ele apenas exibe-o ou executa um pedido para a API
     */
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

    /**
     * Exibe os animes encontrados no database
     */
        public void exibirAnimes(){
        AnimeDAO ad = new AnimeDAO();
        List<Animes> animesList = ad.infos();
        for (Animes animes: animesList){
            animes.infos();
        }
        }

    /**
     * Exibe os mangas encontrados no database
     */
        public void exibirMangas(){
        MangaDAO md = new MangaDAO();
        List<Manga> mangaList = md.infos();
        for(Manga mangas: mangaList){
            mangas.infos();
        }
        }

    /**
     * Contém as possíveis escolhas que o usuário pode fazer
     */
    public void opcoes(){
        System.out.println("Escolha uma das opções abaixo: " +
                "1 - Anime "+ " " +
                "2 - Manga"+ ""+
                "3 - ListaMangas"+""+
                "4 - ListaAnimes"+""+
                "-1 - Sair"+"");

    }
    /**
     * Método que interage com o usuario, deixando-o com
     * opção de livre escolha para fazer as ações que desejar
     */

    public void controle(){
    int sair = -1;
    int op;
    while (sair == -1){
        opcoes();
        op =Integer.parseInt(scanner.nextLine());
        switch (op){
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
}

