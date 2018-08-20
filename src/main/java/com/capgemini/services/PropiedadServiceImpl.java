package com.capgemini.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.PropiedadDao;
import com.capgemini.model.Propiedad;

@Service("propiedadService")
@Transactional
public class PropiedadServiceImpl implements PropiedadService{
	
	@Autowired
	private PropiedadDao propiedadService;

	@Override
	public List<Propiedad> getPropiedades() {
		// TODO Auto-generated method stub
		return propiedadService.getPropiedades();
	}
	

}
