package com.lavoice.util;

public enum PollType {

	MCQ("",1),
	OpenText("",2),
	Ratting("",3);
	
	
	private String name;
	private int value;
	
	PollType(String argName, int argValue){
		name = argName;
		value = argValue;
	}
}
