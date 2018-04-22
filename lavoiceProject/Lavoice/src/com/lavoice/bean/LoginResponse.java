package com.lavoice.bean;

import java.util.List;

public class LoginResponse {
	
	private String userEmail;
	private String profilePic;
	private String imageBackground;
    private String firstname;
    private String lastname;
    private String emailVerified;
    private List<PollCreate> poll; 
    private FriendList list;
    private Group myGroups;
    private NotificationRequestContent pollReq;
    private NotificationRequestContent colaborationReq;
	
    
    public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public String getImageBackground() {
		return imageBackground;
	}
	public void setImageBackground(String imageBackground) {
		this.imageBackground = imageBackground;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(String emailVerified) {
		this.emailVerified = emailVerified;
	}
	public List<PollCreate> getPoll() {
		return poll;
	}
	public void setPoll(List<PollCreate> poll) {
		this.poll = poll;
	}
	public FriendList getList() {
		return list;
	}
	public void setList(FriendList list) {
		this.list = list;
	}
	public Group getMyGroups() {
		return myGroups;
	}
	public void setMyGroups(Group myGroups) {
		this.myGroups = myGroups;
	}
	public NotificationRequestContent getPollReq() {
		return pollReq;
	}
	public void setPollReq(NotificationRequestContent pollReq) {
		this.pollReq = pollReq;
	}
	public NotificationRequestContent getColaborationReq() {
		return colaborationReq;
	}
	public void setColaborationReq(NotificationRequestContent colaborationReq) {
		this.colaborationReq = colaborationReq;
	}
    
    
    
  
    
    
}
