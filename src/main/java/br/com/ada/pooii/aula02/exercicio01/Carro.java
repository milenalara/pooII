package br.com.ada.pooii.aula02.exercicio01;

public class Carro implements VeiculoMotorizado{
  @Override
  public void ligar() {
    System.out.println("Tirar o freio de mão, pisar na embreagem, girar a chave na ignição");
  }

  @Override
  public void desligar() {
    System.out.println("Ativar o freio de mão, girar e retirar a chave da ignição");
  }

  @Override
  public void acelerar(int velocidade) {
    System.out.println("O carro está acelerando, velocidade final: " + velocidade + " km/h");
  }

  @Override
  public void frear() {
    System.out.println("Pise no acelarador");
  }
}
