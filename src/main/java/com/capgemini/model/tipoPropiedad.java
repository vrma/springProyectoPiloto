package com.capgemini.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="tipo_propiedad")
public class tipoPropiedad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tipoPropiedad;
	
	@NotEmpty
	@Column(name = "descripcion", unique=true, nullable = false)
	private String descripcion;
	
	
	@ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.REMOVE})
	@JoinColumn(name = "tipo_propiedad_id")
	private Propiedad prop;


	public int getId_tipoPropiedad() {
		return id_tipoPropiedad;
	}


	public void setId_tipoPropiedad(int id_tipoPropiedad) {
		this.id_tipoPropiedad = id_tipoPropiedad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Propiedad getProp() {
		return prop;
	}


	public void setProp(Propiedad prop) {
		this.prop = prop;
	}


	@Override
	public String toString() {
		return "tipoPropiedad [id_tipoPropiedad=" + id_tipoPropiedad + ", descripcion=" + descripcion + ", prop=" + prop
				+ "]";
	}
	

}
