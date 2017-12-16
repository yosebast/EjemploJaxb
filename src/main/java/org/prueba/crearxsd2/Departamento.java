package org.prueba.crearxsd2;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Departamento {

	private List<Empleado> empleados;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public List<Empleado> getEmpleado() {
		return empleados;
	}

	@XmlElement(name="empleado")
	public void setEmpleado(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
