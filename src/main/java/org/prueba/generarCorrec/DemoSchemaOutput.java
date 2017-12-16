package org.prueba.generarCorrec;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class DemoSchemaOutput extends SchemaOutputResolver {

	
	private StringWriter stringWriter = new StringWriter(); 
	@Override
	public Result createOutput(String arg0, String arg1) throws IOException {
		// TODO Auto-generated method stub
		
		
		StreamResult result = new StreamResult(stringWriter);
		result.setSystemId(arg1); 
		return result;	
		
	}
	
	public String getSchema() { 
		return stringWriter.toString();
		}

}
