package com.lavoice.bean;

public class PollOption<T> {
	private String OptionMediaType;
	private T OptionContent;
	public String getOptionMediaType() {
		return OptionMediaType;
	}
	public void setOptionMediaType(String optionMediaType) {
		OptionMediaType = optionMediaType;
	}
	public T getOptionContent() {
		return OptionContent;
	}
	public void setOptionContent(T optionContent) {
		OptionContent = optionContent;
	}

}
