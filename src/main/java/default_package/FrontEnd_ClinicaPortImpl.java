
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package default_package;


import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.6.4
 * 2024-11-26T10:55:20.975Z
 * Generated source version: 3.6.4
 *
 */

@javax.jws.WebService(
                      serviceName = "FrontEnd_ClinicaService",
                      portName = "FrontEnd_ClinicaPort",
                      targetNamespace = "http://default_package/",
                      wsdlLocation = "http://localhost:8080/CD_FrontEnd_Soap/services/FrontEnd_ClinicaPort?wsdl",
                      endpointInterface = "default_package.FrontEndClinica")

public class FrontEnd_ClinicaPortImpl implements FrontEndClinica {

    private static final Logger LOG = Logger.getLogger(FrontEnd_ClinicaPortImpl.class.getName());

    public java.lang.String listarClinicasServer() throws NotBoundException_Exception,  MalformedURLException_Exception   {
        LOG.info("Executing operation listarClinicasServer");
        try {
            java.lang.String _return = "_return-906569851";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new NotBoundException_Exception("NotBoundException...");
        //throw new MalformedURLException_Exception("MalformedURLException...");
    }

	public java.lang.String autenticar(java.lang.String arg0, java.lang.String arg1) throws IOException_Exception   {
        LOG.info("Executing operation autenticar");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            java.lang.String _return = "_return1443444136";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IOException_Exception("IOException...");
    }

	public java.lang.String listarEspecialidadesServer(int arg0) throws NotBoundException_Exception,  MalformedURLException_Exception   {
        LOG.info("Executing operation listarEspecialidadesServer");
        System.out.println(arg0);
        try {
            java.lang.String _return = "_return-172048814";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new NotBoundException_Exception("NotBoundException...");
        //throw new MalformedURLException_Exception("MalformedURLException...");
    }

	public java.lang.String marcarConsultasServer(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws NotBoundException_Exception,  MalformedURLException_Exception   {
        LOG.info("Executing operation marcarConsultasServer");
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
        System.out.println(arg4);
        System.out.println(arg5);
        System.out.println(arg6);
        try {
            java.lang.String _return = "_return-2096543171";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new NotBoundException_Exception("NotBoundException...");
        //throw new MalformedURLException_Exception("MalformedURLException...");
    }

	public java.lang.String registar(java.lang.String arg0, java.lang.String arg1) throws IOException_Exception   {
        LOG.info("Executing operation registar");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            java.lang.String _return = "_return665149671";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new IOException_Exception("IOException...");
    }

	public java.lang.String removerConsultaServer(int arg0) throws NotBoundException_Exception,  MalformedURLException_Exception   {
        LOG.info("Executing operation removerConsultaServer");
        System.out.println(arg0);
        try {
            java.lang.String _return = "_return-1277381633";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new NotBoundException_Exception("NotBoundException...");
        //throw new MalformedURLException_Exception("MalformedURLException...");
    }

	/* (non-Javadoc)
     * @see default_package.FrontEndClinica#listarConsultasServer(int arg0)*
     */
    public java.lang.String listarConsultasServer(int arg0) throws NotBoundException_Exception,  MalformedURLException_Exception   {
        LOG.info("Executing operation listarConsultasServer");
        System.out.println(arg0);
        try {
            java.lang.String _return = "_return1075521006";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new NotBoundException_Exception("NotBoundException...");
        //throw new MalformedURLException_Exception("MalformedURLException...");
    }

}