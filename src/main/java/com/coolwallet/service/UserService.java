package com.coolwallet.service;

import com.coolwallet.model.Users;

public interface UserService {
    Users createUser(Users users);

    Users getUserById(Long id);

    // Additional methods for user-related operations
}
