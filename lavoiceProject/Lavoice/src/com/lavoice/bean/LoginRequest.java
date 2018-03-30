package com.lavoice.bean;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userInfo")
public class LoginRequest {
    private String username;
    private String password;
    
    public LoginRequest(String username, String password) {
        super();
        this.setUsername(username);
        this.setPassword(password);
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
