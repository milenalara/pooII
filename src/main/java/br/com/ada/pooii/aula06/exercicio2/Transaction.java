package br.com.ada.pooii.aula06.exercicio2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
  private BigDecimal amount;
  private String stock;
  private LocalDateTime created;

  public Transaction(BigDecimal amount, String stock) {
    this.amount = amount;
    this.stock = stock;
    this.created = LocalDateTime.now();
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public String getStock() {
    return "";
  }
}
