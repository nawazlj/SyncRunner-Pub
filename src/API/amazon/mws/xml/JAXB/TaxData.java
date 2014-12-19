//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:15:27 PM EDT 
//


package API.amazon.mws.xml.JAXB;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TaxData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxJurisdictions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxLocationCode" type="{}String"/>
 *                   &lt;element name="City" type="{}String"/>
 *                   &lt;element name="County" type="{}String"/>
 *                   &lt;element name="State" type="{}String"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxableAmounts" type="{}TaxDataSubtype"/>
 *         &lt;element name="NonTaxableAmounts" type="{}TaxDataSubtype"/>
 *         &lt;element name="ZeroRatedAmounts" type="{}TaxDataSubtype"/>
 *         &lt;element name="TaxCollectedAmounts" type="{}TaxDataSubtype"/>
 *         &lt;element name="TaxRates">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="District" type="{}TaxRate"/>
 *                   &lt;element name="City" type="{}TaxRate"/>
 *                   &lt;element name="County" type="{}TaxRate"/>
 *                   &lt;element name="State" type="{}TaxRate"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxData", propOrder = {
    "taxJurisdictions",
    "taxableAmounts",
    "nonTaxableAmounts",
    "zeroRatedAmounts",
    "taxCollectedAmounts",
    "taxRates"
})
public class TaxData {

    @XmlElement(name = "TaxJurisdictions", required = true)
    protected TaxData.TaxJurisdictions taxJurisdictions;
    @XmlElement(name = "TaxableAmounts", required = true)
    protected TaxDataSubtype taxableAmounts;
    @XmlElement(name = "NonTaxableAmounts", required = true)
    protected TaxDataSubtype nonTaxableAmounts;
    @XmlElement(name = "ZeroRatedAmounts", required = true)
    protected TaxDataSubtype zeroRatedAmounts;
    @XmlElement(name = "TaxCollectedAmounts", required = true)
    protected TaxDataSubtype taxCollectedAmounts;
    @XmlElement(name = "TaxRates", required = true)
    protected TaxData.TaxRates taxRates;

    /**
     * Gets the value of the taxJurisdictions property.
     * 
     * @return
     *     possible object is
     *     {@link TaxData.TaxJurisdictions }
     *     
     */
    public TaxData.TaxJurisdictions getTaxJurisdictions() {
        return taxJurisdictions;
    }

    /**
     * Sets the value of the taxJurisdictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData.TaxJurisdictions }
     *     
     */
    public void setTaxJurisdictions(TaxData.TaxJurisdictions value) {
        this.taxJurisdictions = value;
    }

    /**
     * Gets the value of the taxableAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDataSubtype }
     *     
     */
    public TaxDataSubtype getTaxableAmounts() {
        return taxableAmounts;
    }

    /**
     * Sets the value of the taxableAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataSubtype }
     *     
     */
    public void setTaxableAmounts(TaxDataSubtype value) {
        this.taxableAmounts = value;
    }

    /**
     * Gets the value of the nonTaxableAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDataSubtype }
     *     
     */
    public TaxDataSubtype getNonTaxableAmounts() {
        return nonTaxableAmounts;
    }

    /**
     * Sets the value of the nonTaxableAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataSubtype }
     *     
     */
    public void setNonTaxableAmounts(TaxDataSubtype value) {
        this.nonTaxableAmounts = value;
    }

    /**
     * Gets the value of the zeroRatedAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDataSubtype }
     *     
     */
    public TaxDataSubtype getZeroRatedAmounts() {
        return zeroRatedAmounts;
    }

    /**
     * Sets the value of the zeroRatedAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataSubtype }
     *     
     */
    public void setZeroRatedAmounts(TaxDataSubtype value) {
        this.zeroRatedAmounts = value;
    }

    /**
     * Gets the value of the taxCollectedAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDataSubtype }
     *     
     */
    public TaxDataSubtype getTaxCollectedAmounts() {
        return taxCollectedAmounts;
    }

    /**
     * Sets the value of the taxCollectedAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataSubtype }
     *     
     */
    public void setTaxCollectedAmounts(TaxDataSubtype value) {
        this.taxCollectedAmounts = value;
    }

    /**
     * Gets the value of the taxRates property.
     * 
     * @return
     *     possible object is
     *     {@link TaxData.TaxRates }
     *     
     */
    public TaxData.TaxRates getTaxRates() {
        return taxRates;
    }

    /**
     * Sets the value of the taxRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData.TaxRates }
     *     
     */
    public void setTaxRates(TaxData.TaxRates value) {
        this.taxRates = value;
    }


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
     *         &lt;element name="TaxLocationCode" type="{}String"/>
     *         &lt;element name="City" type="{}String"/>
     *         &lt;element name="County" type="{}String"/>
     *         &lt;element name="State" type="{}String"/>
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
        "taxLocationCode",
        "city",
        "county",
        "state"
    })
    public static class TaxJurisdictions {

        @XmlElement(name = "TaxLocationCode", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String taxLocationCode;
        @XmlElement(name = "City", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String city;
        @XmlElement(name = "County", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String county;
        @XmlElement(name = "State", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String state;

        /**
         * Gets the value of the taxLocationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxLocationCode() {
            return taxLocationCode;
        }

        /**
         * Sets the value of the taxLocationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxLocationCode(String value) {
            this.taxLocationCode = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the county property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounty() {
            return county;
        }

        /**
         * Sets the value of the county property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounty(String value) {
            this.county = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

    }


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
     *         &lt;element name="District" type="{}TaxRate"/>
     *         &lt;element name="City" type="{}TaxRate"/>
     *         &lt;element name="County" type="{}TaxRate"/>
     *         &lt;element name="State" type="{}TaxRate"/>
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
        "district",
        "city",
        "county",
        "state"
    })
    public static class TaxRates {

        @XmlElement(name = "District", required = true)
        protected BigDecimal district;
        @XmlElement(name = "City", required = true)
        protected BigDecimal city;
        @XmlElement(name = "County", required = true)
        protected BigDecimal county;
        @XmlElement(name = "State", required = true)
        protected BigDecimal state;

        /**
         * Gets the value of the district property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDistrict() {
            return district;
        }

        /**
         * Sets the value of the district property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDistrict(BigDecimal value) {
            this.district = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCity(BigDecimal value) {
            this.city = value;
        }

        /**
         * Gets the value of the county property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCounty() {
            return county;
        }

        /**
         * Sets the value of the county property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCounty(BigDecimal value) {
            this.county = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setState(BigDecimal value) {
            this.state = value;
        }

    }

}