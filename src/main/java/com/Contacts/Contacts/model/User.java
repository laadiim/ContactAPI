package com.Contacts.Contacts.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "users")
public class User {
	@Id
	@UuidGenerator
	@Column(name = "id", unique = true, updatable = false)
	private Long userID;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String password;


	private String photoURL;

	private Long[] contacts;

	public User() {
    }

	public User(Long userID, String name, String email, String address, String phoneNumber, String password, String photoURL, Long[] contacts) {
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.password = password;
        this.photoURL = photoURL;
        this.contacts = contacts;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long[] getContacts() {
		return contacts;
	}

	public void setContacts(Long[] contacts) {
		this.contacts = contacts;
	}
}
