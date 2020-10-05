package maua.br.model;

/**
 * Classe dos Mangas
 */
public class Manga {
    private String url;
    private String nome;
    private String sinopse;
    private int capitulos;
    private int volumes;
    private String tipos;
    private int nota;

    /** Construtor da classe que possui paramentros iniciais de todos
     * os mangas que forem criados
     * @param url - referente ao URL do manga
     * @param nome - referente ao nome do manga
     * @param sinopse - descrição do manga
     * @param capitulos - quantidade de capitulos que o manga possui
     * @param volumes - número de volumes que o manga tem
     * @param tipos - tipos de mangas
     * @param nota - avaliação dos mangas
     */

    public Manga(String url, String nome, String sinopse, int capitulos, int volumes, String tipos, int nota) {
        this.url = url;
        this.nome = nome;
        this.sinopse = sinopse;
        this.capitulos = capitulos;
        this.volumes = volumes;
        this.tipos = tipos;
        this.nota = nota;
    }


    /**
     * @return retorna a url do manga
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url atribui uma nova url ao manga
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return retorna o nome do manga
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome atribui um novo nome ao manga
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna a sinópse do manga
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse atribui uma nova sinopse ao manga
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * @return retorna o número de capitulos que o manga possui
     */
    public int getCapitulos() {
        return capitulos;
    }

    /**
     * @param capitulos atribui um novo numero de capitulos ao manga
     */
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    /**
     * @return retorna o numero de volumes que o manga possui
     */
    public int getVolumes() {
        return volumes;
    }

    /**
     * @param volumes permite alterar o número de volumes do manga
     */
    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    /**
     * @return retorna os tipos de mangas existentes
     */
    public String getTipos() {
        return tipos;
    }

    /**
     * @param tipos permite alterar o número de tipos que o mangá possui
     */
    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    /**
     * @return retorna a nota que o manga foi avaliado
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota permite que uma nova nota seja atribuida ao manga
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return retorna os atributos que possui no mangá
     */
    @Override
    public String toString() {
        return "Manga{" +
                "url='" + url + '\'' +
                ", nome='" + nome + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", capitulos=" + capitulos +
                ", volumes=" + volumes +
                ", tipos='" + tipos + '\'' +
                ", nota=" + nota +
                '}';
    }

    /**
     * exibe todos os atributos que o manga possui
     */
    public void infos(){
        System.out.println(toString());
    }
}
