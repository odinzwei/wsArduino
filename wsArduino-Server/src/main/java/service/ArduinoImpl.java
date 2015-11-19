package service;

import interfaces.Arduino;

import javax.jws.WebMethod;
import javax.jws.WebService;

import exceptions.ArduinoServiceException;

@WebService
public class ArduinoImpl implements Arduino {

	private static final long serialVersionUID = -5684037232300886932L;
	
	public ArduinoImpl() {}
	

	@WebMethod
	public boolean turnOnLED() throws ArduinoServiceException {
		try {
			ArduinoLED.getInstance().turnOn();
			return true;
		} catch (Exception e) {
			throw new ArduinoServiceException("Something is wrong: ", e);
		}
	}

	@WebMethod
	public boolean turnOffLED() throws ArduinoServiceException {
		try {
			ArduinoLED.getInstance().turnOff();
			return true;
		} catch (Exception e) {
			throw new ArduinoServiceException("Something is wrong: ", e);
		}
	}
}
