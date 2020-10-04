package maua.br.dao;

import java.util.List;

public interface DAO<T> {
    List<T> infos();
    String update(T t);
    String delete(T t);
    String creat(T t);
    String verNome(String table);
}
