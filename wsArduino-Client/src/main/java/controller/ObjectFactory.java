
package controller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the controller package. 
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

    private final static QName _TurnOffLEDResponse_QNAME = new QName("http://interfaces/", "turnOffLEDResponse");
    private final static QName _TurnOnLED_QNAME = new QName("http://interfaces/", "turnOnLED");
    private final static QName _TurnOnLEDResponse_QNAME = new QName("http://interfaces/", "turnOnLEDResponse");
    private final static QName _TurnOffLED_QNAME = new QName("http://interfaces/", "turnOffLED");
    private final static QName _ArduinoServiceException_QNAME = new QName("http://interfaces/", "ArduinoServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArduinoServiceException }
     * 
     */
    public ArduinoServiceException createArduinoServiceException() {
        return new ArduinoServiceException();
    }

    /**
     * Create an instance of {@link TurnOffLED }
     * 
     */
    public TurnOffLED createTurnOffLED() {
        return new TurnOffLED();
    }

    /**
     * Create an instance of {@link TurnOnLEDResponse }
     * 
     */
    public TurnOnLEDResponse createTurnOnLEDResponse() {
        return new TurnOnLEDResponse();
    }

    /**
     * Create an instance of {@link TurnOffLEDResponse }
     * 
     */
    public TurnOffLEDResponse createTurnOffLEDResponse() {
        return new TurnOffLEDResponse();
    }

    /**
     * Create an instance of {@link TurnOnLED }
     * 
     */
    public TurnOnLED createTurnOnLED() {
        return new TurnOnLED();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnOffLEDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "turnOffLEDResponse")
    public JAXBElement<TurnOffLEDResponse> createTurnOffLEDResponse(TurnOffLEDResponse value) {
        return new JAXBElement<TurnOffLEDResponse>(_TurnOffLEDResponse_QNAME, TurnOffLEDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnOnLED }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "turnOnLED")
    public JAXBElement<TurnOnLED> createTurnOnLED(TurnOnLED value) {
        return new JAXBElement<TurnOnLED>(_TurnOnLED_QNAME, TurnOnLED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnOnLEDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "turnOnLEDResponse")
    public JAXBElement<TurnOnLEDResponse> createTurnOnLEDResponse(TurnOnLEDResponse value) {
        return new JAXBElement<TurnOnLEDResponse>(_TurnOnLEDResponse_QNAME, TurnOnLEDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnOffLED }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "turnOffLED")
    public JAXBElement<TurnOffLED> createTurnOffLED(TurnOffLED value) {
        return new JAXBElement<TurnOffLED>(_TurnOffLED_QNAME, TurnOffLED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArduinoServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "ArduinoServiceException")
    public JAXBElement<ArduinoServiceException> createArduinoServiceException(ArduinoServiceException value) {
        return new JAXBElement<ArduinoServiceException>(_ArduinoServiceException_QNAME, ArduinoServiceException.class, null, value);
    }

}
