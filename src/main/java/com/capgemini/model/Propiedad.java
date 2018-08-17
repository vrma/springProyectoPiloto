package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="propiedades")
public class Propiedad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_propiedad;
	
	@NotEmpty
	@Column(name = "direccion", unique=true, nullable = false)
	private String direccion;
	
	@NotEmpty
	@Column(name = "nombre", unique=true, nullable = false)
	private String nombre;

}
