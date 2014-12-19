
package API.amazon.mws.products.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;element name="Type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Receiver"/>
 *               &lt;enumeration value="Sender"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Detail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
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
@XmlType(name = "", propOrder = {
    "type",
    "code",
    "message",
    "detail"
})
@XmlRootElement(name = "Error")
public class Error {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "Detail", required = true)
    protected Error.Detail detail;

    /**
     * Default constructor
     * 
     */
    public Error() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public Error(final String type, final String code, final String message, final Error.Detail detail) {
        this.type = type;
        this.code = code;
        this.message = message;
        this.detail = detail;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    public boolean isSetCode() {
        return (this.code!= null);
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    public boolean isSetMessage() {
        return (this.message!= null);
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Error.Detail }
     *     
     */
    public Error.Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error.Detail }
     *     
     */
    public void setDetail(Error.Detail value) {
        this.detail = value;
    }

    public boolean isSetDetail() {
        return (this.detail!= null);
    }

    /**
     * Sets the value of the Type property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public Error withType(String value) {
        setType(value);
        return this;
    }

    /**
     * Sets the value of the Code property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public Error withCode(String value) {
        setCode(value);
        return this;
    }

    /**
     * Sets the value of the Message property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public Error withMessage(String value) {
        setMessage(value);
        return this;
    }

    /**
     * Sets the value of the Detail property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public Error withDetail(Error.Detail value) {
        setDetail(value);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (!(obj instanceof Error)) {
            return false;
        }
        Error err = (Error) obj;
        return getCode().equals(err.getCode()) && getMessage().equals(err.getMessage()) && getType().equals(err.getType());
    }

    @Override
    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: ");
        if (isSetType()) {
            sb.append(getType());
        }
        sb.append("Code: ");
        if (isSetCode()) {
            sb.append(getCode());
        }
        sb.append("Message: ");
        if (isSetMessage()) {
            sb.append(getMessage());
        }
        return sb.toString().hashCode();
    }
    
    @Override
    public String toString() {
        return toXMLFragment();
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
     *         &lt;any/>
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
        "any"
    })
    public static class Detail {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Default constructor
         * 
         */
        public Detail() {
            super();
        }

        /**
         * Value constructor
         * 
         */
        public Detail(final List<Object> any) {
            this.any = any;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        public boolean isSetAny() {
            return ((this.any!= null)&&(!this.any.isEmpty()));
        }

        public void unsetAny() {
            this.any = null;
        }

        /**
         * Sets the value of the Any property.
         * 
         * @param values
         * @return
         *     this instance
         */
        public Error.Detail withAny(Object... values) {
            for (Object value: values) {
                getAny().add(value);
            }
            return this;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param any
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(List<Object> any) {
            this.any = any;
        }

    }
    


    /**
     * 
     * XML fragment representation of this object
     * 
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    public String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetType()) {
            xml.append("<Type>");
            xml.append(getType() + "");
            xml.append("</Type>");
        }
        if (isSetCode()) {
            xml.append("<Code>");
            xml.append(escapeXML(getCode()));
            xml.append("</Code>");
        }
        if (isSetMessage()) {
            xml.append("<Message>");
            xml.append(escapeXML(getMessage()));
            xml.append("</Message>");
        }
        if (isSetDetail()) {
            Error.Detail  detail = getDetail();
            xml.append("<Detail>");
            xml.append(detail.toString());

            xml.append("</Detail>");
        } 
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        if (string == null)
            return "null";
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("&lt;");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
    }



    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetType()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Type"));
            json.append(" : ");
            json.append(quoteJSON(getType() + ""));
            first = false;
        }
        if (isSetCode()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Code"));
            json.append(" : ");
            json.append(quoteJSON(getCode()));
            first = false;
        }
        if (isSetMessage()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Message"));
            json.append(" : ");
            json.append(quoteJSON(getMessage()));
            first = false;
        }
        if (isSetDetail()) {
            if (!first) json.append(", ");
            json.append("\"Detail\" : {");
            Error.Detail  detail = getDetail();


            json.append(detail.toString());

            json.append("}");
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        if (string == null)
            return "null";
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}
