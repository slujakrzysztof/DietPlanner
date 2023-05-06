package com.sluja.dietplanner.service;

import com.sluja.dietplanner.entity.Recipe;
import com.sluja.dietplanner.enums.Category;
import com.sluja.dietplanner.repository.FavouriteRecipeRepository;
import com.sluja.dietplanner.repository.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class FavouriteRecipeService {

    private RecipeRepository recipeRepository;


    public FavouriteRecipeService(RecipeRepository recipeRepository) {

        this.recipeRepository = recipeRepository;
    }

    public void addToFavourite(String name, String category) {

        Category categoryEnum = Category.valueOf(category);
        Recipe recipe = recipeRepository.findByNameAndCategory(name, categoryEnum);
        boolean value = recipe.isFavourite();

        recipe.setFavourite(!value);

        recipeRepository.save(recipe);
    }

}
