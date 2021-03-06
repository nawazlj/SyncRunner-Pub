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
 * <p>Java class for Current.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Current">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="amps"/>
 *     &lt;enumeration value="kiloamps"/>
 *     &lt;enumeration value="microamps"/>
 *     &lt;enumeration value="milliamps"/>
 *     &lt;enumeration value="nanoamps"/>
 *     &lt;enumeration value="picoamps"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Current")
@XmlEnum
public enum Current {

    @XmlEnumValue("amps")
    AMPS("amps"),
    @XmlEnumValue("kiloamps")
    KILOAMPS("kiloamps"),
    @XmlEnumValue("microamps")
    MICROAMPS("microamps"),
    @XmlEnumValue("milliamps")
    MILLIAMPS("milliamps"),
    @XmlEnumValue("nanoamps")
    NANOAMPS("nanoamps"),
    @XmlEnumValue("picoamps")
    PICOAMPS("picoamps");
    private final String value;

    Current(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Current fromValue(String v) {
        for (Current c: Current.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
