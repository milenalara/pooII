package br.com.ada.pooii.aula03.Genereric;

import java.util.List;

public interface ReadOnlyRepository<T, U> {
  List<T> buscarTodos();

  T buscarPorId(U id);
}
