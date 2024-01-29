package br.com.ada.pooii.aula05.solid;

import java.util.List;

public class Main2 {
  public static void main(String[] args) {
    Ave2 gaviao = new Gaviao2();
    Ave2 pinguim = new Pinguim2();

    // fere Liskov
    // fere Interface Segregation
//    colocarAvesParaVoar(List.of(gaviao, pinguim));
  }

  public static void colocarAvesParaVoar(List<Ave> aves) {
    for (Ave ave : aves) {
      ave.voar();
    }
  }
}

interface Ave {
  void voar();

  void comer();
}

class Gaviao implements Ave {

  @Override
  public void voar() {
    System.out.println("Gaviao voando");
  }

  @Override
  public void comer() {
    System.out.println("Gavião comendo");
  }
}

class Pinguim implements Ave {

  @Override
  public void voar() {
    throw new RuntimeException("Método nao faz sentido aqui");
  }

  @Override
  public void comer() {
    System.out.println("Pinguim comendo");
  }
}