
package API.amazon.mws.products.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AllOfferListingsConsidered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://mws.amazonservices.com/schema/Products/2011-10-01}Product" minOccurs="0"/>
 *         &lt;element ref="{http://mws.amazonservices.com/schema/Products/2011-10-01}Error" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SellerSKU" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allOfferListingsConsidered",
    "product",
    "error"
})
@XmlRootElement(name = "GetLowestOfferListingsForSKUResult")
public class GetLowestOfferListingsForSKUResult {

    @XmlElement(name = "AllOfferListingsConsidered")
    protected Boolean allOfferListingsConsidered;
    @XmlElement(name = "Product")
    protected Product product;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlAttribute(name = "SellerSKU")
    protected String sellerSKU;
    @XmlAttribute(required = true)
    protected String status;

    /**
     * Default constructor
     * 
     */
    public GetLowestOfferListingsForSKUResult() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public GetLowestOfferListingsForSKUResult(final Boolean allOfferListingsConsidered, final Product product, final Error error, final String sellerSKU, final String status) {
        this.allOfferListingsConsidered = allOfferListingsConsidered;
        this.product = product;
        this.error = error;
        this.sellerSKU = sellerSKU;
        this.status = status;
    }

    /**
     * Gets the value of the allOfferListingsConsidered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllOfferListingsConsidered() {
        return allOfferListingsConsidered;
    }

    /**
     * Sets the value of the allOfferListingsConsidered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllOfferListingsConsidered(Boolean value) {
        this.allOfferListingsConsidered = value;
    }

    public boolean isSetAllOfferListingsConsidered() {
        return (this.allOfferListingsConsidered!= null);
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    public boolean isSetProduct() {
        return (this.product!= null);
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    public boolean isSetError() {
        return (this.error!= null);
    }

    /**
     * Gets the value of the sellerSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerSKU() {
        return sellerSKU;
    }

    /**
     * Sets the value of the sellerSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerSKU(String value) {
        this.sellerSKU = value;
    }

    public boolean isSetSellerSKU() {
        return (this.sellerSKU!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Sets the value of the AllOfferListingsConsidered property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetLowestOfferListingsForSKUResult withAllOfferListingsConsidered(Boolean value) {
        setAllOfferListingsConsidered(value);
        return this;
    }

    /**
     * Sets the value of the Product property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetLowestOfferListingsForSKUResult withProduct(Product value) {
        setProduct(value);
        return this;
    }

    /**
     * Sets the value of the Error property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetLowestOfferListingsForSKUResult withError(Error value) {
        setError(value);
        return this;
    }

    /**
     * Sets the value of the SellerSKU property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetLowestOfferListingsForSKUResult withSellerSKU(String value) {
        setSellerSKU(value);
        return this;
    }

    /**
     * Sets the value of the Status property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetLowestOfferListingsForSKUResult withStatus(String value) {
        setStatus(value);
        return this;
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
        if (isSetAllOfferListingsConsidered()) {
            xml.append("<AllOfferListingsConsidered>");
            xml.append(isAllOfferListingsConsidered() + "");
            xml.append("</AllOfferListingsConsidered>");
        }
        if (isSetProduct()) {
            Product  product = getProduct();
            xml.append("<Product>");
            xml.append(product.toXMLFragment());
            xml.append("</Product>");
        } 
        if (isSetError()) {
            Error  error = getError();
            xml.append("<Error>");
            xml.append(error.toXMLFragment());
            xml.append("</Error>");
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
        if (isSetAllOfferListingsConsidered()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("AllOfferListingsConsidered"));
            json.append(" : ");
            json.append(quoteJSON(isAllOfferListingsConsidered() + ""));
            first = false;
        }
        if (isSetProduct()) {
            if (!first) json.append(", ");
            json.append("\"Product\" : {");
            Product  product = getProduct();


            json.append(product.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetError()) {
            if (!first) json.append(", ");
            json.append("\"Error\" : {");
            Error  error = getError();


            json.append(error.toJSONFragment());
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
