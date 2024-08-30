package com.Contacts.Contacts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	private String userID;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String password;

	private String[] contacts;
}
