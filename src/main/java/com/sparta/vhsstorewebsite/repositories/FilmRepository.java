package com.sparta.vhsstorewebsite.repositories;


import com.sparta.vhsstorewebsite.entities.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Integer> {

    List<FilmEntity> findAllByAvailabilityTrue();

}