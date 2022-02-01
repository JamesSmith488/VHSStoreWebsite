package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.WaitingUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaitingUserRepository extends JpaRepository<WaitingUserEntity, Integer> {
}
