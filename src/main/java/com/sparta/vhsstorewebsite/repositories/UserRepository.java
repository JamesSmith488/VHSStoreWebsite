package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    List<UserEntity> findByUserId(Integer userId);
    List<UserEntity> findByRole(String role);
}
