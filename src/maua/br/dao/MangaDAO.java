package maua.br.dao;

import maua.br.model.Animes;
import maua.br.model.ListaAnimes;
import maua.br.model.Manga;

import java.sql.*;
import java.util.List;

public class MangaDAO implements DAO<Manga> {
    private Connection connection;
    private String myDB = "jdbc:sqlite:dados.db";

    public MangaDAO(){
        try{
            connection = DriverManager.getConnection(myDB);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Manga> infos() {
        ListaAnimes listaAnimes = new ListaAnimes();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(verNome(toString()));
            while (resultSet.next()){
                listaAnimes.addAnime(new Animes(
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
        return ListaAnimes.getMangas();
    }

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

    @Override
    public String verNome(String table) {
        return "SELECT * FROM"+table;
    }
}
