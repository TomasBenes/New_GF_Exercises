package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Dish {
    private String name;
    private Ingredients ingredient1;
    private Ingredients ingredient2;

    public Dish () {

    }

    public ArrayList<Ingredients> getIngredients () {
        ArrayList <Ingredients> ingredients = new ArrayList<>();
        ingredients.add(this.ingredient1);
        ingredients.add(this.ingredient2);
        return ingredients;
    }
}
