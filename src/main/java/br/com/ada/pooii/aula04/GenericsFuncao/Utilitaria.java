package br.com.ada.pooii.aula04.GenericsFuncao;

import java.util.List;

public class Utilitaria {

  // MÉTODO GENÉRICO: indicar o tipo a ser recebido entre o "static" e o "void":

  // metodo troca elementos de lugar em uma lista de inteiros
  public static <T> void swapElementos(List<T> lista, int de, int para) {
    // salvando elementos temporariamente
    T elementoDe = lista.get(de);
    T eelementoPara = lista.get(para);

    // swapping
    lista.set(de, eelementoPara);
    lista.set(para, elementoDe);
  }

  public static int contarCarecteres(String txt) {
    return txt != null
        ? txt.trim().length()
        : 0;
  }

  // bounded generics > T extends Int (exemplo)
  // generico limitado recursivo (?)
  public static <T extends Comparable<T>> T encontrarMaiorElemento(List<T> lista) {
    if (lista.isEmpty()) {
      return null;
    }

    T maiorElemento = lista.get(0);

    for (T elemento : lista) {
      if (elemento.compareTo(maiorElemento) > 0) {
        maiorElemento = elemento;
      }
    }

    return maiorElemento;
  }


}
