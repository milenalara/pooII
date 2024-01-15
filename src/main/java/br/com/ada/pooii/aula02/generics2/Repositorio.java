package br.com.ada.pooii.aula02.generics2;

public interface Repositorio<T> {
  void salvar(T entidade);

  T buscaPorNome(String nome);

  Boolean deletar(T entidade);

  T atualizar (T endidade);
}
