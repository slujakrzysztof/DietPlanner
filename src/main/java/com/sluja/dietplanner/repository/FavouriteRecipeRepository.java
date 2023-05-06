package com.sluja.dietplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRecipeRepository extends JpaRepository<FavouriteRecipe, Integer> {
}
