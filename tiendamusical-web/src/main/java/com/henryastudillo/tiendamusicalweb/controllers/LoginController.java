/**
 * 
 */
package com.henryastudillo.tiendamusicalweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.henryastudillo.tiendamusicalentities.entities.Persona;
import com.henryastudillo.tiendamusicalservices.service.LoginService;
import com.henryastudillo.tiendamusicalweb.utils.CommonUtils;

/**
 * @author Henry Astudillo
 * Controlador que se encarga del flujo de la pantalla de login.xhtml
 *
 */
@ManagedBean
@ViewScoped
public class LoginController {
	/**
	 * Usuario capturado por la persona
	 */
	private String usuario;
	/**
	 * Contraseña capturado por la persona
	 */
	private String password;
	
	/**
	 * Propiedad de la logica de negocio inyectada con JSF y Spring
	 */
	@ManagedProperty("#{loginServiceImpl}")
	private LoginService loginServiceImpl;
	
	/**
	 * @return the loginServiceImpl
	 */
	public LoginService getLoginServiceImpl() {
		return loginServiceImpl;
	}

	/**
	 * @param loginServiceImpl the loginServiceImpl to set
	 */
	public void setLoginServiceImpl(LoginService loginServiceImpl) {
		this.loginServiceImpl = loginServiceImpl;
	}

	@PostConstruct
	public void init() {
		System.out.println("Inicializando login...");
	}
	
	/**
	 * Metodo que permite a la persona ingresar a su pantalla de home
	 */
	public void ingresar() {
		Persona personaConsultada = this.loginServiceImpl.consultarUsuarioLogin(this.usuario, this.password);
		
		if (personaConsultada != null) {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡EXITOSO!", "Bienvenido al home :)");
		} else {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "¡Ups!", "El usuario y contraseña con incorrectos");
		}
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
