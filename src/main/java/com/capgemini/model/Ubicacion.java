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
@Table(name="ubicacion")
public class Ubicacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id_ubicacion;
	
	@NotEmpty
	@Column(name = "ubicacion", unique=true, nullable = false)
	private String ubicacion;
	
	@OneToMany(mappedBy = "ubicacion", fetch = FetchType.EAGER, cascade = {CascadeType.REMOVE, CascadeType.REMOVE})
	private List<Propiedad> propiedades;

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
		return "Ubicacion [id_ubicacion=" + id_ubicacion + ", ubicacion=" + ubicacion + ", propiedades=" + propiedades
				+ "]";
	}

	
	


}
