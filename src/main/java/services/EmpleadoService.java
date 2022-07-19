package services;

import java.util.ArrayList;
import java.util.List;

import entity.Empleado;

/**
 * 
 * @author wil
 *
 */

public class EmpleadoService {

	public List<Empleado> consultarEmpleados(){
	
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado("Nombre1","Ap11","Ap21","P1",true);
		Empleado empleadoTesla = new Empleado("Nombre2","Ap12","Ap22","P2",true);
		Empleado empleadoApple = new Empleado("Nombre3","Ap13","Ap23","P3",true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoTesla);
		empleados.add(empleadoApple);
		
		
		return empleados;
	}
}
