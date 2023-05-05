package com.sluja.dietplanner.repository;

import com.sluja.dietplanner.entity.FavouriteRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRecipeRepository extends JpaRepository<FavouriteRecipe, Integer> {
}
