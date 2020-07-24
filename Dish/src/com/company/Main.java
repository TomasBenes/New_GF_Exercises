package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Create a Dish class, this will represent a dish what can be ordered from the restaurant. It has 2 private fields (these fields must be set through the constructor)
        name - the name of the dish
        ingredients - where we want to store the ingredients' name and amount
        For the sake of simplicity in our fictive world there are only two ingredients: ingredient1 and ingredient2
        and one public method
        getIngredients() - which returns the ingredients field
        Orders
        Create an Order class with 3 private fields
        id - a randomly generated number (1000 < x <= 9999) for each order it cannot be set as constructor argument
        status - a string, its default value is: "created", cannot be set as constructor argument
        dishes - a Dish array which is set through the constructor as argument
        and 4 methods
        delay() - it sets the status field to waiting
        deliver() - it sets the status field to delivered
        reject() - it sets the status field to rejected
        getDishes() - it returns the Dishes associated with the Order
        Create an OnlineOrder class which is a special Order, it has one more private field
        address - a string, which can be set through the constructor just like the dishes
        Finally create an OfflineOrder which is a special Order, it has one more private field
        table - a number, it is set from the constructor just like the dishes*/

        ArrayList<Ingredients> mainIngredients = new ArrayList<>();

        Ingredients forBurger1 = new Ingredients("beef", mainIngredients);
        forBurger1.ingredient = "beef";
        forBurger1.amount = 2;

        Ingredients forBurger2 = new Ingredients("bun", mainIngredients);
        forBurger2.ingredient = "bun";
        forBurger2.amount = 1;

        mainIngredients.add(forBurger1);
        mainIngredients.add(forBurger2);


        Dish burger = new Dish("Burger", mainIngredients);
        System.out.println(burger.getName());
        System.out.println(burger.getIngredients());



    }
}
