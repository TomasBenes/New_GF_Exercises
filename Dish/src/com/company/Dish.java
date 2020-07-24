package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Dish {
    private String name;
    private ArrayList <Ingredients> ingredients;

    public Dish (String name, ArrayList ingredients) {
        this.name = name;
        Ingredients ingredients1 = new Ingredients(name, ingredients);
        Ingredients ingredients2 = new Ingredients(name, ingredients);
        this.ingredients = ingredients;
        this.ingredients.add(ingredients1);
        this.ingredients.add(ingredients2);
    }

    public ArrayList<Ingredients> getIngredients () {
        for (Ingredients ingredient: ingredients) {
            System.out.println("For this meal we need: " + ingredient.amount + " x " + ingredient.ingredient);
        }
        return ingredients;
    }

    public String getName() {
        return name;
    }
}
