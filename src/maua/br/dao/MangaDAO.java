package maua.br.dao;

import maua.br.model.Animes;
import maua.br.model.ListaAnimes;
import maua.br.model.ListaMangas;
import maua.br.model.Manga;

import java.sql.*;
import java.util.List;

/**
 * Contem DAO para mangas
 */
public class MangaDAO implements DAO<Manga> {
    private Connection connection;
    private String myDB = "jdbc:sqlite:dados.db";

    /**
     * Contrutor da classe, que permite estabelecer conexão com o database
     */
    public MangaDAO(){
        try{
            connection = DriverManager.getConnection(myDB);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *Contem todas as informações que contém na tabela dos mangas
     * @return retorna lista de mangas
     */
    @Override
    public List<Manga> infos() {
        ListaMangas listaMangas = new ListaMangas();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(verNome(toString()));
            while (resultSet.next()){
                listaMangas.addManga(new Manga(
                        ResultSet.getString("url"),
                        ResultSet.getString("nome"),
                        ResultSet.getString("sinopse"),
                        ResultSet.getInt("capitulos"),
                        ResultSet.getFloat("volumes"),
                        ResultSet.getString("tipos"),
                        ResultSet.getFloat("nota")));
            }
            resultSet.close();

        } catch (Exception e){
            e.printStackTrace();
        }
        return listaMangas.getMangas();
    }

    /** Permite que um update seja realizado
     * @param manga update de mangas
     * @return se deu certo o update ou não
     */
    @Override
    public String update(Manga manga) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE mangas SET url = ?, nome = ?, sinopse = ?, capitulos = ?, volumes = ?, tipos = ?, nota =?");
            preparedStatement.setString(1, manga.getUrl());
            preparedStatement.setString(2,manga.getNome());
            preparedStatement.setString(3,manga.getSinopse());
            preparedStatement.setInt(4, manga.getCapitulos());
            preparedStatement.setString(5, manga.getTipos());
            preparedStatement.setDouble(6, manga.getNota());
            int show = preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /** Este metodo permite que mangas sejam excluidos
     * @param manga - mangas para serem excluidos
     *
     */
    @Override
    public String delete(Manga manga) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM mangas WHERE nome = ?");
            preparedStatement.setString(1, manga.getNome());
            preparedStatement.executeLargeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    /** Método que permite que novos animes sejam criados
     * @param manga - mangas para serem criados
     * @return
     */
    @Override
    public String create(Manga manga) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO mangas(url, nome, sinopse, capitulos, volumes, nota) VALEUES (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, manga.getUrl());
            preparedStatement.setString(2, manga.getNome());
            preparedStatement.setString(3, manga.getSinopse());
            preparedStatement.setInt(4, manga.getCapitulos());
            preparedStatement.setDouble(5, manga.getVolumes());
            preparedStatement.setString(6,manga.getTipos());
            preparedStatement.setFloat(7,manga.getNota());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Permite ver o nome que pertence a tabela
     * @return - String
     */
    @Override
    public String verNome(String table) {
        return "SELECT * FROM"+table;
    }
}
