package maua.br.dao;

import java.util.List;

/** Interface para os comandos de sql
 * @param <T> - Parametro genrico
 */
public interface DAO<T> {
    List<T> infos();
    String update(T t);
    String delete(T t);
    String create(T t);
    String verNome(String table);
}
