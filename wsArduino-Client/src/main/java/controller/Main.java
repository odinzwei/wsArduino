package controller;

public class Main {

	public static void main(String[] args) {
		Arduino a = new ArduinoImplService().getArduinoImplPort();
		try {
			a.turnOnLED();
		} catch (ArduinoServiceException_Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
