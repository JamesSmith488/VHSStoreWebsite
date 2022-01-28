package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.RentedFilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentedFilmRepository extends JpaRepository<RentedFilmEntity, Integer> {
}
