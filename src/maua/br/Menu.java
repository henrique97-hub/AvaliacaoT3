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
    public void escolhaAnimes(){
        Animes animes;
        System.out.println("Escreva um nome de Anime");
        String nome =scanner.nextLine();
        animesList =(animeCRUD.nome("nome LIKE = ?"+nome+ "?'");
        if(animesList.size()!=0){
            System.out.println("DataBase encontrado ");
            System.out.println("Os animes encontrados foram: ");
            for (int i = 0; i<animesList.size(); i++){
                System.out.println(i+" "+ animesList.get(i).getNome());
            }
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
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case -1:
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
