package br.com.ada.pooii.aula04.Casting;

public record Animal(String nome, double tamanho) implements Comparable<Animal> {

  @Override
  public int compareTo(Animal o) {
    if (o.tamanho() > this.tamanho()) {
      return -1;
    } else if (o.tamanho() == this.tamanho()) {
      return 0;
    } else {
      return 1;
    }
  }
}
