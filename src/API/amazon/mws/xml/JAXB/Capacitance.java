//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:15:27 PM EDT 
//


package API.amazon.mws.xml.JAXB;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Capacitance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Capacitance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="farad"/>
 *     &lt;enumeration value="decafarad"/>
 *     &lt;enumeration value="hectofarad"/>
 *     &lt;enumeration value="kilofarad"/>
 *     &lt;enumeration value="megafarad"/>
 *     &lt;enumeration value="gigafarad"/>
 *     &lt;enumeration value="terafarad"/>
 *     &lt;enumeration value="petafarad"/>
 *     &lt;enumeration value="exafarad"/>
 *     &lt;enumeration value="zettafarad"/>
 *     &lt;enumeration value="yottafarad"/>
 *     &lt;enumeration value="decifarad"/>
 *     &lt;enumeration value="centifarad"/>
 *     &lt;enumeration value="millifarad"/>
 *     &lt;enumeration value="microfarad"/>
 *     &lt;enumeration value="nanofarad"/>
 *     &lt;enumeration value="picofarad"/>
 *     &lt;enumeration value="femtofarad"/>
 *     &lt;enumeration value="attofarad"/>
 *     &lt;enumeration value="zeptofarad"/>
 *     &lt;enumeration value="yoctofarad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Capacitance")
@XmlEnum
public enum Capacitance {

    @XmlEnumValue("farad")
    FARAD("farad"),
    @XmlEnumValue("decafarad")
    DECAFARAD("decafarad"),
    @XmlEnumValue("hectofarad")
    HECTOFARAD("hectofarad"),
    @XmlEnumValue("kilofarad")
    KILOFARAD("kilofarad"),
    @XmlEnumValue("megafarad")
    MEGAFARAD("megafarad"),
    @XmlEnumValue("gigafarad")
    GIGAFARAD("gigafarad"),
    @XmlEnumValue("terafarad")
    TERAFARAD("terafarad"),
    @XmlEnumValue("petafarad")
    PETAFARAD("petafarad"),
    @XmlEnumValue("exafarad")
    EXAFARAD("exafarad"),
    @XmlEnumValue("zettafarad")
    ZETTAFARAD("zettafarad"),
    @XmlEnumValue("yottafarad")
    YOTTAFARAD("yottafarad"),
    @XmlEnumValue("decifarad")
    DECIFARAD("decifarad"),
    @XmlEnumValue("centifarad")
    CENTIFARAD("centifarad"),
    @XmlEnumValue("millifarad")
    MILLIFARAD("millifarad"),
    @XmlEnumValue("microfarad")
    MICROFARAD("microfarad"),
    @XmlEnumValue("nanofarad")
    NANOFARAD("nanofarad"),
    @XmlEnumValue("picofarad")
    PICOFARAD("picofarad"),
    @XmlEnumValue("femtofarad")
    FEMTOFARAD("femtofarad"),
    @XmlEnumValue("attofarad")
    ATTOFARAD("attofarad"),
    @XmlEnumValue("zeptofarad")
    ZEPTOFARAD("zeptofarad"),
    @XmlEnumValue("yoctofarad")
    YOCTOFARAD("yoctofarad");
    private final String value;

    Capacitance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Capacitance fromValue(String v) {
        for (Capacitance c: Capacitance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
