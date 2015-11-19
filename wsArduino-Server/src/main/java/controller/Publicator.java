package controller;

import interfaces.Arduino;

import javax.xml.ws.Endpoint;

import service.ArduinoImpl;
import exceptions.ArduinoServiceException;

public class Publicator {
	public static void main(String[] args) throws ArduinoServiceException {
		Endpoint.publish(Arduino.URL, new ArduinoImpl());
	}
}
