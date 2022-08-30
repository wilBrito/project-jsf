package controllers;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import dto.UsuarioDTO;

/**
 * 
 * @author wilson Clase que permite controlar el funcionamiento del login .xhtml
 */

@ManagedBean
public class LoginController implements Serializable{

	private String usuario;
	private String password;	
	
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;

	public void ingresar() {
		if (usuario.equals("wil") && password.equals("wil"))
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO(this.usuario, this.password);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
				e.printStackTrace();
			}
		else
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contaseña incorrectos", ""));
	}
	
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
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


	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}


	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

	
	
	
}
