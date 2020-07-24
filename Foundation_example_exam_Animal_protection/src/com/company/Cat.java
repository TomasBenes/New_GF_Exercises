package com.company;

import java.util.Random;

public class Cat extends Animal {


    public Cat() {
        Random random = new Random();
        this.healCost = random.nextInt(7);
        this.name = "Cat";
    }

}
