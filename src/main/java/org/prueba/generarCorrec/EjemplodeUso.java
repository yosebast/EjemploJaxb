package org.prueba.generarCorrec;

public class EjemplodeUso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class); 
		SchemaOutputResolver sor = new MySchemaOutputResolver(); 
		jaxbContext.generateSchema(sor); 
		public class MySchemaOutputResolver extends SchemaOutputResolver { 
			public Result createOutput(String namespaceURI, String suggestedFileName) throws IOException { 
				File file = new File(suggestedFileName); 
				StreamResult result = new StreamResult(file); 
				result.setSystemId(file.toURI().toURL().toString()); 
				return result; }
			} 
		
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class); 
		MySchemaOutputResolver sor = new MySchemaOutputResolver(); 
		
		jaxbContext.generateSchema(sor); 
		
		String schema = sor.getSchema(); 
		
		
		public class MySchemaOutputResolver extends SchemaOutputResolver { 
			private StringWriter stringWriter = new StringWriter(); 
			public Result createOutput(String namespaceURI, String suggestedFileName) throws IOException { 
				StreamResult result = new StreamResult(stringWriter);
				result.setSystemId(suggestedFileName); 
				return result;
				
			} 
			public String getSchema() { 
				return stringWriter.toString();
				}
			} 
		
		
		
		
		////////////////////////
		
		try {
		    StreamSource source = new StreamSource(new StringReader("<xml>blabla</xml>"));
		    StringWriter writer = new StringWriter();
		    StreamResult result = new StreamResult(writer);
		    TransformerFactory tFactory = TransformerFactory.newInstance();
		    Transformer transformer = tFactory.newTransformer();
		    transformer.transform(source,result);
		    String strResult = writer.toString();
		} catch (Exception e) {
		    e.printStackTrace();
		}*/
	}

}
