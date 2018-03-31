package com.lavoice.util;

public enum PollPurposeType {

	Private("",1),
	Business("",2);
	
	private String name;
	private int value;
	
	PollPurposeType(String argName, int argValue){
		name = argName;
		value = argValue;
	}
}
