package maua.br.API;

import maua.br.model.Animes;
import maua.br.model.Manga;
import maua.br.parser.AnimeParser;
import maua.br.parser.MangaParser;

import java.util.List;
/**
 * CRUD do manga, semelhante ao CURD do anime
 */

public class MangaCRUD implements CRUD {

    /**
     * @return string com o link da API
     */
    @Override
    public String verLink() {
        return "https://jikam.moe/";
    }

    /** ulitiza o nome e retorna a lista de mangas
     * @param nome - contem o nome do manga que sera utilizado na pesquisa
     * @return - retorna texto (String)
     */
    @Override
    public List nome(String nome) {
        try{
            List<Animes> list = MangaParser.parseJson(get(verLink()+nome));
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /** Utiliza o nome e retorna lista de mangas
     * @param tipo
     * @return
     */
    @Override
    public List tipo (String tipo){
            try {
                List<Animes> list = MangaParser.parseJson(get(verLink() + tipo));
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;

        }
    }
