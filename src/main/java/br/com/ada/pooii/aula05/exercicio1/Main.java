package br.com.ada.pooii.aula05.exercicio1;

public class Main {
  public static void main(String[] args) {
    StackImpl<String> minhaStack = new StackImpl<>();

    System.out.println(minhaStack.isEmpty());
    minhaStack.push("lucia");
    minhaStack.push("maria");
    minhaStack.push("erica");
    minhaStack.push("paula");

    System.out.println(minhaStack.isEmpty());

    System.out.println(minhaStack.pop());

    String nome = minhaStack.pop();
    System.out.println(nome);

    System.out.println(minhaStack.peek());
    System.out.println(minhaStack.peek());
  }
}
