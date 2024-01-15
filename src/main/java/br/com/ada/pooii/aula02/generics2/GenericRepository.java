package br.com.ada.pooii.aula02.generics2;

import br.com.ada.pooii.aula01.Vendedor;

public class GenericRepository<T> {
  public void salvar(T entidade) {
    // salva vendedor no banco de dados
  }

  public T buscarPorNome(String nome) {
    // buscar um vendedor por nome
    return null;
  }

  public void deletarPorNome(String nome) {
    // deletar um vendedor por nome
  }

  public void atualizar(T entidade) {
    // atualiza o vendedor
  }
}
