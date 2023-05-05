package com.sluja.dietplanner.repository;

import com.sluja.dietplanner.entity.CuisineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineTypeRepository extends JpaRepository<CuisineType, Integer> {
}
