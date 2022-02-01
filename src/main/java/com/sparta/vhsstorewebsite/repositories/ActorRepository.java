package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, Integer> {

    List<ActorEntity> findByFirstNameContainsAndLastNameContains(String firstName, String lastName);

}