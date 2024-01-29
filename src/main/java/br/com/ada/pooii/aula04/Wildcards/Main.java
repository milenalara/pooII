package br.com.ada.pooii.aula04.Wildcards;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // GENERICS => WILDCARS
    // List<Object> != List<Long>

    List<Number> list = Arrays.asList(1, 1.2, 2L);
    List<Double> lista2 = List.of(1.2, 1.3, 1.4);
    List<Integer> lista3 = List.of(1, 2, 3);

    imprimirNumerosSemWildCard(list);

    // erro, nao compila pq a lista nao é de number, e sim de double:
    // imprimirNumerosSemWildCard(lista2);

    imprimirNumerosComWildCard(lista2);

    Double result1 = somarListaDeNumeros(list);
    Double result2 = somarListaDeNumeros(lista2); // aceita ambas
    System.out.println(result1);
    System.out.println(result2);
  }

  public static void imprimirNumerosSemWildCard(List<Number> numeros) {
    for (Number n : numeros) {
      System.out.println(n);
    }
  }

  //  para resolver isso, usaremos os wildcards: "?"
  // com extends é wildcard limitado: "? extends Class"
  public static void imprimirNumerosComWildCard(List<? extends Number> numeros) {
    for (Number n : numeros) {
      System.out.println(n);
    }
  }

  // upper bounded wildcard
  public static double somarListaDeNumeros(List<? extends Number> numeros) {
    double resultado = 0.0;

    for (Number n : numeros) {
      resultado += n.doubleValue();
    }

    return resultado;
  }

  // usando <? super CarroEletrico> vai aceitar carro, carro eletrico e veiculo
  // mas nao moto
  public static void verificarCarro(List<? super CarroEletrico> veiculo) {

  }
}
