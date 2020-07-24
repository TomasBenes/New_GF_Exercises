package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Dish {
    private String name;
    private Ingredients ingredient1;
    private Ingredients ingredient2;

    public Dish () {

    }

    public Dish (String name, Ingredients ingredient1, Ingredients ingredient2) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.name = name;

    }

    public ArrayList<Ingredients> getIngredients () {
        ArrayList <Ingredients> ingredients = new ArrayList<>();
        ingredients.add(this.ingredient1);
        ingredients.add(this.ingredient2);
        for (Ingredients ingredient: ingredients) {
            System.out.println("For this meal we need: " + ingredient.amount + " x " + ingredient.ingredient);
        }
        return ingredients;
    }

    public String getName() {
        return name;
    }
}
