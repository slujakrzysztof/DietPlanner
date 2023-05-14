package com.sluja.dietplanner.controller;

import com.sluja.dietplanner.enums.Category;
import com.sluja.dietplanner.service.FavouriteRecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/api/v1")
public class FavouriteRecipeController {

    private FavouriteRecipeService favouriteRecipeService;

    public FavouriteRecipeController(FavouriteRecipeService favouriteRecipeService) {

        this.favouriteRecipeService = favouriteRecipeService;
    }

    public RedirectView addToFavouriteRecipe(String name, String category, String currentUrl) {

        RedirectView redirectView = new RedirectView();
        favouriteRecipeService.addToFavourite(name, category);
        redirectView.setUrl(currentUrl);
        return redirectView;
    }

}
