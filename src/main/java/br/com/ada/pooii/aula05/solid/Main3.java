package br.com.ada.pooii.aula05.solid;

import java.util.ArrayList;
import java.util.List;

// para resolver o problema em Main2
// separar a função de voar em uma interface
public class Main3 {
  public static void main(String[] args) {
    AveVoadora gaviao = new Gaviao2();
    Ave2 pinguim = new Pinguim2();

    List<AveVoadora> aves = new ArrayList<>();
    aves.add(gaviao);
    // aves.add(pinguim); // nao compilar
    // é melhor ter um erro de compilação do que erro em tempo
    // de execução = mais facil de detectar
  }

  public static void colocarAvesParaVoar(List<AveVoadora> aves) {
    for (AveVoadora ave : aves) {
      ave.voar();
    }
  }
}

interface Ave2 {
  void comer();
}

interface AveVoadora extends Ave2 {
  void voar();
}

class Gaviao2 implements AveVoadora {

  @Override
  public void voar() {
    System.out.println("Gaviao voando");
  }

  @Override
  public void comer() {
    System.out.println("Gavião comendo");
  }
}

class Pinguim2 implements Ave2 {
  @Override
  public void comer() {
    System.out.println("Pinguim comendo");
  }
}