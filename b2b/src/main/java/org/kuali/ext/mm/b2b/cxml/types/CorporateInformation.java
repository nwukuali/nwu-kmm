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
 *         &lt;element ref="{}AnnualRevenue" minOccurs="0"/>
 *         &lt;element ref="{}StateOfIncorporation" minOccurs="0"/>
 *         &lt;element ref="{}OwnershipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="yearFounded" type="{}uint" />
 *       &lt;attribute name="numberOfEmployees" type="{}uint" />
 *       &lt;attribute name="organizationType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "annualRevenue",
    "stateOfIncorporation",
    "ownershipType"
})
@XmlRootElement(name = "CorporateInformation")
public class CorporateInformation {

    @XmlElement(name = "AnnualRevenue")
    protected AnnualRevenue annualRevenue;
    @XmlElement(name = "StateOfIncorporation")
    protected StateOfIncorporation stateOfIncorporation;
    @XmlElement(name = "OwnershipType")
    protected List<OwnershipType> ownershipType;
    @XmlAttribute
    protected String yearFounded;
    @XmlAttribute
    protected String numberOfEmployees;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String organizationType;

    /**
     * Gets the value of the annualRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualRevenue }
     *     
     */
    public AnnualRevenue getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Sets the value of the annualRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualRevenue }
     *     
     */
    public void setAnnualRevenue(AnnualRevenue value) {
        this.annualRevenue = value;
    }

    /**
     * Gets the value of the stateOfIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link StateOfIncorporation }
     *     
     */
    public StateOfIncorporation getStateOfIncorporation() {
        return stateOfIncorporation;
    }

    /**
     * Sets the value of the stateOfIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateOfIncorporation }
     *     
     */
    public void setStateOfIncorporation(StateOfIncorporation value) {
        this.stateOfIncorporation = value;
    }

    /**
     * Gets the value of the ownershipType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownershipType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnershipType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnershipType }
     * 
     * 
     */
    public List<OwnershipType> getOwnershipType() {
        if (ownershipType == null) {
            ownershipType = new ArrayList<OwnershipType>();
        }
        return this.ownershipType;
    }

    /**
     * Gets the value of the yearFounded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearFounded() {
        return yearFounded;
    }

    /**
     * Sets the value of the yearFounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearFounded(String value) {
        this.yearFounded = value;
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfEmployees(String value) {
        this.numberOfEmployees = value;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }

}
