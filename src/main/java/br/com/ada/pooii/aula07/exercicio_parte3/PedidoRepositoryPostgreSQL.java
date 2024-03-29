package br.com.ada.pooii.aula07.exercicio_parte3;

public class PedidoRepositoryPostgreSQL implements ContratoRepository {

  public PedidoRepositoryPostgreSQL(String url, String senha, String database, String protocolo) {
    System.out.println("Conectando no db");
    System.out.println("url: " + url);
    System.out.println("senha: " + senha);
    System.out.println("databse: " + database);
    System.out.println("protocol: " + protocolo);
  }

  @Override
  public Pedido buscarPorId(long id) {
    System.out.println("[POSTGRES] - buscando pedido pelo id: " + id);
    return new Pedido(1, null, "pendente");
  }

  @Override
  public void atualizar(long id, Pedido pedido) {
    System.out.println("[POSTGRES] - atualizando pedido " + id + " no db pedido atualizado: " + pedido);
  }
  public void salvar(Pedido pedido) {
    System.out.println("[POSTGRES] - salvando pedido no db: " + pedido);
  }

  public void deletar(long id) {
    System.out.println("[POSTGRES] - deletando pedido no banco de dados id: " + id);
  }
}
