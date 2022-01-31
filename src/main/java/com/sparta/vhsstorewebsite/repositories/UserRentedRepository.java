package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.UserRentedEntity;
import com.sparta.vhsstorewebsite.entities.UserReservedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRentedRepository extends JpaRepository<UserRentedEntity, Integer> {

    List<UserRentedEntity> findByUserId(Integer userId);
    UserRentedEntity findByFilmId(Integer filmId);
}
