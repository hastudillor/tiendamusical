/**
 * 
 */
package com.henryastudillo.tiendamusicalservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henryastudillo.tiendamusicaldata.dao.PersonaDAO;
import com.henryastudillo.tiendamusicalentities.entities.Persona;
import com.henryastudillo.tiendamusicalservices.service.LoginService;

/**
 * @author Henry Astudillo
 * Clase que implementa las funciones para la logica de negocio para la pantalla de login.
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private PersonaDAO personaDAOImpl;
	
	@Override
	public Persona consultarUsuarioLogin(String usuario, String password) {
		return this.personaDAOImpl.findByUsuarioAndPassword(usuario, password);
	}

}
