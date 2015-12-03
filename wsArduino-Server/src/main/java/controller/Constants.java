package controller;

public final class Constants {
	
	private Constants(){}
	
	public static final int PORT = 8080;
	public static final String PROTOCOL ="http";
	public static final String HOST = "localhost";
	public static final 	String NAME_SERVICE = "arduino";
	public static final String URL = PROTOCOL + "://" + HOST + ":" + PORT + "/" + NAME_SERVICE;

}
