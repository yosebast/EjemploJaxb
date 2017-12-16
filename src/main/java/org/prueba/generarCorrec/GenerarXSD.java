package org.prueba.generarCorrec;


import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;


public class GenerarXSD {

	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub	
		
		//esta es la forma correcta de obtener un xsd    a partir de una clase solo se genera no se crea ningun fichero en la nas por que no es neceario   sino
		//obtengo el xsd  por consola por ejemplo para verlo  o directamente el resultado se usa para lo que se quiera   lo que psa es que esto cuando le damos un
		//tipo de dato raro   no funciona por ejemplo con el tipo de dato  java.sql.Blob;
		
		
		         // create new JAXB context
		         JAXBContext context = JAXBContext.newInstance(Productos.class);
		         
		         // create new schema out put resolver
		         SchemaOutputResolver sor = new DemoSchemaOutput();
		         
		         	
		 
		         // generate schema
		         context.generateSchema(sor);
		  
		         String schema = ((DemoSchemaOutput) sor).getSchema();
		         
		         System.out.println(schema);
	}

}
