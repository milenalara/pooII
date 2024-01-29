package br.com.ada.pooii.aula04.Generics;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EscolhedorGenerico<T> {
  // Array nao funciona muito bem com generics,
  // porque você nao sabe o tamanho certo que vai precisar,
  // entao fica necessario passar o array por parametro no construtor
  // prefica usar List
  private List<T> array;

  @SuppressWarnings("unchecked")
  public EscolhedorGenerico(List<T> array) {
    //    this.array = array;
    //    this.array = (T[]) new Object[10];
    //    this.array = Arrays.asList(array); // se for passado um array no parametro
  }

  public T escolhe() {
    // obtendo numero randomico
    Random random = new Random();
//    int numeroRand = random.nextInt(array.length);
    int numeroRand = random.nextInt(array.size());

    // escolher item do array usando o numeroRand como index
    // T retorno = this.array[numeroRand];

    T retorno = array.get(numeroRand);
    return retorno;
  }
}
