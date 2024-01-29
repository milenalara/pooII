package br.com.ada.pooii.aula05.revisaointerface;

public class Main {
  public static void main(String[] args) {
    // uma classe pode implementar mais de uma interface
    // uma interface pode herdar outra interface
    // mas nao pode implementar outra interface
  }
}

interface Animal{
  // todos os métodos na interface sao public abstract por padrao
  void comer();

  // uma interface pode ter métodos concretos
  // para criar os metodos concretos, usar "default"
  // isso vale a partir do java 8
  default void executarReproduzir(){

  }

  // podemos usar também metodos estáticos
  // só a propria interface terá acesso a ele
}

interface A {
  default void comer() {
    System.out.println("comendo da interface A");
  }
}

interface B {
  default void comer() {
    System.out.println("comendo da interface B");
  }
}

interface C extends A, B{

  @Override
  default void comer() {
    A.super.comer();
    // B.super.comer();
  }
}

interface Ave extends Animal, B {
  void voar();

  @Override
  default void comer() {

  }
}

// Interface com generics
interface InterfaceGenerica <T> {
  T get();
}

// genericos limitados
interface InterfaceGenLim <T extends A> {
  T get();
}

interface InterfaceGenLim2 <T extends A, B> {
  T get();
}

class D {
  public <T> void imprimir(T coisaParaImprimir) {
    System.out.println(coisaParaImprimir);
  }

  public static <T> void imprimirClasse(Class<T> classe) {
    System.out.println(classe.getSuperclass()); // MOSTRA O PAI

  }
}

// extend D e implementa A
interface InterfaceGenLim3 <T extends D & A> {
  T get();
}