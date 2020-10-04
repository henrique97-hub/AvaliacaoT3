package maua.br.API;

import maua.br.model.Animes;
import maua.br.parser.AnimeParser;

import maua.br.parser.AnimeParser;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AnimeCRUD implements CRUD {
    @Override
    public String verLink() {
        return "https://jikam.moe/";
    }

    @Override
    public List<Animes> nome(String nome) {
        try{
            List<Animes> list = AnimeParser.parseJson(get(verLink()+nome));
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List tipo(String tipo) {
        try{
            List<Animes> list = AnimeParser.parseJson(get(verLink()+tipo));
            return list;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }


}



