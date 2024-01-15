package br.com.ada.pooii.aula03.Casting;

import java.util.ArrayList;
import java.util.List;

public class Casting {
  public static void main(String[] args) {
    // casting é um processo do java para converter um objeto de
    // um tipo em outro tipo
    Integer id = 123;
    String idString = "123-abc";

    // maneiras de converter um objeto em outro tipo
    // Long idLong = id; // da erro
    // Long idLong = Long.valueOf(id); // 1. metodo de Long
    Long idLong = (long) id; // 2. casting > CASTING EXPLICITO

    System.out.println(idLong instanceof Long); // retorna true se o tipo de idLong for Long

    // class cast exception
    List<Object> ids = new ArrayList<>();
    ids.add(id);
    ids.add(idString);

    // CLASS CAST EXCEPTION

    // Long idLong2 = (long) ids.get(1); // vai retornar String e dar o erro
    // erro de compilação vs. erro de execução > o de comp é melhor porque + fácil de identificar

    if (ids.get(1) instanceof Long) {
      Long idLong2 = (long) ids.get(1);
      System.out.println(idLong2);
    }

    if (ids.get(2) instanceof Long || ids.get(2) instanceof Integer) {
      Integer i = (Integer) ids.get(2);
      Long idLong2 = (long) i;
      System.out.println(idLong2);
    }
  }
}
