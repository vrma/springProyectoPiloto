package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.dao.PropiedadDao;
import com.capgemini.model.Propiedad;


public class PropiedadServiceImpl implements PropiedadService{
	
	@Autowired
	private PropiedadDao pdao;

	@Override
	public List<Propiedad> getPropiedades() {
		// TODO Auto-generated method stub
		return pdao.getPropiedades();
	}
	

}
