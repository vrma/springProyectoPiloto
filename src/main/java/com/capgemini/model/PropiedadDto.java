package com.capgemini.model;

/*
 * DTO con los campos de las propiedades que deber�an enviarse a las p�ginas. Quita todo el rollo de las 
 * relaciones de clave externa. No incluyo los ids porque los del tipo y la ubicaci�n no tienen por qu�
 * enviarse a las vistas y la direcci�n al ser �nica ya sirve como identificador de la propiedad.
 * 
 * La capa PropiedadService deber�a devolver este objeto en los m�todos que vayan al controlador, as� que
 * habr�a que meter alg�n m�todo que conviertiera de Propiedad a PropiedadDto y viceversa.
 */
public class PropiedadDto {
	
	private String direccion;
	private String nombre;
	private String tipoPropiedad;
	private String ubicacion;
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the tipoPropiedad
	 */
	public String getTipoPropiedad() {
		return tipoPropiedad;
	}
	/**
	 * @param tipoPropiedad the tipoPropiedad to set
	 */
	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}
	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}
	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	

}
