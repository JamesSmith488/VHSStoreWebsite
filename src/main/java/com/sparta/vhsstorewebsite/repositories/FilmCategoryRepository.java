package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.FilmCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategoryEntity, Integer> {
}
