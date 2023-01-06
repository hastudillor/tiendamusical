package com.henryastudillo.tiendamusicalentities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Henry Astudillo
 * 
 */
@Entity
@Table(name = "tipoidentificacion")
public class Tipoidentificacion extends Common {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idTipoIdentificacion")
	private int idTipoIdentificacion;

	@Column(name="nombre", length = 45, nullable=false)
	private String nombre;

	/**
	 * @return the idTipoIdentificacion
	 */
	public int getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	/**
	 * @param idTipoIdentificacion the idTipoIdentificacion to set
	 */
	public void setIdTipoIdentificacion(int idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
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

}