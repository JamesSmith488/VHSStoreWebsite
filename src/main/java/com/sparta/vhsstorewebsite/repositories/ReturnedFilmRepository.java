package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnedFilmRepository extends JpaRepository<FilmEntity, Integer> {
}
