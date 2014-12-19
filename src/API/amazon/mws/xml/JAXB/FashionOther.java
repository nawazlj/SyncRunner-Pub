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
 *         &lt;element name="VariationData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parentage">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="parent"/>
 *                         &lt;enumeration value="child"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VariationTheme" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Length"/>
 *                         &lt;enumeration value="MetalType"/>
 *                         &lt;enumeration value="Length-MetalType"/>
 *                         &lt;enumeration value="Color"/>
 *                         &lt;enumeration value="StyleName"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Length" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="MetalType" type="{}StringNotNull" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Material" type="{}StringNotNull" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="MetalStamp" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TotalMetalWeight" type="{}JewelryWeightDimension" minOccurs="0"/>
 *         &lt;element name="Diameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Height" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Width" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="EstatePeriod" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfStones" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Stone" type="{}StoneType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="NumberOfPearls" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}Pearl" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="ModelYear" type="{}FourDigitYear" minOccurs="0"/>
 *         &lt;element name="Season" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="StyleKeywords" type="{}LongString" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="OccasionLifestyle" type="{}LongString" maxOccurs="5" minOccurs="0"/>
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
 *         &lt;element name="Battery" type="{}JewelryBattery" minOccurs="0"/>
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
    "variationData",
    "material",
    "metalStamp",
    "totalMetalWeight",
    "diameter",
    "height",
    "width",
    "estatePeriod",
    "numberOfStones",
    "stone",
    "numberOfPearls",
    "pearl",
    "sellerWarrantyDescription",
    "modelYear",
    "season",
    "countryOfOrigin",
    "styleKeywords",
    "occasionLifestyle",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "battery"
})
@XmlRootElement(name = "FashionOther")
public class FashionOther {

