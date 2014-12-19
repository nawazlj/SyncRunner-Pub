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
 * <p>Java class for RotationalSpeedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RotationalSpeedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rpm"/>
 *     &lt;enumeration value="revolutions_per_second"/>
 *     &lt;enumeration value="revolutions_per_hour"/>
 *     &lt;enumeration value="revolutions_per_week"/>
 *     &lt;enumeration value="degrees_per_second"/>
 *     &lt;enumeration value="radians_per_second"/>
 *     &lt;enumeration value="revolutions_per_month"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RotationalSpeedType")
@XmlEnum
public enum RotationalSpeedType {

    @XmlEnumValue("rpm")
    RPM("rpm"),
    @XmlEnumValue("revolutions_per_second")
    REVOLUTIONS_PER_SECOND("revolutions_per_second"),
    @XmlEnumValue("revolutions_per_hour")
    REVOLUTIONS_PER_HOUR("revolutions_per_hour"),
    @XmlEnumValue("revolutions_per_week")
    REVOLUTIONS_PER_WEEK("revolutions_per_week"),
    @XmlEnumValue("degrees_per_second")
    DEGREES_PER_SECOND("degrees_per_second"),
    @XmlEnumValue("radians_per_second")
    RADIANS_PER_SECOND("radians_per_second"),
    @XmlEnumValue("revolutions_per_month")
    REVOLUTIONS_PER_MONTH("revolutions_per_month");
    private final String value;

    RotationalSpeedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RotationalSpeedType fromValue(String v) {
        for (RotationalSpeedType c: RotationalSpeedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
