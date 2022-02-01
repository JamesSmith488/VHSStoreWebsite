package com.sparta.vhsstorewebsite.repositories;

import com.sparta.vhsstorewebsite.entities.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Integer> {
}
