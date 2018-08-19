package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Reserva;



public interface ReservaDao {
	
	void saveReserva(Reserva reserva);
    List<Reserva> findAllReservas();

}
