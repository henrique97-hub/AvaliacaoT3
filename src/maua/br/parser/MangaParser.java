package maua.br.parser;

import maua.br.model.Animes;
import maua.br.model.Manga;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MangaParser {
    public static List<Manga> json(String json){
        JSONObject jsonObject = new JSONObject(json);
        JSONArray jsonArray = jsonObject.getJSONArray("json");
        List<Manga> ListaManga = new ArrayList<>();
        for(Object manga: jsonArray){
            ListaManga.add(new Manga(
                    ((JSONObject)manga).getString("url"),
                    ((JSONObject)manga).getString("nome"),
                    ((JSONObject)manga).getString("sinopse"),
                    ((JSONObject)manga).getInt("Capítulos"),
                    ((JSONObject)manga).getInt("Volume"),
                    ((JSONObject)manga).getInt("Tipo"), // Corrigir
                    ((JSONObject)manga).getInt("Nota")


            ));

        }
        return ListaManga;
    }
}



