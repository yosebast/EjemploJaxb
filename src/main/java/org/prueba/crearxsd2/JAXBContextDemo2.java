package org.prueba.crearxsd2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;

import org.prueba.crearxsd.DemoSchemaOutputResolver;


public class JAXBContextDemo2 {

	public JAXBContextDemo2() {
	}
	
		
		public static void main(String[] args) {
			 FileInputStream fis = null;
		      try {
		         // create new JAXB context
		         JAXBContext context = JAXBContext.newInstance(Account.class);
		         
		         // create new schema out put resolver
		         SchemaOutputResolver sor = new DemoSchemaOutputResolver();
		 
		         // generate schema
		         context.generateSchema(sor);
		         
		         // create new file
		         File fi = new File("C://test.txt");
		         fis = new FileInputStream(fi);
		         
		         int i=0;
		         while((i=fis.read())!=-1)
		         {
		            char c=(char)i;
		            System.out.print(c);
		         }
		      }catch(Exception ex) {
		         
		         ex.printStackTrace();
		      }finally{
		         
		         if(fis!=null)
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		      }
		   }

	

}
