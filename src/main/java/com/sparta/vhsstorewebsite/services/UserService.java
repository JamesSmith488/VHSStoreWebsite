package com.sparta.vhsstorewebsite.services;

import com.sparta.vhsstorewebsite.entities.UserEntity;

public class UserService {
    public void update(UserEntity updatedUser, UserEntity user) {
        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setEmail(updatedUser.getEmail());
        user.setStoreAddress(updatedUser.getStoreAddress());
        user.setPassword(updatedUser.getPassword());
        user.setRole(updatedUser.getRole());
    }
}
