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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountDetails" type="{http://neos.org/spring/ws/stub/account}account"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountDetails"
})
@XmlRootElement(name = "AccountDetailsResponse", namespace = "http://neos.org/spring/ws/stub/account")
public class AccountDetailsResponse {

    @XmlElement(name = "AccountDetails", namespace = "http://neos.org/spring/ws/stub/account", required = true)
    protected Account accountDetails;

    /**
     * Obtiene el valor de la propiedad accountDetails.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccountDetails() {
        return accountDetails;
    }

    /**
     * Define el valor de la propiedad accountDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccountDetails(Account value) {
        this.accountDetails = value;
    }

}
