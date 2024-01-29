package br.com.ada.pooii.aula04.Casting;

public class Principal {
  public static void main(String[] args) {


    // CASTING IMPLICITO
    // deve ser feito com os tipos primitivos em vez de wrappers
    long a = 123L;
    Integer b = (int) a;

    // todas as classes numericas herdam da classe Number
    Integer inteiro = 123;
    Number numero = inteiro;

    // casting implicito entre classes (gato herda de animal)
//    Animal animal = new Gato();


    // CASTING EXPLICITO
    long longo = 123L;
    //  int num = longo;
    // nao compila, porque pode haver perda de dados
    int num = (int) longo;
    // é necessário fazer o casting explicito
    // informando ao computdor que estamos cientes da possibilidade
    // de perda de dados

    // exemplos de perdas de dados:
    short st1 = 127;
    byte bt1 = (byte) st1;
    System.out.println(bt1); // 127

    short st2 = 128;
    byte bt2 = (byte) st2;
    System.out.println(bt2); // -128 -> passou 1, voltou para o menor short

    short st3 = 256;
    byte bt3 = (byte) st3;
    System.out.println(bt3); // 0

    short st4 = 257;
    byte bt4 = (byte) st4;
    System.out.println(bt4); // 1


  }
}

