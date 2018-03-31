package com.lavoice.bean;

import java.util.List;

import com.lavoice.util.PollPurposeType;
import com.lavoice.util.PollType;

public class PollCreate {

	private String pollTitle;
	private List<PollContent> pollContent;
	
	private PollPurposeType pollPurposeType;
	private PollType pollContentType;
	
	public String getPollTitle() {
		return pollTitle;
	}
	public void setPollTitle(String pollTitle) {
		this.pollTitle = pollTitle;
	}
	public List<PollContent> getPollContent() {
		return pollContent;
	}
	public void setPollContent(List<PollContent> pollContent) {
		this.pollContent = pollContent;
	}
	public PollPurposeType getPollPurposeType() {
		return pollPurposeType;
	}
	public void setPollPurposeType(PollPurposeType pollPurposeType) {
		this.pollPurposeType = pollPurposeType;
	}
	public PollType getPollContentType() {
		return pollContentType;
	}
	public void setPollContentType(PollType pollContentType) {
		this.pollContentType = pollContentType;
	}
	
}
