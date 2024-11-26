package default_package;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.6.4
 * 2024-11-26T11:10:30.439Z
 * Generated source version: 3.6.4
 *
 */
@WebService(targetNamespace = "http://default_package/", name = "FrontEnd_Clinica")
@XmlSeeAlso({ObjectFactory.class})
public interface FrontEndClinica {

//    @WebMethod(operationName = "listarClinicas_Server")
//    @RequestWrapper(localName = "listarClinicas_Server", targetNamespace = "http://default_package/", className = "default_package.ListarClinicasServer")
//    @ResponseWrapper(localName = "listarClinicas_ServerResponse", targetNamespace = "http://default_package/", className = "default_package.ListarClinicasServerResponse")
//    @WebResult(name = "return", targetNamespace = "")
    @WebMethod(operationName = "listarClinicas_Server")
	@RequestWrapper(localName = "listarClinicas_Server", targetNamespace = "http://default_package/", className = "default_package.ListarClinicasServer")
	@ResponseWrapper(localName = "listarClinicas_ServerResponse", targetNamespace = "http://default_package/", className = "default_package.ListarClinicasServerResponse")
	@WebResult(name = "return", targetNamespace = "")
	public java.lang.String listarClinicasServer()
 throws NotBoundException_Exception, MalformedURLException_Exception;

@WebMethod
    @RequestWrapper(localName = "autenticar", targetNamespace = "http://default_package/", className = "default_package.Autenticar")
    @ResponseWrapper(localName = "autenticarResponse", targetNamespace = "http://default_package/", className = "default_package.AutenticarResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String autenticar(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    ) throws IOException_Exception;

@WebMethod(operationName = "listarEspecialidades_Server")
    @RequestWrapper(localName = "listarEspecialidades_Server", targetNamespace = "http://default_package/", className = "default_package.ListarEspecialidadesServer")
    @ResponseWrapper(localName = "listarEspecialidades_ServerResponse", targetNamespace = "http://default_package/", className = "default_package.ListarEspecialidadesServerResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String listarEspecialidadesServer(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws NotBoundException_Exception, MalformedURLException_Exception;

	//	@WebMethod(operationName = "marcarConsultas_Server")
//    @RequestWrapper(localName = "marcarConsultas_Server", targetNamespace = "http://default_package/", className = "default_package.MarcarConsultasServer")
//    @ResponseWrapper(localName = "marcarConsultas_ServerResponse", targetNamespace = "http://default_package/", className = "default_package.MarcarConsultasServerResponse")
//    @WebResult(name = "return", targetNamespace = "")
    @WebMethod(operationName = "marcarConsultas_Server")
	@RequestWrapper(localName = "marcarConsultas_Server", targetNamespace = "http://default_package/", className = "default_package.MarcarConsultasServer")
	@ResponseWrapper(localName = "marcarConsultas_ServerResponse", targetNamespace = "http://default_package/", className = "default_package.MarcarConsultasServerResponse")
	@WebResult(name = "return", targetNamespace = "")
	public java.lang.String marcarConsultasServer(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        int arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        int arg6
    ) throws NotBoundException_Exception, MalformedURLException_Exception;

	@WebMethod(operationName = "Registar")
    @RequestWrapper(localName = "Registar", targetNamespace = "http://default_package/", className = "default_package.Registar")
    @ResponseWrapper(localName = "RegistarResponse", targetNamespace = "http://default_package/", className = "default_package.RegistarResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String registar(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    ) throws IOException_Exception;

	@WebMethod(operationName = "removerConsulta_Server")
    @RequestWrapper(localName = "removerConsulta_Server", targetNamespace = "http://default_package/", className = "default_package.RemoverConsultaServer")
    @ResponseWrapper(localName = "removerConsulta_ServerResponse", targetNamespace = "http://default_package/", className = "default_package.RemoverConsultaServerResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String removerConsultaServer(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws NotBoundException_Exception, MalformedURLException_Exception;

	@WebMethod(operationName = "listarConsultas_Server")
    @RequestWrapper(localName = "listarConsultas_Server", targetNamespace = "http://default_package/", className = "default_package.ListarConsultasServer")
    @ResponseWrapper(localName = "listarConsultas_ServerResponse", targetNamespace = "http://default_package/", className = "default_package.ListarConsultasServerResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String listarConsultasServer(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws NotBoundException_Exception, MalformedURLException_Exception;
}
