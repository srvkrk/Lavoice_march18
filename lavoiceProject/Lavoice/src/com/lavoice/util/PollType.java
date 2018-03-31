package com.lavoice.util;

public enum PollType {

	SINGLE("",1),
	MULTIPLE("",2);
	
	
	private String name;
	private int value;
	
	PollType(String argName, int argValue){
		name = argName;
		value = argValue;
	}
}
