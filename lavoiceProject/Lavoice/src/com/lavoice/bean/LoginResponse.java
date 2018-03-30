package com.lavoice.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userInfo")
public class LoginResponse {
	@Id
    private String id;
	private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String emailVerified;
    
    public LoginResponse(String username, String password, String firstname, String lastname, String emailVerified) {
        super();
        this.setUsername(username);
        this.setPassword(password);
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setEmailVerified(emailVerified);
    }
    
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
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
	
	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() + ", Username:- " + getUsername() + ", Password:- " + getPassword()
        +"Firstname" + getFirstname()+ "lastname" + getLastname());
        return str.toString();
    }

	public String getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(String emailVerified) {
		this.emailVerified = emailVerified;
	}

}
