package com.sluja.dietplanner.service;

import com.sluja.dietplanner.dtos.CuisineTypeDTO;
import com.sluja.dietplanner.dtos.IngredientDTO;
import com.sluja.dietplanner.entity.CuisineType;
import com.sluja.dietplanner.entity.Ingredient;
import com.sluja.dietplanner.mapper.CuisineTypeMapper;
import com.sluja.dietplanner.mapper.IngredientMapper;
import com.sluja.dietplanner.repository.CuisineTypeRepository;
import com.sluja.dietplanner.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewRecipeService {

    private final IngredientRepository ingredientRepository;
    private final CuisineTypeRepository cuisineTypeRepository;

    public NewRecipeService(IngredientRepository ingredientRepository, CuisineTypeRepository cuisineTypeRepository) {

        this.ingredientRepository = ingredientRepository;
        this.cuisineTypeRepository = cuisineTypeRepository;
    }

    public List<IngredientDTO> getIngredients() {

        List<Ingredient> ingredients = ingredientRepository.findAll();
        List<IngredientDTO> dtoIngredients = new ArrayList<>();

        ingredients.forEach(ingredient -> dtoIngredients.add(IngredientMapper.mapToIngredientDTO(ingredient)));

        return dtoIngredients;
    }

    public List<CuisineTypeDTO> getCuisineTypes() {

        List<CuisineType> cuisineTypes = cuisineTypeRepository.findAll();
        List<CuisineTypeDTO> dtoCuisineTypes = new ArrayList<>();

        cuisineTypes.forEach(type -> dtoCuisineTypes.add(CuisineTypeMapper.mapToCuisineTypeDTO(type)));

        return dtoCuisineTypes;
    }
}
