package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Order {
    Random random = new Random();
    private int id = random.nextInt(9000) + 1000;
    private String status = "created";
    private ArrayList<Dish> dishes;

    public Order (ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }
}
