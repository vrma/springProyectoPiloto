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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo_propiedad_id")
	private tipoPropiedad tipoPropiedad;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ubicacion_id")
	private Ubicacion ubicacion;

	public int getId_propiedad() {
		return id_propiedad;
	}

	public void setId_propiedad(int id_propiedad) {
		this.id_propiedad = id_propiedad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	/**
	 * @return the tipoPropiedad
	 */
	public tipoPropiedad getTipoPropiedad() {
		return tipoPropiedad;
	}

	/**
	 * @param tipoPropiedad the tipoPropiedad to set
	 */
	public void setTipoPropiedad(tipoPropiedad tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}

	/**
	 * @return the ubicacion
	 */
	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_propiedad;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propiedad other = (Propiedad) obj;
		if (id_propiedad != other.id_propiedad)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Propiedad [id_propiedad=" + id_propiedad + ", direccion=" + direccion + ", nombre=" + nombre
				+ ", tipoPropiedad=" + tipoPropiedad + ", ubicacion=" + ubicacion + "]";
	}

	
	
	
	

}
