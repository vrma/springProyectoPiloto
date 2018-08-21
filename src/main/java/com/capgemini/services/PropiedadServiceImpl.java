package com.capgemini.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.PropiedadDao;
import com.capgemini.model.Propiedad;
import com.capgemini.model.PropiedadDto;

@Service("propiedadService")
@Transactional
public class PropiedadServiceImpl implements PropiedadService{
	
	@Autowired
	private PropiedadDao propiedadService;

	@Override
	public List<PropiedadDto> getPropiedades() {
		// TODO Auto-generated method stub
		return toDto(propiedadService.getPropiedades());
	}
	
	private PropiedadDto toDto(Propiedad p) {
		PropiedadDto dto = new PropiedadDto();
		dto.setDireccion(p.getDireccion());
		dto.setNombre(p.getNombre());
		dto.setTipoPropiedad(p.getTipoPropiedad().getDescripcion());
		dto.setUbicacion(p.getUbicacion().getUbicacion());
		dto.setImagen(p.getImagen());
		return dto;
	}
	
	private List<PropiedadDto> toDto(List<Propiedad> propiedades) {
		List<PropiedadDto> dto = new ArrayList<>();
		for (Propiedad p : propiedades)
			dto.add(toDto(p));
		return dto;
	}
	

}
