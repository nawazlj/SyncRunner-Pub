
package API.amazon.mws.orders.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{https://mws.amazonservices.com/Orders/2011-01-01}OrderStatusEnum" maxOccurs="50"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusList", propOrder = {
    "status"
})
public class OrderStatusList {

    @XmlElement(name = "Status", required = true)
    protected List<OrderStatusEnum> status;

    /**
     * Default constructor
     * 
     */
    public OrderStatusList() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public OrderStatusList(final List<OrderStatusEnum> status) {
        this.status = status;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderStatusEnum }
     * 
     * 
     */
    public List<OrderStatusEnum> getStatus() {
        if (status == null) {
            status = new ArrayList<OrderStatusEnum>();
        }
        return this.status;
    }

    public boolean isSetStatus() {
        return ((this.status!= null)&&(!this.status.isEmpty()));
    }

    public void unsetStatus() {
        this.status = null;
    }

    /**
     * Sets the value of the Status property.
     * 
     * @param values
     * @return
     *     this instance
     */
    public OrderStatusList withStatus(OrderStatusEnum... values) {
        for (OrderStatusEnum value: values) {
            getStatus().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param status
     *     allowed object is
     *     {@link OrderStatusEnum }
     *     
     */
    public void setStatus(List<OrderStatusEnum> status) {
        this.status = status;
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
        java.util.List<OrderStatusEnum> statusList  =  getStatus();
        for (OrderStatusEnum status : statusList) { 
            xml.append("<Status>");
            xml.append(status.value());
            xml.append("</Status>");
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
        if (isSetStatus()) {
            if (!first) json.append(", ");
            json.append("\"Status\" : [");
            java.util.List<OrderStatusEnum> statusList  =  getStatus();
            int statusListIndex  =  0;
            for (OrderStatusEnum status : statusList) {
                if (statusListIndex > 0) json.append(", ");
                    json.append(status.value());
                ++statusListIndex;
            }
            json.append("]");
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
