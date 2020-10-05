package maua.br.parser;

import maua.br.model.Animes;
import maua.br.model.Manga;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por converter json para lista de mangas
 */
public class MangaParser {
    /**
     * @param json - usa o json para converter em manga
     * @return -retorna lista de mangas
     */
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
                    StatusMangas.toStatus(((JSONObject)manga).getString("tipo")),
                    ((JSONObject)manga).getInt("Nota")


            ));

        }
        return ListaManga;
    }
}



