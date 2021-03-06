package com.example.vamshi.retrofittrial.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vamshi on 6/16/2017.
 */

public class Recipe {

    private String id;
    private String name;
    private List<Ingredients> ingredients = new ArrayList<>();
    private List<Steps> steps = new ArrayList<>();
    private String servings;

    public Recipe(String id, String name,  String servings, List<Ingredients> ingredients, List<Steps> steps) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.servings = servings;
    }

    public Recipe(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Steps> getSteps() {
        return steps;
    }

    public void setSteps(List<Steps> steps) {
        this.steps = steps;
    }

    public String getServings() {
        return servings;
    }

    public void setServings(String servings) {
        this.servings = servings;
    }
}
