package br.com.ada.pooii.aula05.solid;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> lsita = new LinkedList<>();

  }

  // ao colocar uma ArrayList como parametro, estamos ferindo
  // o principio OPEN CLOSED, porque estamos vinculando uma unica implementacao
  public static void imprimirElementos(ArrayList<String> lista) {
    for (String string : lista) {
      System.out.println(string);
    }
  }

  // o correto é passar a interface List
  public static void imprimirElementos2(List<String> lista) {
    for (String string : lista) {
      System.out.println(string);
    }

    // fere o Liskov Subs. porque LinkedList não tem index
    // ou seja, nao esta sendo possivel substituir a classe
    // filha (LinkedList) pela classe mãe (List)
    // String s = lista.get(1);
  }


}
