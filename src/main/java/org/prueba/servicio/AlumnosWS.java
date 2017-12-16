package org.prueba.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.prueba.dtos.AlumnoDTO;

@WebService(name="alumnosWS")
public class AlumnosWS {
	
	@WebMethod public @WebResult(name="alumnos") List<AlumnoDTO> obtenerTodosAlumnos(){
		
		List<AlumnoDTO> alumnos = new ArrayList<AlumnoDTO>();
		AlumnoDTO raul = new AlumnoDTO();
		raul.setDni("44558883V");
		raul.setNombre("Raul");
		raul.setApellidos("Vicente Gonzalez");
		raul.setDireccion("Bersolari Uztapide");
		
		AlumnoDTO sherlock = new AlumnoDTO();
		sherlock.setDni("44669988P");
		sherlock.setNombre("Sherlock");
		sherlock.setApellidos("Holmes");
		sherlock.setDireccion("Baker Street, 10");
		
		alumnos.add(raul);
		alumnos.add(sherlock);
		return alumnos;
	}

}
