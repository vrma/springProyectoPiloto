package com.capgemini.services;

import java.util.List;

import com.capgemini.model.Reserva;



public interface ReservaService {

	void saveReserva(Reserva reserva);
    
	 
    List<Reserva> findAllReservas();
}
