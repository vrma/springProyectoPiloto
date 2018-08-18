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
@Table(name="ubicacion")
public class Ubicacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ubicacion;
	
	@NotEmpty
	@Column(name = "ubicacion", unique=true, nullable = false)
	private String ubicacion;
	
	@ManyToOne(cascade = {CascadeType.REMOVE, CascadeType.REMOVE})
	@JoinColumn(name = "ubicacion_id")
	private Propiedad prop1;

	public int getId_ubicacion() {
		return id_ubicacion;
	}

	public void setId_ubicacion(int id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Propiedad getProp1() {
		return prop1;
	}

	public void setProp1(Propiedad prop1) {
		this.prop1 = prop1;
	}

	@Override
	public String toString() {
		return "Ubicacion [id_ubicacion=" + id_ubicacion + ", ubicacion=" + ubicacion + ", prop1=" + prop1 + "]";
	}
	


}
