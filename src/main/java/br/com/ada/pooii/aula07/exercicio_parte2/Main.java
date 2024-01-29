package br.com.ada.pooii.aula07.exercicio_parte2;

public class Main {
  public static void main(String[] args) {
    // inversão de controle (inversão de dependência)
    PedidoRepository repository = new PedidoRepository("http", "senha@123");

    EmailService emailService = new EmailService("yahoo", "123@abc");

    PedidoService pedidoService = new PedidoService(repository, emailService);
    pedidoService.confirmarPedido(1);
  }
}
