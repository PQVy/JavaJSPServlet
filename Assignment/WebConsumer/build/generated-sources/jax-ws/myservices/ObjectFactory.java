
package myservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the myservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindByCode_QNAME = new QName("http://service.example.com/", "FindByCode");
    private final static QName _FindByCodeResponse_QNAME = new QName("http://service.example.com/", "FindByCodeResponse");
    private final static QName _FindByName_QNAME = new QName("http://service.example.com/", "FindByName");
    private final static QName _FindByNameResponse_QNAME = new QName("http://service.example.com/", "FindByNameResponse");
    private final static QName _ListBook_QNAME = new QName("http://service.example.com/", "ListBook");
    private final static QName _ListBookResponse_QNAME = new QName("http://service.example.com/", "ListBookResponse");
    private final static QName _UpdateStatusBook_QNAME = new QName("http://service.example.com/", "UpdateStatusBook");
    private final static QName _UpdateStatusBookResponse_QNAME = new QName("http://service.example.com/", "UpdateStatusBookResponse");
    private final static QName _Books_QNAME = new QName("http://service.example.com/", "books");
    private final static QName _Hello_QNAME = new QName("http://service.example.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service.example.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: myservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindByCode }
     * 
     */
    public FindByCode createFindByCode() {
        return new FindByCode();
    }

    /**
     * Create an instance of {@link FindByCodeResponse }
     * 
     */
    public FindByCodeResponse createFindByCodeResponse() {
        return new FindByCodeResponse();
    }

    /**
     * Create an instance of {@link FindByName }
     * 
     */
    public FindByName createFindByName() {
        return new FindByName();
    }

    /**
     * Create an instance of {@link FindByNameResponse }
     * 
     */
    public FindByNameResponse createFindByNameResponse() {
        return new FindByNameResponse();
    }

    /**
     * Create an instance of {@link ListBook }
     * 
     */
    public ListBook createListBook() {
        return new ListBook();
    }

    /**
     * Create an instance of {@link ListBookResponse }
     * 
     */
    public ListBookResponse createListBookResponse() {
        return new ListBookResponse();
    }

    /**
     * Create an instance of {@link UpdateStatusBook }
     * 
     */
    public UpdateStatusBook createUpdateStatusBook() {
        return new UpdateStatusBook();
    }

    /**
     * Create an instance of {@link UpdateStatusBookResponse }
     * 
     */
    public UpdateStatusBookResponse createUpdateStatusBookResponse() {
        return new UpdateStatusBookResponse();
    }

    /**
     * Create an instance of {@link Books }
     * 
     */
    public Books createBooks() {
        return new Books();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "FindByCode")
    public JAXBElement<FindByCode> createFindByCode(FindByCode value) {
        return new JAXBElement<FindByCode>(_FindByCode_QNAME, FindByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCodeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCodeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "FindByCodeResponse")
    public JAXBElement<FindByCodeResponse> createFindByCodeResponse(FindByCodeResponse value) {
        return new JAXBElement<FindByCodeResponse>(_FindByCodeResponse_QNAME, FindByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "FindByName")
    public JAXBElement<FindByName> createFindByName(FindByName value) {
        return new JAXBElement<FindByName>(_FindByName_QNAME, FindByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "FindByNameResponse")
    public JAXBElement<FindByNameResponse> createFindByNameResponse(FindByNameResponse value) {
        return new JAXBElement<FindByNameResponse>(_FindByNameResponse_QNAME, FindByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "ListBook")
    public JAXBElement<ListBook> createListBook(ListBook value) {
        return new JAXBElement<ListBook>(_ListBook_QNAME, ListBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "ListBookResponse")
    public JAXBElement<ListBookResponse> createListBookResponse(ListBookResponse value) {
        return new JAXBElement<ListBookResponse>(_ListBookResponse_QNAME, ListBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStatusBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "UpdateStatusBook")
    public JAXBElement<UpdateStatusBook> createUpdateStatusBook(UpdateStatusBook value) {
        return new JAXBElement<UpdateStatusBook>(_UpdateStatusBook_QNAME, UpdateStatusBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStatusBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "UpdateStatusBookResponse")
    public JAXBElement<UpdateStatusBookResponse> createUpdateStatusBookResponse(UpdateStatusBookResponse value) {
        return new JAXBElement<UpdateStatusBookResponse>(_UpdateStatusBookResponse_QNAME, UpdateStatusBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Books }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Books }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "books")
    public JAXBElement<Books> createBooks(Books value) {
        return new JAXBElement<Books>(_Books_QNAME, Books.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
