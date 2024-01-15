package br.com.ada.pooii.aula03.Genereric;

public interface Repositorio<T> {
  void salvar(T entidade);

  T buscaPorNome(String nome);

  Boolean deletar(T entidade);

  T atualizar (T endidade);
}
