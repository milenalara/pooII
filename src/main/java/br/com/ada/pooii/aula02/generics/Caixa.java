package br.com.ada.pooii.aula02.generics;

public class Caixa<TIPO> {
  private TIPO obj;

  public Caixa(TIPO obj) {
    this.obj = obj;
  }

  public TIPO getObj(){
    return obj;
  }


}
