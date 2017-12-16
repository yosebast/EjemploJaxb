package org.prueba.EjemploJaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.prueba.schema_ejemplo.Capitulo;



public class Ejemplo {

	public static void main(String[] args) {
		

		try {
			
			final JAXBContext jc = JAXBContext.newInstance(Capitulo.class.getPackage().getName());
			final Unmarshaller u = jc.createUnmarshaller();
			@SuppressWarnings("unchecked")
			final JAXBElement<Capitulo> menuElement = (JAXBElement<Capitulo>) u.unmarshal(Ejemplo.class.getResourceAsStream("/Schema-ejemplo.xml"));
				System.out.println("ISBN: "+ menuElement.getValue().getIsbnLibro());	
				System.out.println("ID: "+ menuElement.getValue().getIdx());
				System.out.println("# Paginas: " + menuElement.getValue().getNumeroPaginas());
				System.out.println("Titulo: " + menuElement.getValue().getTitulo());
				
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		
	
	}

}
