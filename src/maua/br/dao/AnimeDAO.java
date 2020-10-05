package maua.br.dao;

import maua.br.model.Animes;
import maua.br.model.ListaAnimes;

import java.sql.*;
import java.util.List;

/**
 * contém DAO para os animes
 */
public class AnimeDAO implements DAO<Animes> {
    private Connection connection;
    private String myDB = "jdbc:sqlite:dados.db";

    /**
     * Contrutor da classe, que permite estabelecer conexão com o database
     */
    public AnimeDAO() {
        try {
            connection = DriverManager.getConnection(myDB);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Contem todas as informações que contém na tabela dos animes
     * @return retorna lista de animes
     */
    @Override
    public List<Animes> infos() {
        ListaAnimes listaAnimes = new ListaAnimes();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(verNome(toString()));
            while (resultSet.next()) {
                listaAnimes.addAnime(new Animes(
                        ResultSet.getString("url"),
                        ResultSet.getString("nome"),
                        ResultSet.getString("sinopse"),
                        ResultSet.getInt("epsodios"),
                        ResultSet.getFloat("nota")));
            }
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaAnimes.getAnimes();


    }

    /** Permite que um update seja realizado
     * @param animes update de animes
     * @return se deu certo o update ou não
     */
    @Override
    public String update(Animes animes) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE animes SET url = ?, nome = ?, sinopse = ?, epsodios = ?, nota = ?");
            preparedStatement.setString(1, animes.getUrl());
            preparedStatement.setString(2, animes.getNome());
            preparedStatement.setString(3, animes.getSinopse());
            preparedStatement.setInt(4, animes.getEpsodio());
            preparedStatement.setDouble(5, animes.getNota());
            int show = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /** Este metodo permite que animes sejam excluidos
     * @param animes animes para serem excluidos
     *
     */
    @Override
    public String delete(Animes animes) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM animes WHERE nome = ?");
            preparedStatement.setString(1, animes.getNome());
            preparedStatement.executeLargeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /** Método que permite que novos animes sejam criados
     * @param animes - animes para serem criados
     * @return
     */
    @Override
    public String create(Animes animes) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO animes(url, nome, sinopse, epsodios, nota) VALEUES (?,?,?,?,?)");
            preparedStatement.setString(1, animes.getUrl());
            preparedStatement.setString(2, animes.getNome());
            preparedStatement.setString(3, animes.getSinopse());
            preparedStatement.setInt(4, animes.getEpsodio());
            preparedStatement.setDouble(5, animes.getNota());
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
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
