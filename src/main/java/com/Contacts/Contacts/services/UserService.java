package com.Contacts.Contacts.services;

import com.Contacts.Contacts.dto.UserDTO;

public interface UserService {
    UserDTO getUserById(Long id);
    UserDTO createUser(UserDTO userDTO);
}
