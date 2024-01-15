package br.com.ada.pooii.aula02.generics2;

import br.com.ada.pooii.aula01.Vendedor;

public class VendedorRepository<T> implements Repositorio {
  @Override
  public void salvar(Object entidade) {

  }

  @Override
  public Object buscaPorNome(String nome) {
    return null;
  }

  @Override
  public Boolean deletar(Object entidade) {
    return null;
  }

  @Override
  public Object atualizar(Object endidade) {
    return null;
  }

// antes de implementar a interface:

//  public void salvarVendedor(Vendedor vendedor) {
//    // salva vendedor no banco de dados
//  }
//
//  public Vendedor buscarVendedorPorNome(String nome) {
//    // buscar um vendedor por nome
//    return null;
//  }
//
//  public void deletarVendedorPorNome(String nome) {
//    // deletar um vendedor por nome
//  }
//
//  public void atualizarVendedor(Vendedor vendedor) {
//    // atualiza o vendedor
//  }


}
