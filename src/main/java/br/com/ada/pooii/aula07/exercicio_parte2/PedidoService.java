package br.com.ada.pooii.aula07.exercicio_parte2;

import java.util.List;

// 1:03:53
public class PedidoService {

  private final PedidoRepository repository;
  private final EmailService emailService;
  public PedidoService(PedidoRepository repository, EmailService emailService) {
    this.repository = repository;
    this.emailService = emailService;
  }
  public void confirmarPedido(long id) {
      // valida id
      // busca pedido no banco de dados
    Pedido pedidoEncontrado = repository.buscarPedido(id);
    Pedido pedidoAtualizado = pedidoEncontrado.atualizarStatusParaConfirmado();

    // atualizar pedido no banco de dados
    repository.atualizar(id, pedidoAtualizado);

    // enviar email de confirmação
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