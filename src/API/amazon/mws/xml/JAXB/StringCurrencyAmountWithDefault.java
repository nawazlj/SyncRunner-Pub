//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:15:27 PM EDT 
//


package API.amazon.mws.xml.JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for StringCurrencyAmountWithDefault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringCurrencyAmountWithDefault">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>StringBasePriceCurrencyAmount">
 *       &lt;attribute name="currency" use="required" type="{}BaseCurrencyCodeWithDefault" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringCurrencyAmountWithDefault", propOrder = {
    "value"
})
@XmlSeeAlso({
    StringOverrideCurrencyAmount.class
})
public class StringCurrencyAmountWithDefault {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "currency", required = true)
    protected BaseCurrencyCodeWithDefault currency;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link BaseCurrencyCodeWithDefault }
     *     
     */
    public BaseCurrencyCodeWithDefault getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCurrencyCodeWithDefault }
     *     
     */
    public void setCurrency(BaseCurrencyCodeWithDefault value) {
        this.currency = value;
    }

}
