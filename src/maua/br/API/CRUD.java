package maua.br.API;

import maua.br.model.ListaAnimes;

import java.util.List;


/**
 *Interface que auxilia a API e o sql
 * @param <T> - parametro generico
 */
public interface CRUD<T> {
    String verLink();
    List<T> nome(String nome);
    List<T> tipo(String tipo); // manga ou anime
    List<T> infos();

//   String create(T t);
//    String update(T t);
//    String delete(T t);
//    String read(T t);
}
