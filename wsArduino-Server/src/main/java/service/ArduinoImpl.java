package service;

import javax.jws.WebService;

import exceptions.ArduinoServiceException;
import interfaces.Arduino;

@WebService(endpointInterface="interfaces.Arduino")
public class ArduinoImpl implements Arduino {

	private static final long serialVersionUID = -5684037232300886932L;
	
	public ArduinoImpl() {}
	
	public boolean turnOnLED() throws ArduinoServiceException {
		try {
			ArduinoLED.getInstance().turnOn();
			return true;
		} catch (Exception e) {
			throw new ArduinoServiceException("Something is wrong: ", e);
		}
	}

	public boolean turnOffLED() throws ArduinoServiceException {
		try {
			ArduinoLED.getInstance().turnOff();
			return true;
		} catch (Exception e) {
			throw new ArduinoServiceException("Something is wrong: ", e);
		}
	}
}
