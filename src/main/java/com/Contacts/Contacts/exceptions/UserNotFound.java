package com.Contacts.Contacts.exceptions;

public class UserNotFound extends RuntimeException{
    public UserNotFound(Long id) {
        super("User not found - id: " + id);
    }
}
