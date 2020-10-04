package maua.br.parser;

import maua.br.enums.TiposMangas;
import maua.br.model.Manga;

public class StatusMangas {
    public static TiposMangas toStatus(String tipo){
        if (tipo.equals("Novel")) return TiposMangas.NOVEL;
        if (tipo.equals("Oneshot")) return TiposMangas.ONESHOT;
        if (tipo.equals("Doujin")) return TiposMangas.DOUJIN;
        if (tipo.equals("Manhwa")) return TiposMangas.MANHWA;
        if (tipo.equals("Manhua")) return TiposMangas.MANHUA;
        else return TiposMangas.MANGA;

    }

}
