package com.lavoice.bean;

import com.lavoice.util.PollMediaType;

public class PollOption  {
	private PollMediaType OptionMediaType;
	private String OptionContent;
	private String OptionResultCount;
	
	public PollMediaType getOptionMediaType() {
		return OptionMediaType;
	}
	public void setOptionMediaType(PollMediaType optionMediaType) {
		OptionMediaType = optionMediaType;
	}
	public String getOptionContent() {
		return OptionContent;
	}
	public void setOptionContent(String optionContent) {
		OptionContent = optionContent;
	}
	public String getOptionResultCount() {
		return OptionResultCount;
	}
	public void setOptionResultCount(String optionResultCount) {
		OptionResultCount = optionResultCount;
	}
	
	

}
