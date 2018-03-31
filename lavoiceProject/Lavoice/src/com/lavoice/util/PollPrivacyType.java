package com.lavoice.util;

public enum PollPrivacyType {

	ClosedGroup("",1),
	Public("",2);
	
	private String name;
	private int value;
	
	PollPrivacyType(String argName, int argValue){
		name = argName;
		value = argValue;
	}
}
