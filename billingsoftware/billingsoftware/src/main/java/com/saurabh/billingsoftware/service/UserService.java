package com.saurabh.billingsoftware.service;

import com.saurabh.billingsoftware.io.UserRequest;
import com.saurabh.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserRequest request);
     String getUserRole(String email);
     List<UserResponse> readUsers();
    void deleteUser(String id);
}
