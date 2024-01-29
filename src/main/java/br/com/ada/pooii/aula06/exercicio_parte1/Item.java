package br.com.ada.pooii.aula06.exercicio_parte1;

import java.math.BigDecimal;

public record Item(
    String nome,
    String descricao,
    BigDecimal preco
) {
  // Detalhes do item
}
