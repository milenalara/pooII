package br.com.ada.pooii.aula02.generics2;

import br.com.ada.pooii.aula01.Cliente;
import br.com.ada.pooii.aula01.Vendedor;

public class Generics2 {
  public static void main(String[] args) {
    // exemplos sem generic
    VendedorRepository vendedorRepository = new VendedorRepository();
    Vendedor vendedor = new Vendedor("Milena", 2500);
//    vendedorRepository.salvarVendedor(vendedor); // antes de implementar a interface Repositorio
    vendedorRepository.salvar(vendedor); // depois de implementar a interface Repositorio

    ClienteRepository clienteRepository = new ClienteRepository();
    Cliente cliente = new Cliente();
    clienteRepository.salvarCliente(cliente);

    // exemplos com generic
    GenericRepository<Vendedor> vendedorGenRep = new GenericRepository<>();
    vendedorGenRep.salvar(vendedor);

    GenericRepository<Cliente> vendedorGenCli = new GenericRepository<>();
    vendedorGenCli.salvar(cliente);
  }
}
