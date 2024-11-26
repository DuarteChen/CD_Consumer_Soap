
package default_package;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.6.4
 * 2024-11-26T09:30:55.903Z
 * Generated source version: 3.6.4
 */

@WebFault(name = "IOException", targetNamespace = "http://default_package/")
public class IOException_Exception extends Exception {

    private default_package.IOException faultInfo;

    public IOException_Exception() {
        super();
    }

    public IOException_Exception(String message) {
        super(message);
    }

    public IOException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IOException_Exception(String message, default_package.IOException ioException) {
        super(message);
        this.faultInfo = ioException;
    }

    public IOException_Exception(String message, default_package.IOException ioException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = ioException;
    }

    public default_package.IOException getFaultInfo() {
        return this.faultInfo;
    }
}