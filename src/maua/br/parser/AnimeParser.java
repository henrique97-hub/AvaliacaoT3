package maua.br.parser;

import maua.br.model.Animes;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AnimeParser {
    public static List<Animes> json(String json){
        JSONObject jsonObject = new JSONObject(json);
        JSONArray jsonArray = jsonObject.getJSONArray("json");
        List<Animes> ListaAnimes = new ArrayList<>();
        for(Object anime: jsonArray){
            ListaAnimes.add(new Animes(
                    ((JSONObject)anime).getString("url"),
                    ((JSONObject)anime).getString("nome"),
                    ((JSONObject)anime).getString("sinopse"),
                    ((JSONObject)anime).getInt("epsodio"),
                    ((JSONObject)anime).getInt("Nota")

            ));

        }
        return ListaAnimes;
    }
}
