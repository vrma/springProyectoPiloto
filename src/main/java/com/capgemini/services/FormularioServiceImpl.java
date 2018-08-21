package com.capgemini.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.ClienteDao;
import com.capgemini.dao.PropiedadDao;
import com.capgemini.dao.ReservaDao;
import com.capgemini.model.Cliente;
import com.capgemini.model.FormularioDto;
import com.capgemini.model.Reserva;

@Service("formularioService")
@Transactional
public class FormularioServiceImpl implements FormularioService {
	
	@Autowired
	private ClienteDao clienteDao;
	
	@Autowired
	private PropiedadDao propiedadDao;
	
	@Autowired
	private ReservaDao reservaDao;

	@Override
	public void createReserva(FormularioDto formulario) {
		Cliente cliente = clienteDao.getClienteByDni(formulario.getDni());
		// Si el cliente no existe se crea uno nuevo.
		if (cliente == null) {
			cliente = new Cliente();
			cliente.setNombre(formulario.getNombre());
			cliente.setPrimerApellido(formulario.getPrimerApellido());
			cliente.setSegundoApellido(formulario.getSegundoApellido());
			cliente.setDni(formulario.getDni());
			cliente.setCorreo(formulario.getCorreo());
			cliente.setTelefono(formulario.getTelefono());
			clienteDao.saveCliente(cliente);
			// Necesito recuperarlo de la base para poder tener el id.
			cliente = clienteDao.getClienteByDni(formulario.getDni());
		}
		
		Reserva reserva = new Reserva();
		reserva.setCliente(cliente);
		reserva.setFechaEntrada(formulario.getFechaEntrada());
		reserva.setFechaSalida(formulario.getFechaSalida());
		// Necesito en PropiedadDao un método que permita devolver una única propiedad a partir de
		// algún identificador (id, dirección...)
		reserva.setPropiedad(propiedadDao.getPropiedadByDireccion(formulario.getPropiedad()));
		reservaDao.saveReserva(reserva);
	}

}
