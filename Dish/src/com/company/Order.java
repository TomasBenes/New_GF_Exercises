package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Order {
    Random random = new Random();
    private int id = random.nextInt(8999) + 1001;
    private String status = "created";
    private ArrayList<Dish> dishes;

    public Order () {
        this.dishes = new ArrayList<>();
    }

    public void delay () {
        this.status = "waiting";
    }

    public void deliver () {
        this.status = "delivered";
    }

    public void reject () {
        this.status = "rejected";
    }

    public ArrayList<Dish> getDishes() {
        return this.dishes;
    }
}
