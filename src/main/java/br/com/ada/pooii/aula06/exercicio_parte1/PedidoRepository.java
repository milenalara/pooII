package br.com.ada.pooii.aula06.exercicio_parte1;

public class PedidoRepository {
  public Pedido buscarPedido(long id) {
    System.out.println("Buscando pedido pelo id" + id);
    return new Pedido(id, null, "status"); // simula pedido encontrado no banco de dados
  }
  public void salvar(Pedido pedido) {
    System.out.println("Salvando pedido no db: " + pedido);
  }
  public void atualizar(long id, Pedido pedido) {
    System.out.println("Atualizando pedido " + id + " no db. Pedido atualizado: " + pedido);
  }
  public void deletar(long id) {
    System.out.println("Deletando pedido no banco de dados: id " + id);
  }
}
