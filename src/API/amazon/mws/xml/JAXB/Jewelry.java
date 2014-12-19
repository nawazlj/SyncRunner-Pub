//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:15:27 PM EDT 
//


package API.amazon.mws.xml.JAXB;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *                   &lt;element ref="{}Watch"/>
 *                   &lt;element ref="{}FashionNecklaceBraceletAnklet"/>
 *                   &lt;element ref="{}FashionRing"/>
 *                   &lt;element ref="{}FashionEarring"/>
 *                   &lt;element ref="{}FashionOther"/>
 *                   &lt;element ref="{}FineNecklaceBraceletAnklet"/>
 *                   &lt;element ref="{}FineRing"/>
 *                   &lt;element ref="{}FineEarring"/>
 *                   &lt;element ref="{}FineOther"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatteryAverageLife" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLifeStandby" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="BatteryChargeTime" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="MaxOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionLabor" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionParts" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RegionOfOrigin" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SizeMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{}StringNotNull" minOccurs="0"/>
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
    "batteryAverageLife",
    "batteryAverageLifeStandby",
    "batteryChargeTime",
    "color",
    "displayLength",
    "displayVolume",
    "displayWeight",
    "maxOrderQuantity",
    "mfgWarrantyDescriptionLabor",
    "mfgWarrantyDescriptionParts",
    "mfgWarrantyDescriptionType",
    "styleName",
    "powerSource",
    "regionOfOrigin",
    "size",
    "sizeMap",
    "warnings",
    "warrantyType"
})
@XmlRootElement(name = "Jewelry")
public class Jewelry {

