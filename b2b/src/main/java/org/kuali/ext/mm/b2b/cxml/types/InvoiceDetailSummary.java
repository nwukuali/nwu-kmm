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
 *         &lt;element ref="{}SubtotalAmount"/>
 *         &lt;element ref="{}Tax"/>
 *         &lt;element ref="{}SpecialHandlingAmount" minOccurs="0"/>
 *         &lt;element ref="{}ShippingAmount" minOccurs="0"/>
 *         &lt;element ref="{}GrossAmount" minOccurs="0"/>
 *         &lt;element ref="{}InvoiceDetailDiscount" minOccurs="0"/>
 *         &lt;element ref="{}NetAmount"/>
 *         &lt;element ref="{}DepositAmount" minOccurs="0"/>
 *         &lt;element ref="{}DueAmount" minOccurs="0"/>
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
    "subtotalAmount",
    "tax",
    "specialHandlingAmount",
    "shippingAmount",
    "grossAmount",
    "invoiceDetailDiscount",
    "netAmount",
    "depositAmount",
    "dueAmount"
})
@XmlRootElement(name = "InvoiceDetailSummary")
public class InvoiceDetailSummary {

    @XmlElement(name = "SubtotalAmount", required = true)
    protected SubtotalAmount subtotalAmount;
    @XmlElement(name = "Tax", required = true)
    protected Tax tax;
    @XmlElement(name = "SpecialHandlingAmount")
    protected SpecialHandlingAmount specialHandlingAmount;
    @XmlElement(name = "ShippingAmount")
    protected ShippingAmount shippingAmount;
    @XmlElement(name = "GrossAmount")
    protected GrossAmount grossAmount;
    @XmlElement(name = "InvoiceDetailDiscount")
    protected InvoiceDetailDiscount invoiceDetailDiscount;
    @XmlElement(name = "NetAmount", required = true)
    protected NetAmount netAmount;
    @XmlElement(name = "DepositAmount")
    protected DepositAmount depositAmount;
    @XmlElement(name = "DueAmount")
    protected DueAmount dueAmount;

    /**
     * Gets the value of the subtotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SubtotalAmount }
     *     
     */
    public SubtotalAmount getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Sets the value of the subtotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtotalAmount }
     *     
     */
    public void setSubtotalAmount(SubtotalAmount value) {
        this.subtotalAmount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Tax }
     *     
     */
    public Tax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax }
     *     
     */
    public void setTax(Tax value) {
        this.tax = value;
    }

    /**
     * Gets the value of the specialHandlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialHandlingAmount }
     *     
     */
    public SpecialHandlingAmount getSpecialHandlingAmount() {
        return specialHandlingAmount;
    }

    /**
     * Sets the value of the specialHandlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialHandlingAmount }
     *     
     */
    public void setSpecialHandlingAmount(SpecialHandlingAmount value) {
        this.specialHandlingAmount = value;
    }

    /**
     * Gets the value of the shippingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAmount }
     *     
     */
    public ShippingAmount getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Sets the value of the shippingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAmount }
     *     
     */
    public void setShippingAmount(ShippingAmount value) {
        this.shippingAmount = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link GrossAmount }
     *     
     */
    public GrossAmount getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossAmount }
     *     
     */
    public void setGrossAmount(GrossAmount value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the invoiceDetailDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailDiscount }
     *     
     */
    public InvoiceDetailDiscount getInvoiceDetailDiscount() {
        return invoiceDetailDiscount;
    }

    /**
     * Sets the value of the invoiceDetailDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailDiscount }
     *     
     */
    public void setInvoiceDetailDiscount(InvoiceDetailDiscount value) {
        this.invoiceDetailDiscount = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NetAmount }
     *     
     */
    public NetAmount getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetAmount }
     *     
     */
    public void setNetAmount(NetAmount value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DepositAmount }
     *     
     */
    public DepositAmount getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositAmount }
     *     
     */
    public void setDepositAmount(DepositAmount value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the dueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DueAmount }
     *     
     */
    public DueAmount getDueAmount() {
        return dueAmount;
    }

    /**
     * Sets the value of the dueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DueAmount }
     *     
     */
    public void setDueAmount(DueAmount value) {
        this.dueAmount = value;
    }

}
