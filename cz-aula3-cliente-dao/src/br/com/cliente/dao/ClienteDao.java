package br.com.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cliente.model.Cliente;


public class ClienteDao {

	private List<Cliente> clientes;
	
	public ClienteDao(){
		initMock();
	}
	
	private void initMock() {
		
		clientes = new ArrayList<Cliente>();
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(3);
		cliente1.setNome("Ricardo");
		cliente1.setSobreNome("Mundim");
		cliente1.setIdade(38);
		cliente1.setTelefone("999999999");
		
		clientes.add(cliente1);
		/*
		 * Usando o construtor
		 */
		clientes.add(new Cliente(1,"Amanda","Mundim",36,"999419999"));
		clientes.add(new Cliente(2,"Jandeilson","Nascimento",30,"99999"));

	}
	
	public List<Cliente> obterTodosClientes(){
		return this.clientes;
	}
	
	
	
	
}
