package maua.br.enums;

public enum TiposMangas {
    MANGA{
        @Override
        public String toString() { return "Esse manga é do tipo manga";}

    },
    NOVEL{
        @Override
        public String toString() { return "Este manga é do tipo novel"; }

    },
    ONESHOT{
        @Override
        public String toString() { return "Este manga é do tipo oneshot";}


    },
    DOUJIN{
        @Override
        public String toString() { return "Este manga é do tipo Doujin";}


    },
    MANHWA{
        @Override
        public String toString() { return "Este manga é do tipo manhwa";}


    },
    MANHUA{
        @Override
        public String toString() { return "Este mangá é do tio manhua";}


    };
}
