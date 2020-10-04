package maua.br.dao;

import maua.br.model.Animes;
import maua.br.model.ListaAnimes;

import java.sql.*;
import java.util.List;

public class AnimeDAO implements DAO<Animes> {
    private Connection connection;
    private String myDB = "jdbc:sqlite:dados.db";

    public AnimeDAO(){
        try{
            connection = DriverManager.getConnection(myDB);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Animes> infos() {
        ListaAnimes listaAnimes = new ListaAnimes();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(verNome(toString()));
            while (resultSet.next()){
                listaAnimes.addAnime(new Animes(
                ResultSet.getString("url"),
                ResultSet.getString("nome"),
                ResultSet.getString("sinopse"),
                ResultSet.getInt("epsodios"),
                ResultSet.getFloat("nota")));
            }
            resultSet.close();

        } catch (Exception e){
            e.printStackTrace();
        }
            return ListaAnimes.getAnimes();


    }

    @Override
    public String update(Animes animes) {
        r
    }

    @Override
    public String delete(Animes animes) {
        return null;
    }

    @Override
    public String creat(Animes animes) {
        return null;
    }

    @Override
    public String verNome(String table) {
        return null;
    }
}
