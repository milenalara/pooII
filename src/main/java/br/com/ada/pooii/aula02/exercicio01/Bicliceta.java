package br.com.ada.pooii.aula02.exercicio01;

public class Bicliceta implements Veiculo{
  @Override
  public void acelerar(int velocidade) {
    System.out.println("A bicicleta está acelerando, velocidade final: " + velocidade + " km/h");
  }

  @Override
  public void frear() {
    System.out.println("Aperte o freio");
  }
}
