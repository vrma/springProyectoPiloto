package com.capgemini.model;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

/*
 * DTO con los campos que (asumo) irán en el formulario de reserva. El identificador de la propiedad
 * es el id porque es lo primero que se me ocurrió, pero podría ser la dirección, depende de cómo
 * se vaya a implementar en la página.
 */
public class FormularioDto {
	
	// Campos del cliente
	private String nombre, primerApellido, segundoApellido;
	private String dni, correo, telefono;
	
	// Campos de la reserva
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate fechaEntrada, fechaSalida;
	private String propiedad;
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
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the fechaEntrada
	 */
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	/**
	 * @return the fechaSalida
	 */
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}
	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	/**
	 * @return the propiedad
	 */
	public String getPropiedad() {
		return propiedad;
	}
	/**
	 * @param propiedad the propiedad to set
	 */
	public void setPropiedad(String propiedad) {
		this.propiedad = propiedad;
	}
	
}
