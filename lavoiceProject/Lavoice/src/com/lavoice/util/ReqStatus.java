package com.lavoice.util;

public enum ReqStatus {
	
	PENDING("PENDING",1),
	REJECT("REJECT",2),
	ACCEPT("ACCEPT",3);
	
	private String name;
	private int value;
	
	ReqStatus(String argName, int argValue){
		name = argName;
		value = argValue;
	}
}
