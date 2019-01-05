
package myservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for books complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="books"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookauthor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bookcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bookdescrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bookid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="bookname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bookstatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "books", propOrder = {
    "bookauthor",
    "bookcode",
    "bookdescrip",
    "bookid",
    "bookname",
    "bookstatus"
})
public class Books {

    protected String bookauthor;
    protected String bookcode;
    protected String bookdescrip;
    protected Integer bookid;
    protected String bookname;
    protected Boolean bookstatus;

    /**
     * Gets the value of the bookauthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookauthor() {
        return bookauthor;
    }

    /**
     * Sets the value of the bookauthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookauthor(String value) {
        this.bookauthor = value;
    }

    /**
     * Gets the value of the bookcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookcode() {
        return bookcode;
    }

    /**
     * Sets the value of the bookcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookcode(String value) {
        this.bookcode = value;
    }

    /**
     * Gets the value of the bookdescrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookdescrip() {
        return bookdescrip;
    }

    /**
     * Sets the value of the bookdescrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookdescrip(String value) {
        this.bookdescrip = value;
    }

    /**
     * Gets the value of the bookid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookid() {
        return bookid;
    }

    /**
     * Sets the value of the bookid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookid(Integer value) {
        this.bookid = value;
    }

    /**
     * Gets the value of the bookname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * Sets the value of the bookname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookname(String value) {
        this.bookname = value;
    }

    /**
     * Gets the value of the bookstatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBookstatus() {
        return bookstatus;
    }

    /**
     * Sets the value of the bookstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBookstatus(Boolean value) {
        this.bookstatus = value;
    }

}
