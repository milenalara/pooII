package br.com.ada.pooii.aula05.solid;

public class Main4 {
  public static void main(String[] args) {
    // definindo o repositorio
    RespositoryMySQL mySql = new RespositoryMySQL(  );

    // novo pagamento recebido
    Pagamento novoPagamento = new Pagamento();

    // pedindo para o service efetuar o pagamento
    PagamentoService service = new PagamentoService(mySql);
    service.efetuarPagamento(novoPagamento);
  }
}

class PagamentoService { // responsavel pelas regras do pagamento
  // para a classe ser Single Responsability, ela nao pode salvar no banco

  public final Repositorio repository;

  public PagamentoService(Repositorio repository) {
    this.repository = repository;
  }

  public void efetuarPagamento(Pagamento pagamento) {
    repository.salvar(pagamento);
  }
}

interface Repositorio {
  public void salvar(Pagamento pagamento);

}

class RespositoryMySQL implements  Repositorio {
  @Override
  public void salvar(Pagamento pagamento) {
    System.out.println("Salvou o pagamento no mysql");
  }

}

class Pagamento {

}