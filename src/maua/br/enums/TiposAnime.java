package maua.br.enums;

public enum TiposAnime {
TV{
    @Override
    public String toString(){return "Este mangá é do tipo TV";}
},
    OVA{
        @Override
        public String toString() { return "Este mangá é do tipo ova";}

    },

    MOVIE{
        @Override
        public String toString() {return "Este mangá é do tipo movie";}


    },
    SPECIAL{},
    ONA{},
    MUSIC{};
}
