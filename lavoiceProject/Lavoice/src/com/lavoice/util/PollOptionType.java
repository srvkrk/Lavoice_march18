package com.lavoice.util;

public enum PollOptionType {

	AUDIO("",2),
	VIDEO("",3),
	IMAGE("",4),
	TEXT("",1),
	MXIED("",5);
	
	private String name;
	private int value;
	
	PollOptionType(String argName, int argValue){
		name = argName;
		value = argValue;
	}
}
