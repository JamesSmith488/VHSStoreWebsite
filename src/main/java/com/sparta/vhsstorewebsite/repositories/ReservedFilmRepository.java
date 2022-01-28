package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.ReservedFilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedFilmRepository extends JpaRepository<ReservedFilmEntity, Integer> {
}
