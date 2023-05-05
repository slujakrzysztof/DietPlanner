package com.sluja.dietplanner.repository;

import com.sluja.dietplanner.entity.ShortRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortRecipeRepository extends JpaRepository<ShortRecipe, Integer> {
}
