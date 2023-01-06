/**
 * 
 */
package com.henryastudillo.tiendamusicaldata.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.henryastudillo.tiendamusicalentities.entities.Persona;

/**
 * @author Henry Astudillo 
 * Clase DAO que realiza el CRUD con SpringJPA para la tabla de persona.
 */
public interface PersonaDAO extends PagingAndSortingRepository<Persona, Long> {

	/**
	 * Metodo que permite consultar el usuario que trata de ingresar a la sesion.
	 * @param usuario {@link String} usuario capturado por la persona.
	 * @param password {@link String} usuario capturado por la persona.
	 * @return {@link Persona} objeto con la persona encontrada.
	 */
	@Query("Select p from Persona p WHERE p.usuario=?1 AND p.password=?2")
	Persona findByUsuarioAndPassword(String usuario, String password);
}