    @XmlElement(name = "ProductType", required = true)
    protected Jewelry.ProductType productType;
    @XmlElement(name = "BatteryAverageLife")
    protected BigDecimal batteryAverageLife;
    @XmlElement(name = "BatteryAverageLifeStandby")
    protected BigDecimal batteryAverageLifeStandby;
    @XmlElement(name = "BatteryChargeTime")
    protected BigDecimal batteryChargeTime;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String color;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "DisplayVolume")
    protected VolumeDimension displayVolume;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "MaxOrderQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxOrderQuantity;
    @XmlElement(name = "MfgWarrantyDescriptionLabor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mfgWarrantyDescriptionLabor;
    @XmlElement(name = "MfgWarrantyDescriptionParts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mfgWarrantyDescriptionParts;
    @XmlElement(name = "MfgWarrantyDescriptionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mfgWarrantyDescriptionType;
    @XmlElement(name = "StyleName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String styleName;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String powerSource;
    @XmlElement(name = "RegionOfOrigin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String regionOfOrigin;
    @XmlElement(name = "Size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String size;
    @XmlElement(name = "SizeMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sizeMap;
    @XmlElement(name = "Warnings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String warnings;
    @XmlElement(name = "WarrantyType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String warrantyType;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.ProductType }
     *     
     */
    public Jewelry.ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.ProductType }
     *     
     */
    public void setProductType(Jewelry.ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the batteryAverageLife property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryAverageLife() {
        return batteryAverageLife;
    }

    /**
     * Sets the value of the batteryAverageLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryAverageLife(BigDecimal value) {
        this.batteryAverageLife = value;
    }

    /**
     * Gets the value of the batteryAverageLifeStandby property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryAverageLifeStandby() {
        return batteryAverageLifeStandby;
    }

    /**
     * Sets the value of the batteryAverageLifeStandby property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryAverageLifeStandby(BigDecimal value) {
        this.batteryAverageLifeStandby = value;
    }

    /**
     * Gets the value of the batteryChargeTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryChargeTime() {
        return batteryChargeTime;
    }

    /**
     * Sets the value of the batteryChargeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryChargeTime(BigDecimal value) {
        this.batteryChargeTime = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the displayLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplayLength() {
        return displayLength;
    }

    /**
     * Sets the value of the displayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplayLength(LengthDimension value) {
        this.displayLength = value;
    }

    /**
     * Gets the value of the displayVolume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getDisplayVolume() {
        return displayVolume;
    }

    /**
     * Sets the value of the displayVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setDisplayVolume(VolumeDimension value) {
        this.displayVolume = value;
    }

    /**
     * Gets the value of the displayWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getDisplayWeight() {
        return displayWeight;
    }

    /**
     * Sets the value of the displayWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setDisplayWeight(WeightDimension value) {
        this.displayWeight = value;
    }

    /**
     * Gets the value of the maxOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOrderQuantity() {
        return maxOrderQuantity;
    }

    /**
     * Sets the value of the maxOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOrderQuantity(BigInteger value) {
        this.maxOrderQuantity = value;
    }

    /**
     * Gets the value of the mfgWarrantyDescriptionLabor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgWarrantyDescriptionLabor() {
        return mfgWarrantyDescriptionLabor;
    }

    /**
     * Sets the value of the mfgWarrantyDescriptionLabor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgWarrantyDescriptionLabor(String value) {
        this.mfgWarrantyDescriptionLabor = value;
    }

    /**
     * Gets the value of the mfgWarrantyDescriptionParts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgWarrantyDescriptionParts() {
        return mfgWarrantyDescriptionParts;
    }

    /**
     * Sets the value of the mfgWarrantyDescriptionParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgWarrantyDescriptionParts(String value) {
        this.mfgWarrantyDescriptionParts = value;
    }

    /**
     * Gets the value of the mfgWarrantyDescriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgWarrantyDescriptionType() {
        return mfgWarrantyDescriptionType;
    }

    /**
     * Sets the value of the mfgWarrantyDescriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgWarrantyDescriptionType(String value) {
        this.mfgWarrantyDescriptionType = value;
    }

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

    /**
     * Gets the value of the powerSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * Sets the value of the powerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSource(String value) {
        this.powerSource = value;
    }

    /**
     * Gets the value of the regionOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionOfOrigin() {
        return regionOfOrigin;
    }

    /**
     * Sets the value of the regionOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionOfOrigin(String value) {
        this.regionOfOrigin = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the sizeMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeMap() {
        return sizeMap;
    }

    /**
     * Sets the value of the sizeMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeMap(String value) {
        this.sizeMap = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnings(String value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyType(String value) {
        this.warrantyType = value;
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
     *         &lt;element ref="{}Watch"/>
     *         &lt;element ref="{}FashionNecklaceBraceletAnklet"/>
     *         &lt;element ref="{}FashionRing"/>
     *         &lt;element ref="{}FashionEarring"/>
     *         &lt;element ref="{}FashionOther"/>
     *         &lt;element ref="{}FineNecklaceBraceletAnklet"/>
     *         &lt;element ref="{}FineRing"/>
     *         &lt;element ref="{}FineEarring"/>
     *         &lt;element ref="{}FineOther"/>
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
        "watch",
        "fashionNecklaceBraceletAnklet",
        "fashionRing",
        "fashionEarring",
        "fashionOther",
        "fineNecklaceBraceletAnklet",
        "fineRing",
        "fineEarring",
        "fineOther"
    })
    public static class ProductType {

        @XmlElement(name = "Watch")
        protected Watch watch;
        @XmlElement(name = "FashionNecklaceBraceletAnklet")
        protected FashionNecklaceBraceletAnklet fashionNecklaceBraceletAnklet;
        @XmlElement(name = "FashionRing")
        protected FashionRing fashionRing;
        @XmlElement(name = "FashionEarring")
        protected FashionEarring fashionEarring;
        @XmlElement(name = "FashionOther")
        protected FashionOther fashionOther;
        @XmlElement(name = "FineNecklaceBraceletAnklet")
        protected FineNecklaceBraceletAnklet fineNecklaceBraceletAnklet;
        @XmlElement(name = "FineRing")
        protected FineRing fineRing;
        @XmlElement(name = "FineEarring")
        protected FineEarring fineEarring;
        @XmlElement(name = "FineOther")
        protected FineOther fineOther;

        /**
         * Gets the value of the watch property.
         * 
         * @return
         *     possible object is
         *     {@link Watch }
         *     
         */
        public Watch getWatch() {
            return watch;
        }

        /**
         * Sets the value of the watch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Watch }
         *     
         */
        public void setWatch(Watch value) {
            this.watch = value;
        }

        /**
         * Gets the value of the fashionNecklaceBraceletAnklet property.
         * 
         * @return
         *     possible object is
         *     {@link FashionNecklaceBraceletAnklet }
         *     
         */
        public FashionNecklaceBraceletAnklet getFashionNecklaceBraceletAnklet() {
            return fashionNecklaceBraceletAnklet;
        }

        /**
         * Sets the value of the fashionNecklaceBraceletAnklet property.
         * 
         * @param value
         *     allowed object is
         *     {@link FashionNecklaceBraceletAnklet }
         *     
         */
        public void setFashionNecklaceBraceletAnklet(FashionNecklaceBraceletAnklet value) {
            this.fashionNecklaceBraceletAnklet = value;
        }

        /**
         * Gets the value of the fashionRing property.
         * 
         * @return
         *     possible object is
         *     {@link FashionRing }
         *     
         */
        public FashionRing getFashionRing() {
            return fashionRing;
        }

        /**
         * Sets the value of the fashionRing property.
         * 
         * @param value
         *     allowed object is
         *     {@link FashionRing }
         *     
         */
        public void setFashionRing(FashionRing value) {
            this.fashionRing = value;
        }

        /**
         * Gets the value of the fashionEarring property.
         * 
         * @return
         *     possible object is
         *     {@link FashionEarring }
         *     
         */
        public FashionEarring getFashionEarring() {
            return fashionEarring;
        }

        /**
         * Sets the value of the fashionEarring property.
         * 
         * @param value
         *     allowed object is
         *     {@link FashionEarring }
         *     
         */
        public void setFashionEarring(FashionEarring value) {
            this.fashionEarring = value;
        }

        /**
         * Gets the value of the fashionOther property.
         * 
         * @return
         *     possible object is
         *     {@link FashionOther }
         *     
         */
        public FashionOther getFashionOther() {
            return fashionOther;
        }

        /**
         * Sets the value of the fashionOther property.
         * 
         * @param value
         *     allowed object is
         *     {@link FashionOther }
         *     
         */
        public void setFashionOther(FashionOther value) {
            this.fashionOther = value;
        }

        /**
         * Gets the value of the fineNecklaceBraceletAnklet property.
         * 
         * @return
         *     possible object is
         *     {@link FineNecklaceBraceletAnklet }
         *     
         */
        public FineNecklaceBraceletAnklet getFineNecklaceBraceletAnklet() {
            return fineNecklaceBraceletAnklet;
        }

        /**
         * Sets the value of the fineNecklaceBraceletAnklet property.
         * 
         * @param value
         *     allowed object is
         *     {@link FineNecklaceBraceletAnklet }
         *     
         */
        public void setFineNecklaceBraceletAnklet(FineNecklaceBraceletAnklet value) {
            this.fineNecklaceBraceletAnklet = value;
        }

        /**
         * Gets the value of the fineRing property.
         * 
         * @return
         *     possible object is
         *     {@link FineRing }
         *     
         */
        public FineRing getFineRing() {
            return fineRing;
        }

        /**
         * Sets the value of the fineRing property.
         * 
         * @param value
         *     allowed object is
         *     {@link FineRing }
         *     
         */
        public void setFineRing(FineRing value) {
            this.fineRing = value;
        }

        /**
         * Gets the value of the fineEarring property.
         * 
         * @return
         *     possible object is
         *     {@link FineEarring }
         *     
         */
        public FineEarring getFineEarring() {
            return fineEarring;
        }

        /**
         * Sets the value of the fineEarring property.
         * 
         * @param value
         *     allowed object is
         *     {@link FineEarring }
         *     
         */
        public void setFineEarring(FineEarring value) {
            this.fineEarring = value;
        }

        /**
         * Gets the value of the fineOther property.
         * 
         * @return
         *     possible object is
         *     {@link FineOther }
         *     
         */
        public FineOther getFineOther() {
            return fineOther;
        }

        /**
         * Sets the value of the fineOther property.
         * 
         * @param value
         *     allowed object is
         *     {@link FineOther }
         *     
         */
        public void setFineOther(FineOther value) {
            this.fineOther = value;
        }

    }

}
