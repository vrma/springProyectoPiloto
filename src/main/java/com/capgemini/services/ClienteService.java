package com.capgemini.services;

import java.util.List;

import com.capgemini.model.Cliente;

public interface ClienteService {
	
	List<Cliente> getClientes();
	Cliente getClienteById(Integer id);
	Cliente getClienteByDni(String dni);
	void saveCliente(Cliente cliente);
	void deleteClienteByDni(String dni);

}
