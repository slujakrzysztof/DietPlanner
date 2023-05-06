package com.sluja.dietplanner.service;

import com.sluja.dietplanner.dtos.ShortRecipeDTO;
import com.sluja.dietplanner.entity.ShortRecipe;
import com.sluja.dietplanner.mapper.ShortRecipeMapper;
import com.sluja.dietplanner.repository.ShortRecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainViewService {

    private final ShortRecipeRepository shortRecipeRepository;

    public MainViewService(ShortRecipeRepository shortRecipeRepository) {

        this.shortRecipeRepository = shortRecipeRepository;
    }

    public List<ShortRecipeDTO> getShortRecipes() {

        List<ShortRecipe> shortRecipes = shortRecipeRepository.findAll();
        List<ShortRecipeDTO> dtoShortRecipes = new ArrayList<>();

        shortRecipes.forEach(recipe -> dtoShortRecipes.add(ShortRecipeMapper.mapToShortRecipeDTO(recipe)));

        return dtoShortRecipes;
    }
}
