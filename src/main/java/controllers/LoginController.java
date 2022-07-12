package controllers;

import javax.faces.bean.ManagedBean;

/**
 * 
 * @author wilson
 * Clase que permite controlar el funcionamiento del login .xhtml
 */


@ManagedBean
public class LoginController {

	private String usuario;
	private String password;
	
	public void ingresar() {
		System.out.println("Usuario: " + this.usuario);
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
