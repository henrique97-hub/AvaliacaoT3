package maua.br.model;

public class Manga {
    private String url;
    private String nome;
    private String sinopse;
    private int capitulos;
    private int volumes;
    private String tipos;
    private int nota;

    //Construtor
    public Manga(String url, String nome, String sinopse, int capitulos, int volumes, String tipos, int nota) {
        this.url = url;
        this.nome = nome;
        this.sinopse = sinopse;
        this.capitulos = capitulos;
        this.volumes = volumes;
        this.tipos = tipos;
        this.nota = nota;
    }
    // getters e setters

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    // ToString
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
    public void infos(){
        System.out.println(toString());
    }
}
