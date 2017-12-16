//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.12 a las 09:35:45 AM CEST 
//


package org.prueba.crearxsd2.clases;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Account complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountBalance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountStatus" type="{http://www.example.org/Schema-Account}EnumAccountStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "acountNumber",
    "accountName",
    "accountBalance",
    "accountStatus"
})
public class Account {

    @XmlElement(name = "AcountNumber", required = true)
    protected String acountNumber;
    @XmlElement(name = "AccountName", required = true)
    protected String accountName;
    @XmlElement(name = "AccountBalance", required = true)
    protected String accountBalance;
    @XmlElement(name = "AccountStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EnumAccountStatus accountStatus;

    /**
     * Obtiene el valor de la propiedad acountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcountNumber() {
        return acountNumber;
    }

    /**
     * Define el valor de la propiedad acountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcountNumber(String value) {
        this.acountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad accountName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Define el valor de la propiedad accountName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Obtiene el valor de la propiedad accountBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalance() {
        return accountBalance;
    }

    /**
     * Define el valor de la propiedad accountBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalance(String value) {
        this.accountBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad accountStatus.
     * 
     * @return
     *     possible object is
     *     {@link EnumAccountStatus }
     *     
     */
    public EnumAccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Define el valor de la propiedad accountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAccountStatus }
     *     
     */
    public void setAccountStatus(EnumAccountStatus value) {
        this.accountStatus = value;
    }

}
