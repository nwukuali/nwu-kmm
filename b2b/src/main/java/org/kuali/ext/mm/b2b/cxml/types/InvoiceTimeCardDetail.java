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
 *       &lt;choice>
 *         &lt;element ref="{}TimeCardReference"/>
 *         &lt;element ref="{}TimeCardIDInfo"/>
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
    "timeCardReference",
    "timeCardIDInfo"
})
@XmlRootElement(name = "InvoiceTimeCardDetail")
public class InvoiceTimeCardDetail {

    @XmlElement(name = "TimeCardReference")
    protected TimeCardReference timeCardReference;
    @XmlElement(name = "TimeCardIDInfo")
    protected TimeCardIDInfo timeCardIDInfo;

    /**
     * Gets the value of the timeCardReference property.
     * 
     * @return
     *     possible object is
     *     {@link TimeCardReference }
     *     
     */
    public TimeCardReference getTimeCardReference() {
        return timeCardReference;
    }

    /**
     * Sets the value of the timeCardReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCardReference }
     *     
     */
    public void setTimeCardReference(TimeCardReference value) {
        this.timeCardReference = value;
    }

    /**
     * Gets the value of the timeCardIDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeCardIDInfo }
     *     
     */
    public TimeCardIDInfo getTimeCardIDInfo() {
        return timeCardIDInfo;
    }

    /**
     * Sets the value of the timeCardIDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeCardIDInfo }
     *     
     */
    public void setTimeCardIDInfo(TimeCardIDInfo value) {
        this.timeCardIDInfo = value;
    }

}
