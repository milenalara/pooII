package br.com.ada.pooii.aula06.solid;

public class Main {
  public static void main(String[] args) {
    // SOLID
    // SRP -> Single Responsibility Principle (Princípio da responsabilidade única)
    // OCP -> Open-Closed Principle (Princípio do aberto e fechado)
    // LSP -> Liskov Substitution Principle (Princípio da substituição de Liskov)
    // ISP -> Interface Substitution Principle (Princípio da segregação de interfaces)
    // DIP -> Dependence inversion principle (Princípio da inversão de dependência)

    // Princípio da injeção de dependência -> união de tudo
  }

}

public class UserOriginal {
  private String name;
  private String email;
  private String cpf;

  // Métodos de acesso (getters/setters)

  public void saveUser() {
    // Salva o usuário no banco de dados
    // Esta é uma violação do SRP, pois a classe User também está lidando com a persistência dos dados
  }

  public void sendEmail(String message) {
    // Envia um e-mail para o usuário
    // Esta é outra violação do SRP, pois User também está lidando com comunicação por e-mail
  }

  public void sendSMS(String message) {
    // Envia um SMS para o usuário
    // Esta é outra violação do SRP, pois User também está lidando com comunicação por SMS
  }

  public boolean isValidCPF() {
    // Faz o calculo para verificar se o CPF é valido
    // Esta é mais uma violação do SRP, pois User também tem que saber o calculo do CPF.
    return true;
  }
}


// refatorando para atender o SRP
class User {
  private String name;
  private String email;

  // Métodos de acesso (getters/setters)
}

class UserRepository {
  public void saveUser(User user) {
    // Salva o usuário no banco de dados
  }
}

class EmailService {
  public void sendEmail(User user, String message) {
    // Envia um e-mail para o usuário
  }
}

class SMSService {
  public void sendSMS(User user, String message) {
    // Envia um sms para o usuário
  }
}

public class CPFService {
  public boolean isValidCPF(String cpf) {
    // Faz o calculo para verificar se o cpf está correto
    return true;
  }
}