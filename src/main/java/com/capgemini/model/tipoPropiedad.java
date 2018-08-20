package com.capgemini.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	
	@OneToMany(mappedBy = "tipoPropiedad", fetch = FetchType.EAGER, cascade = {CascadeType.REMOVE, CascadeType.REMOVE})
	private List<Propiedad> propiedades;


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


	/**
	 * @return the propiedades
	 */
	public List<Propiedad> getPropiedades() {
		return propiedades;
	}


	/**
	 * @param propiedades the propiedades to set
	 */
	public void setPropiedades(List<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "tipoPropiedad [id_tipoPropiedad=" + id_tipoPropiedad + ", descripcion=" + descripcion + ", propiedades="
				+ propiedades + "]";
	}



	

}
