
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

    private final static QName _Registar_QNAME = new QName("http://default_package/", "Registar");
    private final static QName _RegistarResponse_QNAME = new QName("http://default_package/", "RegistarResponse");
    private final static QName _Autenticar_QNAME = new QName("http://default_package/", "autenticar");
    private final static QName _AutenticarResponse_QNAME = new QName("http://default_package/", "autenticarResponse");
    private final static QName _ListarClinicasServer_QNAME = new QName("http://default_package/", "listarClinicas_Server");
    private final static QName _ListarClinicasServerResponse_QNAME = new QName("http://default_package/", "listarClinicas_ServerResponse");
    private final static QName _ListarConsultasServer_QNAME = new QName("http://default_package/", "listarConsultas_Server");
    private final static QName _ListarConsultasServerResponse_QNAME = new QName("http://default_package/", "listarConsultas_ServerResponse");
    private final static QName _ListarEspecialidadesServer_QNAME = new QName("http://default_package/", "listarEspecialidades_Server");
    private final static QName _ListarEspecialidadesServerResponse_QNAME = new QName("http://default_package/", "listarEspecialidades_ServerResponse");
    private final static QName _LocClinicaServer_QNAME = new QName("http://default_package/", "locClinica_Server");
	private final static QName _LocClinicaServerResponse_QNAME = new QName("http://default_package/", "locClinica_ServerResponse");
	private final static QName _MarcarConsultasServer_QNAME = new QName("http://default_package/", "marcarConsultas_Server");
    private final static QName _MarcarConsultasServerResponse_QNAME = new QName("http://default_package/", "marcarConsultas_ServerResponse");
    private final static QName _RemoverConsultaServer_QNAME = new QName("http://default_package/", "removerConsulta_Server");
    private final static QName _RemoverConsultaServerResponse_QNAME = new QName("http://default_package/", "removerConsulta_ServerResponse");
    private final static QName _NotBoundException_QNAME = new QName("http://default_package/", "NotBoundException");
    private final static QName _MalformedURLException_QNAME = new QName("http://default_package/", "MalformedURLException");
    private final static QName _IOException_QNAME = new QName("http://default_package/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: default_package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Registar }
     * 
     */
    public Registar createRegistar() {
        return new Registar();
    }

    /**
     * Create an instance of {@link RegistarResponse }
     * 
     */
    public RegistarResponse createRegistarResponse() {
        return new RegistarResponse();
    }

    /**
     * Create an instance of {@link Autenticar }
     * 
     */
    public Autenticar createAutenticar() {
        return new Autenticar();
    }

    /**
     * Create an instance of {@link AutenticarResponse }
     * 
     */
    public AutenticarResponse createAutenticarResponse() {
        return new AutenticarResponse();
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
     * Create an instance of {@link ListarEspecialidadesServer }
     * 
     */
    public ListarEspecialidadesServer createListarEspecialidadesServer() {
        return new ListarEspecialidadesServer();
    }

    /**
     * Create an instance of {@link ListarEspecialidadesServerResponse }
     * 
     */
    public ListarEspecialidadesServerResponse createListarEspecialidadesServerResponse() {
        return new ListarEspecialidadesServerResponse();
    }

    /**
     * Create an instance of {@link LocClinicaServer }
     * 
     */
    public LocClinicaServer createLocClinicaServer() {
        return new LocClinicaServer();
    }

	/**
     * Create an instance of {@link LocClinicaServerResponse }
     * 
     */
    public LocClinicaServerResponse createLocClinicaServerResponse() {
        return new LocClinicaServerResponse();
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
     * Create an instance of {@link RemoverConsultaServer }
     * 
     */
    public RemoverConsultaServer createRemoverConsultaServer() {
        return new RemoverConsultaServer();
    }

    /**
     * Create an instance of {@link RemoverConsultaServerResponse }
     * 
     */
    public RemoverConsultaServerResponse createRemoverConsultaServerResponse() {
        return new RemoverConsultaServerResponse();
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
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registar }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "Registar")
    public JAXBElement<Registar> createRegistar(Registar value) {
        return new JAXBElement<Registar>(_Registar_QNAME, Registar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "RegistarResponse")
    public JAXBElement<RegistarResponse> createRegistarResponse(RegistarResponse value) {
        return new JAXBElement<RegistarResponse>(_RegistarResponse_QNAME, RegistarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autenticar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Autenticar }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "autenticar")
    public JAXBElement<Autenticar> createAutenticar(Autenticar value) {
        return new JAXBElement<Autenticar>(_Autenticar_QNAME, Autenticar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutenticarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "autenticarResponse")
    public JAXBElement<AutenticarResponse> createAutenticarResponse(AutenticarResponse value) {
        return new JAXBElement<AutenticarResponse>(_AutenticarResponse_QNAME, AutenticarResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEspecialidadesServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEspecialidadesServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "listarEspecialidades_Server")
    public JAXBElement<ListarEspecialidadesServer> createListarEspecialidadesServer(ListarEspecialidadesServer value) {
        return new JAXBElement<ListarEspecialidadesServer>(_ListarEspecialidadesServer_QNAME, ListarEspecialidadesServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEspecialidadesServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEspecialidadesServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "listarEspecialidades_ServerResponse")
    public JAXBElement<ListarEspecialidadesServerResponse> createListarEspecialidadesServerResponse(ListarEspecialidadesServerResponse value) {
        return new JAXBElement<ListarEspecialidadesServerResponse>(_ListarEspecialidadesServerResponse_QNAME, ListarEspecialidadesServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocClinicaServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocClinicaServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "locClinica_Server")
    public JAXBElement<LocClinicaServer> createLocClinicaServer(LocClinicaServer value) {
        return new JAXBElement<LocClinicaServer>(_LocClinicaServer_QNAME, LocClinicaServer.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocClinicaServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocClinicaServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "locClinica_ServerResponse")
    public JAXBElement<LocClinicaServerResponse> createLocClinicaServerResponse(LocClinicaServerResponse value) {
        return new JAXBElement<LocClinicaServerResponse>(_LocClinicaServerResponse_QNAME, LocClinicaServerResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverConsultaServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverConsultaServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "removerConsulta_Server")
    public JAXBElement<RemoverConsultaServer> createRemoverConsultaServer(RemoverConsultaServer value) {
        return new JAXBElement<RemoverConsultaServer>(_RemoverConsultaServer_QNAME, RemoverConsultaServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverConsultaServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverConsultaServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "removerConsulta_ServerResponse")
    public JAXBElement<RemoverConsultaServerResponse> createRemoverConsultaServerResponse(RemoverConsultaServerResponse value) {
        return new JAXBElement<RemoverConsultaServerResponse>(_RemoverConsultaServerResponse_QNAME, RemoverConsultaServerResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

}
