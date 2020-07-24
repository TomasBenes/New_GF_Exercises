package com.company;

public class Ingredients extends Dish {
    String ingredient;
    int amount;

    public Ingredients () {

    }

    public Ingredients(String name, Ingredients ingredient1, Ingredients ingredient2) {
        super(name, ingredient1, ingredient2);
    }
}
