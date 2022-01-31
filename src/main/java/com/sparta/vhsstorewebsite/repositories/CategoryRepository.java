package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

//    List<CategoryEntity> findByName(String categoryName);

    CategoryEntity findByName(String categoryName);


}
