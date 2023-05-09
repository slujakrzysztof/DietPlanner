package com.sluja.dietplanner.repository;

import com.sluja.dietplanner.entity.Recipe;
import com.sluja.dietplanner.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    public Recipe findByNameAndCategory(String name, Category category);
}
