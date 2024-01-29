package br.com.ada.pooii.aula04.Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String[] nomes = {"maria", "joana", "laura", "erica"};

    // COM CASTING (SEM GENERICS)

    Object obj = new Escolhedor(nomes).escolhe();
    // problema: o objeto retornado é do tipo Object - assim
    // nao conseguimos acessar as propriedades do tipo String
    // entao devemos fazer casting:

    String nome = (String) new Escolhedor(nomes).escolhe();


    // SEM CASTINS - USANDO GENERICS
    List<String> nomesLista = Arrays.asList("maria", "joana", "laura", "erica");
    String nomeEscolhido = new EscolhedorGenerico<String>(nomesLista).escolhe();
    System.out.println(nomeEscolhido.toUpperCase());

    // porque usar listas em vez de arrays?

    // covariantes
    Object[] arrayDeObjetos = new Long[10];
    // arrayDeObjetos[0] = "maria";
    // arrayDeObjetos[0] = 12; // vai gerar um erro: ArrayStoreException

    // invariante
    // ArrayList<Object> listaDeObj = new ArrayList<Long>(); // NÁO COMPILA
  }
}
