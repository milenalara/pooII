package br.com.ada.pooii.aula03.Casting;

import java.util.ArrayList;
import java.util.List;

public class Casting2 {
  public static void main(String[] args) {
    List animais = new ArrayList<>();

    // Animal animal = new Animal();
    // Gato gato = (Gato) animal; // erro: Class Cast Exception

    Gato gato = new Gato();
    gato.nome = "Tonico";
    gato.cor = "branco";
    animais.add(gato);

    Cachorro cachorro = new Cachorro();
    cachorro.nome = "b";
    cachorro.raca = "vira lata";
    animais.add(cachorro);

    // imprimir nomes dos animais
    for (int i = 0; i < animais.size(); i++) {
      // imprimir nome > a lista é de Objetos, preciso converter para uma classe
      // que tem o atributo "nome" primeiro
      Animal animal = (Animal) animais.get(i);
      System.out.println(animal.nome);

      // CASTING IMPLICITO
      Animal animal1 = gato;

      // BOXING AND UNBOXING - wrappers

      // boxing
      int a = 1;
      Integer aWrapper = a;

      // unboxing
      Integer b = 1;
      int c = b;

      Long d = 2_000_000_000L;
      int e = d.intValue(); // vai dar um resultado errado porque int nao cabe esse valor

      Integer f = null;
      int g = f; // Null Point Exception

    }
  }
}
