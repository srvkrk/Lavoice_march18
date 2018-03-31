package com.lavoice.bean;

import java.util.Date;
import java.util.List;

import com.lavoice.util.PollPrivacyType;

public class PollContent<T> {
	private String mediaType;
	private T pollQuestions;
	private List<PollOption> pollOption;
	private Date startDateTime;
	private Date endDateTime;
	//private List<String> emaiIdsToParticipate;
	private PollPrivacyType pollPrivacyType;
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public T getPollQuestions() {
		return pollQuestions;
	}
	public void setPollQuestions(T pollQuestions) {
		this.pollQuestions = pollQuestions;
	}
	public List<PollOption> getPollOption() {
		return pollOption;
	}
	public void setPollOption(List<PollOption> pollOption) {
		this.pollOption = pollOption;
	}
	public Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}
	public PollPrivacyType getPollPrivacyType() {
		return pollPrivacyType;
	}
	public void setPollPrivacyType(PollPrivacyType pollPrivacyType) {
		this.pollPrivacyType = pollPrivacyType;
	}
	
	
}
