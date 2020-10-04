package maua.br.API;

import maua.br.model.ListaAnimes;

import java.util.List;

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
