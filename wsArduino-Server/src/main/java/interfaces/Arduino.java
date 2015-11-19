package interfaces;

import java.io.Serializable;

import exceptions.ArduinoServiceException;

public interface Arduino extends Serializable {
	int PORT = 8080;
	String PROTOCOL ="http";
	String HOST = "localhost";
	String NAME_SERVICE = "arduino";
	String URL = PROTOCOL + "://" + HOST + ":" + PORT + "/" + NAME_SERVICE;

	boolean turnOnLED() throws ArduinoServiceException;

	boolean turnOffLED() throws ArduinoServiceException;
}
