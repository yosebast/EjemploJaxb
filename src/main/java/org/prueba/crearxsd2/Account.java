package org.prueba.crearxsd2;



import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;





@XmlType(name = "Account", propOrder = {
	    "accountNumber",
	    "accountName",
	    "accountBalance",
	    "accountStatus"
	})
@XmlRootElement
public class Account {
 
	
	    private String accountNumber;
	 
	    private String accountName;
	   
	    private double accountBalance;
	   
	    private EnumAccountStatus accountStatus;
	    
	    
	    
		public Account() {
			
		}



		public String getAccountNumber() {
			return accountNumber;
		}


		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}



		public String getAccountName() {
			return accountName;
		}


		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}



		public double getAccountBalance() {
			return accountBalance;
		}



		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}



		 public EnumAccountStatus getAccountStatus() {
		        return accountStatus;
		    }

		 
		    public void setAccountStatus(EnumAccountStatus value) {
		        this.accountStatus = value;
		    }




	
    
}
