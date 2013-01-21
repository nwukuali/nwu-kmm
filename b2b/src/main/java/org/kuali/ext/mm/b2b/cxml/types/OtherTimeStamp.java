//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.21 at 02:56:33 PM EDT 
//


package org.kuali.ext.mm.b2b.cxml.types;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}ReferenceInfo" maxOccurs="unbounded"/>
 *         &lt;element ref="{}CanonicalizationMethod" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}EncapsulatedTimeStamp"/>
 *           &lt;element ref="{}XMLTimeStamp"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "referenceInfo",
    "canonicalizationMethod",
    "encapsulatedTimeStamp",
    "xmlTimeStamp"
})
@XmlRootElement(name = "OtherTimeStamp")
public class OtherTimeStamp {

    @XmlElement(name = "ReferenceInfo", required = true)
    protected List<ReferenceInfo> referenceInfo;
    @XmlElement(name = "CanonicalizationMethod")
    protected CanonicalizationMethod canonicalizationMethod;
    @XmlElement(name = "EncapsulatedTimeStamp")
    protected EncapsulatedTimeStamp encapsulatedTimeStamp;
    @XmlElement(name = "XMLTimeStamp")
    protected String xmlTimeStamp;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the referenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfo }
     * 
     * 
     */
    public List<ReferenceInfo> getReferenceInfo() {
        if (referenceInfo == null) {
            referenceInfo = new ArrayList<ReferenceInfo>();
        }
        return this.referenceInfo;
    }

    /**
     * Gets the value of the canonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CanonicalizationMethod }
     *     
     */
    public CanonicalizationMethod getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Sets the value of the canonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanonicalizationMethod }
     *     
     */
    public void setCanonicalizationMethod(CanonicalizationMethod value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Gets the value of the encapsulatedTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedTimeStamp }
     *     
     */
    public EncapsulatedTimeStamp getEncapsulatedTimeStamp() {
        return encapsulatedTimeStamp;
    }

    /**
     * Sets the value of the encapsulatedTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedTimeStamp }
     *     
     */
    public void setEncapsulatedTimeStamp(EncapsulatedTimeStamp value) {
        this.encapsulatedTimeStamp = value;
    }

    /**
     * Gets the value of the xmlTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLTimeStamp() {
        return xmlTimeStamp;
    }

    /**
     * Sets the value of the xmlTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLTimeStamp(String value) {
        this.xmlTimeStamp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
