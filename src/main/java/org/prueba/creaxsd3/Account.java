package org.prueba.creaxsd3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountNumber",
    "accountName",
    "accountBalance",
    "accountStatus"
})@XmlRootElement
public class Account {

	@XmlElement
	private String accountNumber;
	@XmlElement
	private String accountName;
	@XmlElement
	private double accountBalance;
	@XmlElement
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
