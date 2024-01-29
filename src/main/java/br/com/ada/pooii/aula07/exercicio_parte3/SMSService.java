package br.com.ada.pooii.aula07.exercicio_parte3;

public class SMSService implements Confirmador {
  public SMSService(String operadora) {
    System.out.println("Criando envio de SMS com client: " + operadora);
  }
  @Override
  public void enviarConfirmacao(String mensagem) {
    System.out.println("Enviando SMS:" + mensagem);
  }
}
