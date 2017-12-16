package org.prueba.creaxsd3;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;



@WebService(name="AccountService")
public class CuentaServicio {	
		
		@WebMethod public @WebResult(name="AccountDetails") Account getAccount(@WebParam (name="accountNumber")String accountNumber ){
			
			Account account = new Account();
			
			account.setAccountBalance(2.36);
			account.setAccountName("popular");
			account.setAccountNumber("123456789");
			account.setAccountStatus(EnumAccountStatus.ACTIVE);
					
			
			return account;
		}
}
