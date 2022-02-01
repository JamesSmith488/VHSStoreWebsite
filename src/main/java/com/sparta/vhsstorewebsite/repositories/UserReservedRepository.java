package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.UserReservedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserReservedRepository extends JpaRepository<UserReservedEntity, Integer> {

    List<UserReservedEntity> findByUserId(Integer userId);

    UserReservedEntity findByFilmId(Integer filmId);

}
