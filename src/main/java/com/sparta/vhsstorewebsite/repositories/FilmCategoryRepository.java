package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.CategoryEntity;
import com.sparta.vhsstorewebsite.entities.FilmCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategoryEntity, Integer> {


    FilmCategoryEntity findByFilmId(Integer id);

    FilmCategoryEntity findByFilmIdAndCategoryId(Integer filmId, Integer categoryId);

}
