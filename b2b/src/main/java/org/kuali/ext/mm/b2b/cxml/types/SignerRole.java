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
 *         &lt;element ref="{}ClaimedRoles" minOccurs="0"/>
 *         &lt;element ref="{}CertifiedRoles" minOccurs="0"/>
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
    "claimedRoles",
    "certifiedRoles"
})
@XmlRootElement(name = "SignerRole")
public class SignerRole {

    @XmlElement(name = "ClaimedRoles")
    protected ClaimedRoles claimedRoles;
    @XmlElement(name = "CertifiedRoles")
    protected CertifiedRoles certifiedRoles;

    /**
     * Gets the value of the claimedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimedRoles }
     *     
     */
    public ClaimedRoles getClaimedRoles() {
        return claimedRoles;
    }

    /**
     * Sets the value of the claimedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimedRoles }
     *     
     */
    public void setClaimedRoles(ClaimedRoles value) {
        this.claimedRoles = value;
    }

    /**
     * Gets the value of the certifiedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedRoles }
     *     
     */
    public CertifiedRoles getCertifiedRoles() {
        return certifiedRoles;
    }

    /**
     * Sets the value of the certifiedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedRoles }
     *     
     */
    public void setCertifiedRoles(CertifiedRoles value) {
        this.certifiedRoles = value;
    }

}