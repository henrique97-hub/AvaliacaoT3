package maua.br.API;

import maua.br.model.Animes;
import maua.br.model.Manga;
import maua.br.parser.AnimeParser;
import maua.br.parser.MangaParser;

import java.util.List;

public class MangaCRUD implements CRUD {

    @Override
    public String verLink() {
        return "https://jikam.moe/";
    }

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
