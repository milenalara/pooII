package br.com.ada.pooii.aula02.exercicio01;

public class Moto implements VeiculoMotorizado{
  @Override
  public void ligar() {
    System.out.println("Girar a chave na ignição");
  }

  @Override
  public void desligar() {
    System.out.println("Girar e retirar a chave da ignição");
  }

  @Override
  public void acelerar(int velocidade) {
    System.out.println("A moto está acelerando, velocidade final: " + velocidade + " km/h");
  }

  @Override
  public void frear() {
    System.out.println("Aperte o freio");
  }
}
