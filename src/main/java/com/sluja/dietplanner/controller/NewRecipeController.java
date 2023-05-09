package com.sluja.dietplanner.controller;

import com.sluja.dietplanner.builder.RecipeBuilderDTO;
import com.sluja.dietplanner.dtos.RecipeDTO;
import com.sluja.dietplanner.service.NewRecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class NewRecipeController {

    private final NewRecipeService newRecipeService;

    public NewRecipeController(NewRecipeService newRecipeService) {

        this.newRecipeService = newRecipeService;
    }

    @RequestMapping("/newRecipe")
    public String addNewRecipe(Model model) {

        RecipeDTO recipeDTO = RecipeBuilderDTO.buildEmptyObject();

        model.addAttribute("ingredients", newRecipeService.getIngredients());
        model.addAttribute("cuisineTypes", newRecipeService.getCuisineTypes());
        model.addAttribute("recipeDto", recipeDTO);
        return "addRecipeForm";
    }

    @PostMapping("/addNewRecipe")
    public String addNewRecipe(@ModelAttribute("recipeDto") RecipeDTO recipe){

        return null;
    }

}
