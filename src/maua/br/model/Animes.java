package maua.br.model;

public class Animes {
    private String url;
    private String nome;
    private String sinopse;
    private int epsodio;
    private double nota; // ver de avaliar com estrela

    public Animes(String url, String nome, String sinopse, int epsodio, int nota) {
        this.url = url;
        this.nome = nome;
        this.sinopse = sinopse;
        this.epsodio = epsodio;
        this.nota = nota;
    }

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

    public int getEpsodio() {
        return epsodio;
    }

    public void setEpsodio(int epsodio) {
        this.epsodio = epsodio;
    }


    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
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

    public void infos(){
        System.out.println(toString());
    }


    }

