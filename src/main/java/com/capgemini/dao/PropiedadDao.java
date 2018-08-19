package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Propiedad;

public interface PropiedadDao {

	List<Propiedad> getPropiedades();

	Propiedad getPropiedadById(Integer id);
}
