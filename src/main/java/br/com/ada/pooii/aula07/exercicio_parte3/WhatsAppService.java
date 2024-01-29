package br.com.ada.pooii.aula07.exercicio_parte3;

public class WhatsAppService implements Confirmador{
  @Override
  public void enviarConfirmacao(String mensagem) {
    System.out.println("Enviando confirmacao pelo whatsapp: " + mensagem);
  }
}
