package com.example.vamshi.retrofittrial.Data;

/**
 * Created by Vamshi on 6/16/2017.
 */

public class Ingredients  {

    private String quantity;
    private String measure;
    private String ingredient;


    public Ingredients(String quantity, String measure, String ingredient) {
        this.quantity = quantity;
        this.measure = measure;
        this.ingredient = ingredient;
    }

    public Ingredients(){

    }


    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
