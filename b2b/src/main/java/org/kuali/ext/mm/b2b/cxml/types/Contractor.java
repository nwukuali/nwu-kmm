//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.21 at 02:56:33 PM EDT 
//


package org.kuali.ext.mm.b2b.cxml.types;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ContractorIdentifier"/>
 *         &lt;element ref="{}Contact"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contractorIdentifier",
    "contact"
})
@XmlRootElement(name = "Contractor")
public class Contractor {

    @XmlElement(name = "ContractorIdentifier", required = true)
    protected ContractorIdentifier contractorIdentifier;
    @XmlElement(name = "Contact", required = true)
    protected Contact contact;

    /**
     * Gets the value of the contractorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorIdentifier }
     *     
     */
    public ContractorIdentifier getContractorIdentifier() {
        return contractorIdentifier;
    }

    /**
     * Sets the value of the contractorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorIdentifier }
     *     
     */
    public void setContractorIdentifier(ContractorIdentifier value) {
        this.contractorIdentifier = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

}