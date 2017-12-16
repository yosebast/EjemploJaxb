package org.prueba.servicio;

import javax.xml.ws.Endpoint;

import org.prueba.servicio.AlumnosWS;

public class AlumnosServer {
	private static AlumnosWS alumnosWS = null;
	private static Endpoint endpointAlumnos = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnosServer server = new AlumnosServer();
		alumnosWS = new AlumnosWS();
		startWebServices();
		Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
            	stopWebServices(); 
                  
            }
		});

	}
	
	private static void startWebServices(){
		System.out.println("Iniciando Servicios");
		startAlumnosWS();
	
	}
	
	private static void startAlumnosWS(){
		String webServLocalHostConfig="http://localhost:9090/alumnos";
		endpointAlumnos = Endpoint.publish(webServLocalHostConfig, alumnosWS);
	}
	
	private static void stopWebServices(){
		System.out.println("Parando Servicios");
		stopAlumnosWS();
	}
	
	private static void stopAlumnosWS(){
		endpointAlumnos.stop();
	}
	
}
