
package API.amazon.mws.products.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LowestOfferListingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LowestOfferListingList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowestOfferListing" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}LowestOfferListingType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LowestOfferListingList", propOrder = {
    "lowestOfferListing"
})
public class LowestOfferListingList {

    @XmlElement(name = "LowestOfferListing", required = true)
    protected List<LowestOfferListingType> lowestOfferListing;

    /**
     * Default constructor
     * 
     */
    public LowestOfferListingList() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public LowestOfferListingList(final List<LowestOfferListingType> lowestOfferListing) {
        this.lowestOfferListing = lowestOfferListing;
    }

    /**
     * Gets the value of the lowestOfferListing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowestOfferListing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowestOfferListing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LowestOfferListingType }
     * 
     * 
     */
    public List<LowestOfferListingType> getLowestOfferListing() {
        if (lowestOfferListing == null) {
            lowestOfferListing = new ArrayList<LowestOfferListingType>();
        }
        return this.lowestOfferListing;
    }

    public boolean isSetLowestOfferListing() {
        return ((this.lowestOfferListing!= null)&&(!this.lowestOfferListing.isEmpty()));
    }

    public void unsetLowestOfferListing() {
        this.lowestOfferListing = null;
    }

    /**
     * Sets the value of the LowestOfferListing property.
     * 
     * @param values
     * @return
     *     this instance
     */
    public LowestOfferListingList withLowestOfferListing(LowestOfferListingType... values) {
        for (LowestOfferListingType value: values) {
            getLowestOfferListing().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the lowestOfferListing property.
     * 
     * @param lowestOfferListing
     *     allowed object is
     *     {@link LowestOfferListingType }
     *     
     */
    public void setLowestOfferListing(List<LowestOfferListingType> lowestOfferListing) {
        this.lowestOfferListing = lowestOfferListing;
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
        java.util.List<LowestOfferListingType> lowestOfferListingList = getLowestOfferListing();
        for (LowestOfferListingType lowestOfferListing : lowestOfferListingList) {
            xml.append("<LowestOfferListing>");
            xml.append(lowestOfferListing.toXMLFragment());
            xml.append("</LowestOfferListing>");
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
        if (isSetLowestOfferListing()) {
            if (!first) json.append(", ");
            json.append("\"LowestOfferListing\" : [");
            java.util.List<LowestOfferListingType> lowestOfferListingList = getLowestOfferListing();
            int lowestOfferListingListIndex = 0;
            for (LowestOfferListingType lowestOfferListing : lowestOfferListingList) {
                if (lowestOfferListingListIndex > 0) json.append(", ");
                json.append("{");
                json.append("");
                json.append(lowestOfferListing.toJSONFragment());
                json.append("}");
                first = false;
                ++lowestOfferListingListIndex;
            }
            json.append("]");
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
