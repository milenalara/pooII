package br.com.ada.pooii.aula02.exercicio01;

public class Main {
  public static void main(String[] args) {
    Bicliceta bicliceta = new Bicliceta();
    Carro carro = new Carro();
    Moto moto = new Moto();

    bicliceta.acelerar(12);
    bicliceta.frear();

    carro.ligar();
    carro.desligar();
    carro.acelerar(12);
    carro.frear();

    moto.ligar();
    moto.desligar();
    moto.acelerar(12);
    moto.frear();
  }
}
