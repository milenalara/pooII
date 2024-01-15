package br.com.ada.pooii.aula03.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T, U> {
  // T é o tipo do objeto que eu quero adicionar na lista
  // U é o id

  private final List<T> elementos = new ArrayList<>();

  public void adicionar(T elemento) {
    this.elementos.add(elemento);
  }

  T obter(int indice) {
    if (indice >= 0 && indice < elementos.size()) {
      return this.elementos.get(indice);
    }
    throw new IndexOutOfBoundsException("Posicao Invalida");
  }

  public int indice(U identificador) {
    return 0;
  }

  public boolean contem(T elemento) {
    return this.elementos.contains(elemento);

    // solucao alternativa:
    // return this.elementos.contains(elemento);
//    for (int i = 0; i < this.elementos.size(); i++) {
//      T elementoDaPosicao = this.elementos.get(i);
//      if (elemento.equals(elementoDaPosicao)) {
//        return true;
//      }
//    }
//    return false;
  }

  public static void main(String[] args) {
    MinhaLista<Pessoa, Long> listaDePessoas = new MinhaLista<>();

    var jorge = new Pessoa(1, "jorge");
    listaDePessoas.adicionar(jorge);

    var maria = new Pessoa(2, "maria");
    listaDePessoas.adicionar(maria);

    var jess = new Pessoa(3, "jess");
    listaDePessoas.adicionar(jess);

    System.out.println("Elemento na posição 2: " + listaDePessoas.obter(2)); // Saída: Pessoa[id=3, nome="jess]
    System.out.println("A lista contém a pessoa maria? " + listaDePessoas.contem(maria)); // Saída: true
    System.out.println("Qual a posicao do elemento de ID 3? " + listaDePessoas.indice(3L)); // Saída: 2
  }

}
