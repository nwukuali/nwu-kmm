//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.21 at 02:56:33 PM EDT 
//


package org.kuali.ext.mm.b2b.cxml.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for cxml.paymentMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cxml.paymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ach"/>
 *     &lt;enumeration value="cash"/>
 *     &lt;enumeration value="check"/>
 *     &lt;enumeration value="creditCard"/>
 *     &lt;enumeration value="debitCard"/>
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="wire"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum CxmlPaymentMethod {

    @XmlEnumValue("ach")
    ACH("ach"),
    @XmlEnumValue("cash")
    CASH("cash"),
    @XmlEnumValue("check")
    CHECK("check"),
    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("debitCard")
    DEBIT_CARD("debitCard"),
    @XmlEnumValue("draft")
    DRAFT("draft"),
    @XmlEnumValue("wire")
    WIRE("wire"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CxmlPaymentMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CxmlPaymentMethod fromValue(String v) {
        for (CxmlPaymentMethod c: CxmlPaymentMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
