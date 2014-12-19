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
 * <p>Java class for MassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="grams"/>
 *     &lt;enumeration value="kilograms"/>
 *     &lt;enumeration value="milligrams"/>
 *     &lt;enumeration value="ounces"/>
 *     &lt;enumeration value="pounds"/>
 *     &lt;enumeration value="tons"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassType")
@XmlEnum
public enum MassType {

    @XmlEnumValue("grams")
    GRAMS("grams"),
    @XmlEnumValue("kilograms")
    KILOGRAMS("kilograms"),
    @XmlEnumValue("milligrams")
    MILLIGRAMS("milligrams"),
    @XmlEnumValue("ounces")
    OUNCES("ounces"),
    @XmlEnumValue("pounds")
    POUNDS("pounds"),
    @XmlEnumValue("tons")
    TONS("tons");
    private final String value;

    MassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassType fromValue(String v) {
        for (MassType c: MassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
