package br.com.ada.pooii.aula04.Generics;

import java.util.Random;

public class Escolhedor {
  private Object[] arrayParaEscolha;

  public Escolhedor(Object[] arrayParaEscolha) {
    this.arrayParaEscolha = arrayParaEscolha;
  }

  public Object escolhe(){
    // obtendo um numero randomico
    Random random = new Random();
    int numeroRandomico = random.nextInt(arrayParaEscolha.length);
    Object retorno = this.arrayParaEscolha[numeroRandomico];
    return retorno;

  }

}
