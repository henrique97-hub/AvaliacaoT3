package maua.br.enums;

/**
 * Enumerações: possui todos os tipos de animes, seguidos
 * de suas descrições
 */
public enum TiposAnime {
TV{
    @Override
    public String toString(){return "Este anime é do tipo TV";}
},
    OVA{
        @Override
        public String toString() { return "Este anime é do tipo ova";}

    },

    MOVIE{
        @Override
        public String toString() {return "Este anime é do tipo movie";}


    },
    SPECIAL{
    @Override
    public String toString(){return "Este anime é do tipo special";}
    },

    ONA{
    @Override
    public String toString(){return "Este anime é do tipo special";}
    },

    MUSIC{
    @Override
    public String toString(){return "Este anime é do tipo music";}
    };
}
