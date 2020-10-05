package maua.br.model;

/**
 * Classe que representará todos
 * os animes
 */
public class Animes {
    private String url;
    private String nome;
    private String sinopse;
    private int epsodio;
    private double nota;

    /** Contrutor da classe: assim que ela for inicializada,
     * esses parametros listados serão atribuidos a ela.
     * @param url - URL do anime
     * @param nome- Nome do anime
     * @param sinopse - Sinopse do anime
     * @param epsodio - Número do anime
     * @param nota -Nota do anime
     */
    public Animes(String url, String nome, String sinopse, int epsodio, int nota) {
        this.url = url;
        this.nome = nome;
        this.sinopse = sinopse;
        this.epsodio = epsodio;
        this.nota = nota;
    }

    /**
     * @return retorna a URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url - atribui uma nova URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return retorna o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome atribui um novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna a sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse atribui uma nova sinopse ao anime
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * @return retorna o epsódio
     */
    public int getEpsodio() {
        return epsodio;
    }

    /**
     * @param epsodio - atribui um novo valor ao epsódio
     */
    public void setEpsodio(int epsodio) {
        this.epsodio = epsodio;
    }


    /**
     * @return retorna a nota de avaliação do anime
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota - atribui uma nova nota ao anime
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return Todas as informações que o anime possui
     */
    @Override
    public String toString() {
        return "Animes{" +
                "url='" + url + '\'' +
                ", nome='" + nome + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", epsodio=" + epsodio +
                ", nota=" + nota +
                '}';
    }

    /**
     * retorna todas as informações que o anime possui
     */
    public void infos(){
        System.out.println(toString());
    }


    }

