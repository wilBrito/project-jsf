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
		
		Empleado empleadoDisney = new Empleado("Nombre4","Ap14","Ap24","P4",true);
		Empleado empleadoNetflix = new Empleado("Nombre5","Ap15","Ap25","P5",true);
		Empleado empleadoOracle = new Empleado("Nombre6","Ap16","Ap26","P6",true);
		Empleado empleadoIFT = new Empleado("Nombre7","Ap17","Ap27","P7",true);
		Empleado empleadoNike = new Empleado("Nombre8","Ap18","Ap28","P8",true);
		Empleado empleadoGorda = new Empleado("Nombre9","Ap19","Ap29","P9",true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoTesla);
		empleados.add(empleadoApple);
		
		empleados.add(empleadoDisney);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoOracle);
		empleados.add(empleadoIFT);
		empleados.add(empleadoNike);
		empleados.add(empleadoGorda);
		
		
		return empleados;
	}
}
