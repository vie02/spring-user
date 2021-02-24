package com.example.springuser.service;

import com.example.springuser.exception.UserAlreadyExistException;
import com.example.springuser.persistence.model.User;
import com.example.springuser.web.dto.UserDto;

public interface UserService {

    public User registerNewUserAccount(UserDto userDto) throws UserAlreadyExistException;

}
