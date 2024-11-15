
package default_package;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the default_package package. 
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

    private final static QName _ListarClinicasServer_QNAME = new QName("http://default_package/", "listarClinicas_Server");
    private final static QName _ListarClinicasServerResponse_QNAME = new QName("http://default_package/", "listarClinicas_ServerResponse");
    private final static QName _ListarConsultasServer_QNAME = new QName("http://default_package/", "listarConsultas_Server");
    private final static QName _ListarConsultasServerResponse_QNAME = new QName("http://default_package/", "listarConsultas_ServerResponse");
    private final static QName _MarcarConsultasServer_QNAME = new QName("http://default_package/", "marcarConsultas_Server");
    private final static QName _MarcarConsultasServerResponse_QNAME = new QName("http://default_package/", "marcarConsultas_ServerResponse");
    private final static QName _NotBoundException_QNAME = new QName("http://default_package/", "NotBoundException");
    private final static QName _MalformedURLException_QNAME = new QName("http://default_package/", "MalformedURLException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: default_package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarClinicasServer }
     * 
     */
    public ListarClinicasServer createListarClinicasServer() {
        return new ListarClinicasServer();
    }

    /**
     * Create an instance of {@link ListarClinicasServerResponse }
     * 
     */
    public ListarClinicasServerResponse createListarClinicasServerResponse() {
        return new ListarClinicasServerResponse();
    }

    /**
     * Create an instance of {@link ListarConsultasServer }
     * 
     */
    public ListarConsultasServer createListarConsultasServer() {
        return new ListarConsultasServer();
    }

    /**
     * Create an instance of {@link ListarConsultasServerResponse }
     * 
     */
    public ListarConsultasServerResponse createListarConsultasServerResponse() {
        return new ListarConsultasServerResponse();
    }

    /**
     * Create an instance of {@link MarcarConsultasServer }
     * 
     */
    public MarcarConsultasServer createMarcarConsultasServer() {
        return new MarcarConsultasServer();
    }

    /**
     * Create an instance of {@link MarcarConsultasServerResponse }
     * 
     */
    public MarcarConsultasServerResponse createMarcarConsultasServerResponse() {
        return new MarcarConsultasServerResponse();
    }

    /**
     * Create an instance of {@link NotBoundException }
     * 
     */
    public NotBoundException createNotBoundException() {
        return new NotBoundException();
    }

    /**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClinicasServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarClinicasServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "listarClinicas_Server")
    public JAXBElement<ListarClinicasServer> createListarClinicasServer(ListarClinicasServer value) {
        return new JAXBElement<ListarClinicasServer>(_ListarClinicasServer_QNAME, ListarClinicasServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClinicasServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarClinicasServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "listarClinicas_ServerResponse")
    public JAXBElement<ListarClinicasServerResponse> createListarClinicasServerResponse(ListarClinicasServerResponse value) {
        return new JAXBElement<ListarClinicasServerResponse>(_ListarClinicasServerResponse_QNAME, ListarClinicasServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarConsultasServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarConsultasServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "listarConsultas_Server")
    public JAXBElement<ListarConsultasServer> createListarConsultasServer(ListarConsultasServer value) {
        return new JAXBElement<ListarConsultasServer>(_ListarConsultasServer_QNAME, ListarConsultasServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarConsultasServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarConsultasServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "listarConsultas_ServerResponse")
    public JAXBElement<ListarConsultasServerResponse> createListarConsultasServerResponse(ListarConsultasServerResponse value) {
        return new JAXBElement<ListarConsultasServerResponse>(_ListarConsultasServerResponse_QNAME, ListarConsultasServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarcarConsultasServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarcarConsultasServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "marcarConsultas_Server")
    public JAXBElement<MarcarConsultasServer> createMarcarConsultasServer(MarcarConsultasServer value) {
        return new JAXBElement<MarcarConsultasServer>(_MarcarConsultasServer_QNAME, MarcarConsultasServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarcarConsultasServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarcarConsultasServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "marcarConsultas_ServerResponse")
    public JAXBElement<MarcarConsultasServerResponse> createMarcarConsultasServerResponse(MarcarConsultasServerResponse value) {
        return new JAXBElement<MarcarConsultasServerResponse>(_MarcarConsultasServerResponse_QNAME, MarcarConsultasServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotBoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotBoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "NotBoundException")
    public JAXBElement<NotBoundException> createNotBoundException(NotBoundException value) {
        return new JAXBElement<NotBoundException>(_NotBoundException_QNAME, NotBoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

}
