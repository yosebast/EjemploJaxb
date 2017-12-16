package org.prueba.creaxsd3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CreandoXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		JAXBContext ctx = JAXBContext.newInstance(Account.class);		
			Marshaller ms = ctx.createMarshaller();
			
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			Account object = new Account();
			
			object.setAccountStatus(EnumAccountStatus.ACTIVE);
			object.setAccountName("popular");
			object.setAccountNumber("123456789");
			object.setAccountBalance(2.36);
			
			
			
			 ms.marshal(object, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
