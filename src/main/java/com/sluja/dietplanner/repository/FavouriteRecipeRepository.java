package com.sluja.dietplanner.repository;


import com.sluja.dietplanner.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRecipeRepository extends JpaRepository<Recipe, Integer> {
}
