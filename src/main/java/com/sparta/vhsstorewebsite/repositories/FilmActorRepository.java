package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.FilmActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActorEntity, Integer> {
}
