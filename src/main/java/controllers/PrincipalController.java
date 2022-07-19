package controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entity.Empleado;
import services.EmpleadoService;

/**
 * 
 * @author wil
 *
 */

@ManagedBean
@ViewScoped
public class PrincipalController {

	private List<Empleado> empleados;
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	public void consultarEmpleados() {
		this.empleados = empleadoService.consultarEmpleados();
	}
}
