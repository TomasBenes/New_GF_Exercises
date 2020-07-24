package com.company;

import java.util.Random;

public class Dog extends Animal {

    public Dog() {
        Random random = new Random();
        this.healCost = random.nextInt(8) + 1;
        this.name = "Dog";
    }
}
