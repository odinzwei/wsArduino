package controller;

import javax.xml.ws.Endpoint;

import exceptions.ArduinoServiceException;
import service.ArduinoImpl;

public class Publicator {
	public static void main(String[] args) throws ArduinoServiceException {
		Endpoint.publish(Constants.URL, new ArduinoImpl());
		System.out.println(Constants.URL);
	}
}
