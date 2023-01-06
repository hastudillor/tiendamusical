/**
 * 
 */
package com.henryastudillo.tiendamusicaldata.dao.impl;

import com.henryastudillo.tiendamusicaldata.common.CommonDAO;
import com.henryastudillo.tiendamusicaldata.dao.PersonaDAO;
import com.henryastudillo.tiendamusicalentities.entities.Persona;

/**
 * @author Henry Astudillo
 * Clase que implementa el CRUD generico y las funciones de la interface de PersonaDAO.
 */
public class PersonaDAOImpl extends CommonDAO<Persona, PersonaDAO>{

	/**
	 * Metodo que permite consultar una persona por su usuario y contraseña.
	 * @param usuario {@link String} usuario capturado por la persona.
	 * @param password {@link String} contraseña capturada por la persona.
	 * @return {@link Persona} persona encontrada.
	 */
	public Persona findUsuarioAndPassword(String usuario, String password) {
		
		return this.repository.findByUsuarioAndPassword(usuario, password);
	}
}
