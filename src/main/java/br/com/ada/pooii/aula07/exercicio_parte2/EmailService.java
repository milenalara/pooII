package br.com.ada.pooii.aula07.exercicio_parte2;

public class EmailService {

  public void enviarEmailConfirmacao(String mensagem) {
    System.out.println("Enviando email:" + mensagem);
  }
  public EmailService(String client, String senha) {
    System.out.println("Criando envio de email com o client:" + client
    + "senha: " + senha);
  }
}
