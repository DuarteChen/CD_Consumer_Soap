
package default_package;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.6.4
 * 2024-11-26T10:55:20.711Z
 * Generated source version: 3.6.4
 *
 */
public final class FrontEndClinica_FrontEndClinicaPort_Client {

    private static final QName SERVICE_NAME = new QName("http://default_package/", "FrontEnd_ClinicaService");

    private FrontEndClinica_FrontEndClinicaPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = FrontEndClinicaService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        FrontEndClinicaService ss = new FrontEndClinicaService(wsdlURL, SERVICE_NAME);
        FrontEndClinica port = ss.getFrontEndClinicaPort();

        {
        System.out.println("Invoking listarConsultasServer...");
        int _listarConsultasServer_arg0 = -2064507258;
        try {
            java.lang.String _listarConsultasServer__return = port.listarConsultasServer(_listarConsultasServer_arg0);
            System.out.println("listarConsultasServer.result=" + _listarConsultasServer__return);

        } catch (NotBoundException_Exception e) {
            System.out.println("Expected exception: NotBoundException has occurred.");
            System.out.println(e.toString());
        } catch (MalformedURLException_Exception e) {
            System.out.println("Expected exception: MalformedURLException has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}
