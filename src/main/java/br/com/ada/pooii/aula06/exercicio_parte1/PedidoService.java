package br.com.ada.pooii.aula06.exercicio_parte1;

import java.util.List;

// 1:03:53
public class PedidoService {

  public void confirmarPedido(long id) {
      // valida id
      // busca pedido no banco de dados
    PedidoRepository repositorry = new PedidoRepository();
    Pedido pedidoEncontrado = repositorry.buscarPedido(id);
    Pedido pedidoAtualizado = pedidoEncontrado.atualizarStatusParaConfirmado();

    // atualizar pedido no banco de dados
    repositorry.atualizar(id, pedidoAtualizado);

    // enviar email de confirmação
    EmailService emailService = new EmailService();
    emailService.enviarEmailConfirmacao("Pedido confirmado: " + pedidoAtualizado);
  }

  public double calcularTotalPedido() {
    return 0.0;
  }

  public List<Item> getItens() {
    return null;
  }

  public long getQtdItens() {
    return 0L;
  }

  public void addItem(Item item) {
  }

  public void deletarItem(Item item) {
  }
}

// 2:05