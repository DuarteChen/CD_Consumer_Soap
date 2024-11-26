
package default_package;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.6.4
 * 2024-11-26T09:30:55.878Z
 * Generated source version: 3.6.4
 */

@WebFault(name = "NotBoundException", targetNamespace = "http://default_package/")
public class NotBoundException_Exception extends Exception {

    private default_package.NotBoundException faultInfo;

    public NotBoundException_Exception() {
        super();
    }

    public NotBoundException_Exception(String message) {
        super(message);
    }

    public NotBoundException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public NotBoundException_Exception(String message, default_package.NotBoundException notBoundException) {
        super(message);
        this.faultInfo = notBoundException;
    }

    public NotBoundException_Exception(String message, default_package.NotBoundException notBoundException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = notBoundException;
    }

    public default_package.NotBoundException getFaultInfo() {
        return this.faultInfo;
    }
}
