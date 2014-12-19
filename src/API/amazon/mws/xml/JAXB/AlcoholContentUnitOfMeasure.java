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
 * <p>Java class for AlcoholContentUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcoholContentUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="percent_by_volume"/>
 *     &lt;enumeration value="percent_by_weight"/>
 *     &lt;enumeration value="unit_of_alcohol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcoholContentUnitOfMeasure")
@XmlEnum
public enum AlcoholContentUnitOfMeasure {

    @XmlEnumValue("percent_by_volume")
    PERCENT_BY_VOLUME("percent_by_volume"),
    @XmlEnumValue("percent_by_weight")
    PERCENT_BY_WEIGHT("percent_by_weight"),
    @XmlEnumValue("unit_of_alcohol")
    UNIT_OF_ALCOHOL("unit_of_alcohol");
    private final String value;

    AlcoholContentUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlcoholContentUnitOfMeasure fromValue(String v) {
        for (AlcoholContentUnitOfMeasure c: AlcoholContentUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
