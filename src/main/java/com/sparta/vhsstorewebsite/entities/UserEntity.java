package com.sparta.vhsstorewebsite.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String storeAddress;
    private String password;
    private String role;

    public UserEntity() {
    }

    public UserEntity(Integer userId, String firstName, String lastName, String email, String storeAddress, String password, String role) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.storeAddress = storeAddress;
        this.password = password;
        this.role = role;
    }
}
