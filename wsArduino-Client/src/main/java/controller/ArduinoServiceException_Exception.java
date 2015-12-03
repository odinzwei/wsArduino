
package controller;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ArduinoServiceException", targetNamespace = "http://interfaces/")
public class ArduinoServiceException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ArduinoServiceException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ArduinoServiceException_Exception(String message, ArduinoServiceException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ArduinoServiceException_Exception(String message, ArduinoServiceException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: controller.ArduinoServiceException
     */
    public ArduinoServiceException getFaultInfo() {
        return faultInfo;
    }

}
