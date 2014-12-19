//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:15:27 PM EDT 
//


package API.amazon.mws.xml.JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;element name="MinimumManufacturerAgeRecommended" type="{}MinimumAgeRecommendedDimension" minOccurs="0"/>
 *         &lt;element name="MaximumManufacturerAgeRecommended" type="{}AgeRecommendedDimension" minOccurs="0"/>
 *         &lt;element name="MinimumMerchantAgeRecommended" type="{}MinimumAgeRecommendedDimension" minOccurs="0"/>
 *         &lt;element name="MaximumMerchantAgeRecommended" type="{}AgeRecommendedDimension" minOccurs="0"/>
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
    "minimumManufacturerAgeRecommended",
    "maximumManufacturerAgeRecommended",
    "minimumMerchantAgeRecommended",
    "maximumMerchantAgeRecommended"
})
@XmlRootElement(name = "AgeRecommendation")
public class AgeRecommendation {

    @XmlElement(name = "MinimumManufacturerAgeRecommended")
    protected MinimumAgeRecommendedDimension minimumManufacturerAgeRecommended;
    @XmlElement(name = "MaximumManufacturerAgeRecommended")
    protected AgeRecommendedDimension maximumManufacturerAgeRecommended;
    @XmlElement(name = "MinimumMerchantAgeRecommended")
    protected MinimumAgeRecommendedDimension minimumMerchantAgeRecommended;
    @XmlElement(name = "MaximumMerchantAgeRecommended")
    protected AgeRecommendedDimension maximumMerchantAgeRecommended;

    /**
     * Gets the value of the minimumManufacturerAgeRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAgeRecommendedDimension }
     *     
     */
    public MinimumAgeRecommendedDimension getMinimumManufacturerAgeRecommended() {
        return minimumManufacturerAgeRecommended;
    }

    /**
     * Sets the value of the minimumManufacturerAgeRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAgeRecommendedDimension }
     *     
     */
    public void setMinimumManufacturerAgeRecommended(MinimumAgeRecommendedDimension value) {
        this.minimumManufacturerAgeRecommended = value;
    }

    /**
     * Gets the value of the maximumManufacturerAgeRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link AgeRecommendedDimension }
     *     
     */
    public AgeRecommendedDimension getMaximumManufacturerAgeRecommended() {
        return maximumManufacturerAgeRecommended;
    }

    /**
     * Sets the value of the maximumManufacturerAgeRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRecommendedDimension }
     *     
     */
    public void setMaximumManufacturerAgeRecommended(AgeRecommendedDimension value) {
        this.maximumManufacturerAgeRecommended = value;
    }

    /**
     * Gets the value of the minimumMerchantAgeRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAgeRecommendedDimension }
     *     
     */
    public MinimumAgeRecommendedDimension getMinimumMerchantAgeRecommended() {
        return minimumMerchantAgeRecommended;
    }

    /**
     * Sets the value of the minimumMerchantAgeRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAgeRecommendedDimension }
     *     
     */
    public void setMinimumMerchantAgeRecommended(MinimumAgeRecommendedDimension value) {
        this.minimumMerchantAgeRecommended = value;
    }

    /**
     * Gets the value of the maximumMerchantAgeRecommended property.
     * 
     * @return
     *     possible object is
     *     {@link AgeRecommendedDimension }
     *     
     */
    public AgeRecommendedDimension getMaximumMerchantAgeRecommended() {
        return maximumMerchantAgeRecommended;
    }

    /**
     * Sets the value of the maximumMerchantAgeRecommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRecommendedDimension }
     *     
     */
    public void setMaximumMerchantAgeRecommended(AgeRecommendedDimension value) {
        this.maximumMerchantAgeRecommended = value;
    }

}