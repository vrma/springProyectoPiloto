package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.ReservaDao;
import com.capgemini.model.Reserva;


@Service("reservaService")
@Transactional
public class ReservaServiceImpl {

	@Autowired
    private ReservaDao dao;
	
	
	public void saveReserva(Reserva reserva) {
        dao.saveReserva(reserva);
    }
	
	public List<Reserva> findAllReservas() {
        return dao.findAllReservas();
    }
}
