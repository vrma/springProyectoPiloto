package com.capgemini.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Reserva;


@Repository("reservaDao")
public class ReservaDaoImpl  extends AbstractDao<Integer, Reserva> implements ReservaDao{

	@Override
	public void saveReserva(Reserva reserva) {
		persist(reserva);	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> findAllReservas() {
		Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY); 
        return (List<Reserva>) criteria.list();
	}

}
