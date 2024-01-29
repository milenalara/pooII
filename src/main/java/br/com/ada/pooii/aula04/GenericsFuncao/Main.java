package br.com.ada.pooii.aula04.GenericsFuncao;

import br.com.ada.pooii.aula04.Casting.Animal;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> lista = Arrays.asList(1, 2, 3, 10, 4);

    Utilitaria.swapElementos(lista, 0, 1);
    // Utilitaria.<Integer>swapElementos(lista, 0, 1);  // indicar o tipo quando o java nao conseguir sozinho

    Integer maior = Utilitaria.encontrarMaiorElemento(lista);
    System.out.println(lista);
    System.out.println("maior = " + maior);

    // COM STRINGS
    List<String> nomes = Arrays.asList("maria", "ana", "erica", "bruna", "paula");
    Utilitaria.swapElementos(nomes, 0, nomes.size() - 1);
    System.out.println(nomes);

    String nome = Utilitaria.encontrarMaiorElemento(nomes);
    System.out.println("primeira: " + nome);

    List<Animal> animais = Arrays.asList(
        new Animal("cavalo", 1.4),
        new Animal("cachorro", 0.6),
        new Animal("elefante", 2.05),
        new Animal("girafa", 3.4)
    );

    Animal maiorAnimal = Utilitaria.encontrarMaiorElemento(animais);
    System.out.println("maior animal: " + maiorAnimal.nome());
  }
}
