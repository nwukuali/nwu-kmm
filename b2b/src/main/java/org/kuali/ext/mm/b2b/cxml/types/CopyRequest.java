//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.21 at 02:56:33 PM EDT 
//


package org.kuali.ext.mm.b2b.cxml.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}cXMLAttachment"/>
 *         &lt;element ref="{}cXML"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cxmlAttachment",
    "cxml"
})
public class CopyRequest {

    @XmlElement(name = "cXMLAttachment")
    protected CXMLAttachment cxmlAttachment;
    @XmlElement(name = "cXML")
    protected CXML cxml;

    /**
     * Gets the value of the cxmlAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link CXMLAttachment }
     *     
     */
    public CXMLAttachment getCXMLAttachment() {
        return cxmlAttachment;
    }

    /**
     * Sets the value of the cxmlAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CXMLAttachment }
     *     
     */
    public void setCXMLAttachment(CXMLAttachment value) {
        this.cxmlAttachment = value;
    }

    /**
     * Gets the value of the cxml property.
     * 
     * @return
     *     possible object is
     *     {@link CXML }
     *     
     */
    public CXML getCXML() {
        return cxml;
    }

    /**
     * Sets the value of the cxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link CXML }
     *     
     */
    public void setCXML(CXML value) {
        this.cxml = value;
    }

}