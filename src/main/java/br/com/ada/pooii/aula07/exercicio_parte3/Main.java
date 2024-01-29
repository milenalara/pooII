package br.com.ada.pooii.aula07.exercicio_parte3;

public class Main {
  public static void main(String[] args) {
    // inversão de controle (inversão de dependência)
    ContratoRepository repository = new PedidoRepository("http://", "senha@123");
    ContratoRepository repositoryPostgre = new PedidoRepositoryPostgreSQL("http://", "123456", "pedidos", "jdbc");

    Confirmador emailService = new EmailService("yahoo", "123@abc");
    Confirmador smsService = new SMSService("Vivo");
    Confirmador whatsappService = new WhatsAppService();

    PedidoService pedidoService = new PedidoService(repositoryPostgre, smsService);
    pedidoService.confirmarPedido(1);
  }
}
