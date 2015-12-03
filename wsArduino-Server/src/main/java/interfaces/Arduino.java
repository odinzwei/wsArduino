package interfaces;

import java.io.Serializable;

import javax.jws.WebMethod;
import javax.jws.WebService;

import exceptions.ArduinoServiceException;

@WebService
public interface Arduino extends Serializable {

	@WebMethod
	boolean turnOnLED() throws ArduinoServiceException;
	
	@WebMethod
	boolean turnOffLED() throws ArduinoServiceException;
}
