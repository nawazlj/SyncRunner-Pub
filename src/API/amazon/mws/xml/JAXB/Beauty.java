//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:15:27 PM EDT 
//


package API.amazon.mws.xml.JAXB;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="ProductType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}BeautyMisc"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatteryTypeLithiumIon" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumMetal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryEnergyContent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryPackaging" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="batteries_contained_in_equipment"/>
 *               &lt;enumeration value="batteries_only"/>
 *               &lt;enumeration value="batteries_packed_with_equipment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LithiumBatteryVoltage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PlugType" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="SpecificUsesForProduct" type="{}StringNotNull" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="SunProtection" type="{}SunProtectionDimension" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{}VoltageDecimalDimension" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}WattageDimension" minOccurs="0"/>
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
    "productType",
    "batteryTypeLithiumIon",
    "batteryTypeLithiumMetal",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "plugType",
    "specificUsesForProduct",
    "sunProtection",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "Beauty")
public class Beauty {

    @XmlElement(name = "ProductType", required = true)
    protected Beauty.ProductType productType;
    @XmlElement(name = "BatteryTypeLithiumIon")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumIon;
    @XmlElement(name = "BatteryTypeLithiumMetal")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumMetal;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    protected BigDecimal lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    protected BigDecimal lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    protected BigDecimal lithiumBatteryWeight;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "PlugType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String plugType;
    @XmlElement(name = "SpecificUsesForProduct")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> specificUsesForProduct;
    @XmlElement(name = "SunProtection")
    protected SunProtectionDimension sunProtection;
    @XmlElement(name = "Voltage")
    protected VoltageDecimalDimension voltage;
    @XmlElement(name = "Wattage")
    protected WattageDimension wattage;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link Beauty.ProductType }
     *     
     */
    public Beauty.ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beauty.ProductType }
     *     
     */
    public void setProductType(Beauty.ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the batteryTypeLithiumIon property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryTypeLithiumIon() {
        return batteryTypeLithiumIon;
    }

    /**
     * Sets the value of the batteryTypeLithiumIon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryTypeLithiumIon(BigInteger value) {
        this.batteryTypeLithiumIon = value;
    }

    /**
     * Gets the value of the batteryTypeLithiumMetal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryTypeLithiumMetal() {
        return batteryTypeLithiumMetal;
    }

    /**
     * Sets the value of the batteryTypeLithiumMetal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryTypeLithiumMetal(BigInteger value) {
        this.batteryTypeLithiumMetal = value;
    }

    /**
     * Gets the value of the lithiumBatteryEnergyContent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLithiumBatteryEnergyContent() {
        return lithiumBatteryEnergyContent;
    }

    /**
     * Sets the value of the lithiumBatteryEnergyContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLithiumBatteryEnergyContent(BigDecimal value) {
        this.lithiumBatteryEnergyContent = value;
    }

    /**
     * Gets the value of the lithiumBatteryPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLithiumBatteryPackaging() {
        return lithiumBatteryPackaging;
    }

    /**
     * Sets the value of the lithiumBatteryPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLithiumBatteryPackaging(String value) {
        this.lithiumBatteryPackaging = value;
    }

    /**
     * Gets the value of the lithiumBatteryVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLithiumBatteryVoltage() {
        return lithiumBatteryVoltage;
    }

    /**
     * Sets the value of the lithiumBatteryVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLithiumBatteryVoltage(BigDecimal value) {
        this.lithiumBatteryVoltage = value;
    }

    /**
     * Gets the value of the lithiumBatteryWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLithiumBatteryWeight() {
        return lithiumBatteryWeight;
    }

    /**
     * Sets the value of the lithiumBatteryWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLithiumBatteryWeight(BigDecimal value) {
        this.lithiumBatteryWeight = value;
    }

    /**
     * Gets the value of the numberOfLithiumIonCells property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLithiumIonCells() {
        return numberOfLithiumIonCells;
    }

    /**
     * Sets the value of the numberOfLithiumIonCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLithiumIonCells(BigInteger value) {
        this.numberOfLithiumIonCells = value;
    }

    /**
     * Gets the value of the numberOfLithiumMetalCells property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLithiumMetalCells() {
        return numberOfLithiumMetalCells;
    }

    /**
     * Sets the value of the numberOfLithiumMetalCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLithiumMetalCells(BigInteger value) {
        this.numberOfLithiumMetalCells = value;
    }

    /**
     * Gets the value of the plugType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlugType() {
        return plugType;
    }

    /**
     * Sets the value of the plugType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlugType(String value) {
        this.plugType = value;
    }

    /**
     * Gets the value of the specificUsesForProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificUsesForProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificUsesForProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecificUsesForProduct() {
        if (specificUsesForProduct == null) {
            specificUsesForProduct = new ArrayList<String>();
        }
        return this.specificUsesForProduct;
    }

    /**
     * Gets the value of the sunProtection property.
     * 
     * @return
     *     possible object is
     *     {@link SunProtectionDimension }
     *     
     */
    public SunProtectionDimension getSunProtection() {
        return sunProtection;
    }

    /**
     * Sets the value of the sunProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SunProtectionDimension }
     *     
     */
    public void setSunProtection(SunProtectionDimension value) {
        this.sunProtection = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageDecimalDimension }
     *     
     */
    public VoltageDecimalDimension getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageDecimalDimension }
     *     
     */
    public void setVoltage(VoltageDecimalDimension value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the wattage property.
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getWattage() {
        return wattage;
    }

    /**
     * Sets the value of the wattage property.
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setWattage(WattageDimension value) {
        this.wattage = value;
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
     *       &lt;choice>
     *         &lt;element ref="{}BeautyMisc"/>
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
        "beautyMisc"
    })
    public static class ProductType {

        @XmlElement(name = "BeautyMisc")
        protected BeautyMisc beautyMisc;

        /**
         * Gets the value of the beautyMisc property.
         * 
         * @return
         *     possible object is
         *     {@link BeautyMisc }
         *     
         */
        public BeautyMisc getBeautyMisc() {
            return beautyMisc;
        }

        /**
         * Sets the value of the beautyMisc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BeautyMisc }
         *     
         */
        public void setBeautyMisc(BeautyMisc value) {
            this.beautyMisc = value;
        }

    }

}
