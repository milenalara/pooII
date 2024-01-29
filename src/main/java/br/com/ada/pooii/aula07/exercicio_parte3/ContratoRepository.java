package br.com.ada.pooii.aula07.exercicio_parte3;

public interface ContratoRepository {
  Pedido buscarPorId(long id);
  void atualizar(long id, Pedido pedido);
}
