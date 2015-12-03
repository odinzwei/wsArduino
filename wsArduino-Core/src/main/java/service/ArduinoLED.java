package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;

import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import util.Util;

public class ArduinoLED implements SerialPortEventListener, AutoCloseable, Serializable {

	private static final long serialVersionUID = -8244063490109525785L;
	
	private static final int TIME_OUT = 2000;
	private static final int DATA_RATE = 9600;
	
	private BufferedReader input;
	private OutputStream output;
	private SerialPort serialPort;
	
	private static ArduinoLED instance;

	public static ArduinoLED getInstance(){
		return instance  = (instance != null? instance : new ArduinoLED()); 
	}
	
	private ArduinoLED() {}

	private void initialize() throws Exception {
		serialPort = (SerialPort) Util.getCOMMPort().open(this.getClass().getName(), TIME_OUT);
		serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
		input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
		output = serialPort.getOutputStream();
		serialPort.addEventListener(this);
		serialPort.notifyOnDataAvailable(true);
	}

	private synchronized void closeSerialPort() {
		if (serialPort != null) {
			serialPort.removeEventListener();
			serialPort.close();
			serialPort = null;
		}
	}

	public synchronized void serialEvent(SerialPortEvent oEvent) {
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				String inputLine = input.readLine();
				System.out.println(inputLine);
				closeSerialPort();
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}
	}

	private synchronized void writeData(final byte data) throws Exception {
		if(serialPort == null) initialize();
		output.write(data);
	}
	
	public void turnOn() throws Exception{
		writeData((byte)1);
	}
	
	public void turnOff() throws Exception{
		writeData((byte)0);
	}

	@Override
	public void close() throws Exception {
		instance.closeSerialPort();
		instance = null;
	}
}
