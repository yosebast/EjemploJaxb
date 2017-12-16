package org.prueba.crearxsd2;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"idEmpleado", "nombre", "paterno", "materno"})
public class Empleado {

	
	private int idEmpleado;
	private String nombre;
	private String paterno;
	private String materno;
	public Empleado() {
		
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	
	
	
}
