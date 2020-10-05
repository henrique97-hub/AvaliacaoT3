package maua.br.parser;

import maua.br.model.Animes;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Transforma as informações Json em lista de animes
 */
public class AnimeParser {
    /** transforma as informações do tipo json em informações
     * para os animes
     * @param json - pega as informações do tipo Json para serem convertidas
     * @return retorna lista de animes
     */
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