    @XmlElement(name = "VariationData")
    protected FashionOther.VariationData variationData;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> material;
    @XmlElement(name = "MetalStamp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String metalStamp;
    @XmlElement(name = "TotalMetalWeight")
    protected JewelryWeightDimension totalMetalWeight;
    @XmlElement(name = "Diameter")
    protected LengthDimension diameter;
    @XmlElement(name = "Height")
    protected LengthDimension height;
    @XmlElement(name = "Width")
    protected LengthDimension width;
    @XmlElement(name = "EstatePeriod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String estatePeriod;
    @XmlElement(name = "NumberOfStones")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfStones;
    @XmlElement(name = "Stone")
    protected List<StoneType> stone;
    @XmlElement(name = "NumberOfPearls")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPearls;
    @XmlElement(name = "Pearl")
    protected Pearl pearl;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sellerWarrantyDescription;
    @XmlElement(name = "ModelYear")
    protected BigInteger modelYear;
    @XmlElement(name = "Season")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String season;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "StyleKeywords")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> styleKeywords;
    @XmlElement(name = "OccasionLifestyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected List<String> occasionLifestyle;
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
    @XmlElement(name = "Battery")
    protected JewelryBattery battery;

    /**
     * Gets the value of the variationData property.
     * 
     * @return
     *     possible object is
     *     {@link FashionOther.VariationData }
     *     
     */
    public FashionOther.VariationData getVariationData() {
        return variationData;
    }

    /**
     * Sets the value of the variationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FashionOther.VariationData }
     *     
     */
    public void setVariationData(FashionOther.VariationData value) {
        this.variationData = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMaterial() {
        if (material == null) {
            material = new ArrayList<String>();
        }
        return this.material;
    }

    /**
     * Gets the value of the metalStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetalStamp() {
        return metalStamp;
    }

    /**
     * Sets the value of the metalStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetalStamp(String value) {
        this.metalStamp = value;
    }

    /**
     * Gets the value of the totalMetalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JewelryWeightDimension }
     *     
     */
    public JewelryWeightDimension getTotalMetalWeight() {
        return totalMetalWeight;
    }

    /**
     * Sets the value of the totalMetalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JewelryWeightDimension }
     *     
     */
    public void setTotalMetalWeight(JewelryWeightDimension value) {
        this.totalMetalWeight = value;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDiameter(LengthDimension value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHeight(LengthDimension value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWidth(LengthDimension value) {
        this.width = value;
    }

    /**
     * Gets the value of the estatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatePeriod() {
        return estatePeriod;
    }

    /**
     * Sets the value of the estatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatePeriod(String value) {
        this.estatePeriod = value;
    }

    /**
     * Gets the value of the numberOfStones property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfStones() {
        return numberOfStones;
    }

    /**
     * Sets the value of the numberOfStones property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfStones(BigInteger value) {
        this.numberOfStones = value;
    }

    /**
     * Gets the value of the stone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoneType }
     * 
     * 
     */
    public List<StoneType> getStone() {
        if (stone == null) {
            stone = new ArrayList<StoneType>();
        }
        return this.stone;
    }

    /**
     * Gets the value of the numberOfPearls property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPearls() {
        return numberOfPearls;
    }

    /**
     * Sets the value of the numberOfPearls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPearls(BigInteger value) {
        this.numberOfPearls = value;
    }

    /**
     * Gets the value of the pearl property.
     * 
     * @return
     *     possible object is
     *     {@link Pearl }
     *     
     */
    public Pearl getPearl() {
        return pearl;
    }

    /**
     * Sets the value of the pearl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pearl }
     *     
     */
    public void setPearl(Pearl value) {
        this.pearl = value;
    }

    /**
     * Gets the value of the sellerWarrantyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerWarrantyDescription() {
        return sellerWarrantyDescription;
    }

    /**
     * Sets the value of the sellerWarrantyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerWarrantyDescription(String value) {
        this.sellerWarrantyDescription = value;
    }

    /**
     * Gets the value of the modelYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModelYear() {
        return modelYear;
    }

    /**
     * Sets the value of the modelYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModelYear(BigInteger value) {
        this.modelYear = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeason(String value) {
        this.season = value;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the styleKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStyleKeywords() {
        if (styleKeywords == null) {
            styleKeywords = new ArrayList<String>();
        }
        return this.styleKeywords;
    }

    /**
     * Gets the value of the occasionLifestyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occasionLifestyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccasionLifestyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOccasionLifestyle() {
        if (occasionLifestyle == null) {
            occasionLifestyle = new ArrayList<String>();
        }
        return this.occasionLifestyle;
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
     * Gets the value of the battery property.
     * 
     * @return
     *     possible object is
     *     {@link JewelryBattery }
     *     
     */
    public JewelryBattery getBattery() {
        return battery;
    }

    /**
     * Sets the value of the battery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JewelryBattery }
     *     
     */
    public void setBattery(JewelryBattery value) {
        this.battery = value;
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
     *         &lt;element name="Parentage">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="parent"/>
     *               &lt;enumeration value="child"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VariationTheme" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Length"/>
     *               &lt;enumeration value="MetalType"/>
     *               &lt;enumeration value="Length-MetalType"/>
     *               &lt;enumeration value="Color"/>
     *               &lt;enumeration value="StyleName"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Length" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="MetalType" type="{}StringNotNull" minOccurs="0"/>
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
        "parentage",
        "variationTheme",
        "length",
        "metalType"
    })
    public static class VariationData {

        @XmlElement(name = "Parentage", required = true)
        protected String parentage;
        @XmlElement(name = "VariationTheme")
        protected String variationTheme;
        @XmlElement(name = "Length")
        protected LengthDimension length;
        @XmlElement(name = "MetalType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String metalType;

        /**
         * Gets the value of the parentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentage() {
            return parentage;
        }

        /**
         * Sets the value of the parentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentage(String value) {
            this.parentage = value;
        }

        /**
         * Gets the value of the variationTheme property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariationTheme() {
            return variationTheme;
        }

        /**
         * Sets the value of the variationTheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariationTheme(String value) {
            this.variationTheme = value;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link LengthDimension }
         *     
         */
        public LengthDimension getLength() {
            return length;
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link LengthDimension }
         *     
         */
        public void setLength(LengthDimension value) {
            this.length = value;
        }

        /**
         * Gets the value of the metalType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetalType() {
            return metalType;
        }

        /**
         * Sets the value of the metalType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetalType(String value) {
            this.metalType = value;
        }

    }

}
