//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.10.31 a las 12:44:57 PM CST 
//


package org.neos.spring.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para account complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="AccountStatus" type="{http://neos.org/spring/ws/stub/account}enumAccountStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account", namespace = "http://neos.org/spring/ws/stub/account", propOrder = {
    "accountNumber",
    "accountName",
    "accountBalance",
    "accountStatus"
})
public class Account {

    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "AccountName", required = true)
    protected String accountName;
    @XmlElement(name = "AccountBalance")
    protected double accountBalance;
    @XmlElement(name = "AccountStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EnumAccountStatus accountStatus;

    /**
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
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
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Define el valor de la propiedad accountBalance.
     * 
     */
    public void setAccountBalance(double value) {
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
