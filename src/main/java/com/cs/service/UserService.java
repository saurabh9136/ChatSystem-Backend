package com.cs.service;


import java.util.List;

import com.cs.entity.User;
import com.cs.exception.UserAlreadyExistException;
import com.cs.exception.UserNotFoundException;

public interface UserService {
    List<User> getall() throws UserNotFoundException;

    User addUser(User user) throws UserAlreadyExistException;

    User getUserByUserName(String username)  throws UserNotFoundException;
}
