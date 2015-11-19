package exceptions;

public class ArduinoServiceException extends Exception {

	private static final long serialVersionUID = -2274414445414890955L;

	public ArduinoServiceException() {
		super();
	}

	public ArduinoServiceException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public ArduinoServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ArduinoServiceException(String message) {
		super(message);
	}

	public ArduinoServiceException(Throwable cause) {
		super(cause);
	}
	
}
