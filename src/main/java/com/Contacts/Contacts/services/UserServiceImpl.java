package com.Contacts.Contacts.services;

import com.Contacts.Contacts.dto.UserDTO;
import com.Contacts.Contacts.exceptions.UserNotFound;
import com.Contacts.Contacts.model.User;
import com.Contacts.Contacts.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> {
                    return new UserNotFound(id);
                });
        return mapToDto(user);
    }

    private UserDTO mapToDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserID(user.getUserID());
        userDTO.setName(user.getName());
        userDTO.setAddress(user.getAddress());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setPhotoURL(user.getPhotoURL());
        return userDTO;
    }

    @Override
    @Transactional
    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setUserID(userDTO.getUserID());
        user.setName(userDTO.getName());
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setPhotoURL(userDTO.getPhotoURL());
        User savedUser = userRepository.save(user);
        return mapToDto(user);
    }
}
