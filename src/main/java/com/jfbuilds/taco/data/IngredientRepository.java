package com.jfbuilds.taco.data;

import org.springframework.data.repository.CrudRepository;

import com.jfbuilds.taco.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
