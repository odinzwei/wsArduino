package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import interfaces.ArduinoREST;

@Path("/turnLED")
public class ArduinoRESTImpl implements ArduinoREST {

	@GET
    @Produces(MediaType.TEXT_PLAIN)
	@Override
	public String turnLED(@QueryParam("value") String value) {
		Boolean boolValue = Boolean.valueOf(value);
		try {
			ArduinoLED instance = ArduinoLED.getInstance();
			if (boolValue) {
				instance.turnOn();
				return "ON";
			} else {
				instance.turnOff();
				return "OFF";
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
