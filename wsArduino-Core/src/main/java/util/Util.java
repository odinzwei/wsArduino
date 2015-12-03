package util;

import java.util.Enumeration;
import java.util.Objects;

import gnu.io.CommPortIdentifier;

public final class Util {

	private Util(){}
	
	public static CommPortIdentifier getCOMMPort(){
		Enumeration<?> portEnum = CommPortIdentifier.getPortIdentifiers();
		while (portEnum.hasMoreElements()) {
			CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			for (COMMPORT commport : COMMPORT.values()) {
				if (commport.verifyPortValue(currPortId.getName())) 
					return currPortId;
			}
		}
		throw new NullPointerException("COM nao identificada");
	}
	
	private enum COMMPORT {
		
		MAC("/dev/tty.usbserial-A9007UX1"),
		LINUX("/dev/ttyUSB0"),
		WINDOWS("COM11"),
		;
		String portValue;
		
		COMMPORT(String portValue) {
			this.portValue = portValue;
		}
		
		boolean verifyPortValue(String portValue){
			return this.portValue.equals(Objects.requireNonNull(portValue, "PortValue cannot be nullable"));
		}
		
	}
	
}
