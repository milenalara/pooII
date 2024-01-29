package br.com.ada.pooii.aula07.exercicio_parte2;

import java.math.BigDecimal;

public record Item(
    String nome,
    String descricao,
    BigDecimal preco
) {
  // Detalhes do item
}
