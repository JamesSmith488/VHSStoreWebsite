package com.sparta.vhsstorewebsite.entities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

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
    private Integer userEnabled;

    public UserEntity() {
    }

    public UserEntity(Integer userId, String firstName, String lastName, String email, String storeAddress, String password, String role, Integer userEnabled) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.storeAddress = storeAddress;
        this.password = password;
        this.role = role;
        this.userEnabled = userEnabled;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        this.password = encoder.encode(password);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getUserEnabled() {
        return userEnabled;
    }

    public void setUserEnabled(Integer userEnabled) {
        this.userEnabled = userEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(userId, that.userId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(storeAddress, that.storeAddress) && Objects.equals(password, that.password) && Objects.equals(role, that.role) && Objects.equals(userEnabled, that.userEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, email, storeAddress, password, role, userEnabled);
    }
}
