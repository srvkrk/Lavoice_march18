package com.lavoice.util;

public enum PollPurposeType {

	Private("Private",1),
	Business("Business",2);
	
	private String name;
	private int value;
	
	PollPurposeType(String argName, int argValue){
		name = argName;
		value = argValue;
	}
	
	public static PollPurposeType getEnum(String argString) {
		//if(argString.equalsIgnoreCase(name)) return PollPurposeType.Private;
		return PollPurposeType.Business;
		
	}
}
