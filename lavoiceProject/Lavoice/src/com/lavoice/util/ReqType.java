package com.lavoice.util;

public enum ReqType {
	
	PARTICIPATION("PARTICIPATION",1),
	COLLABORATION("COLLABORATION",2);
	private String name;
	private int value;
	
	ReqType(String argName, int argValue){
		name = argName;
		value = argValue;
	}
	

}
