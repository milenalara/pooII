package br.com.ada.pooii.aula02.generics;

import br.com.ada.pooii.aula01.Vendedor;

public class Generics {
  public static void main(String[] args) {

    Caixa<String> box = new Caixa<>("abc");
    // outra sintaxe:
    // Caixa box = new Caixa<>("abc");

    Vendedor vendedor = new Vendedor("Jorge", 1200);
    Caixa<Vendedor> caixaVendedor = new Caixa<>(vendedor);
  }
}
