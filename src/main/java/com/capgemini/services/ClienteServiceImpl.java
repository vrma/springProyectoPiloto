package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.ClienteDao;
import com.capgemini.model.Cliente;

@Service("clienteService")
@Transactional
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao dao;
	
	@Override
	public List<Cliente> getClientes() {
		return dao.getClientes();
	}

	@Override
	public Cliente getClienteById(Integer id) {
		return dao.getClienteById(id);
	}

	@Override
	public Cliente getClienteByDni(String dni) {
		return dao.getClienteByDni(dni);
	}

	@Override
	public void saveCliente(Cliente cliente) {
		dao.saveCliente(cliente);
		
	}

	@Override
	public void deleteClienteByDni(String dni) {
		dao.deleteClienteByDni(dni);
		
	}

}
