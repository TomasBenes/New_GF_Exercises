package com.company;

import java.util.Random;

public class Parrot extends Animal {

    public Parrot () {
        Random random = new Random();
        this.healCost = random.nextInt(7) + 4;
        this.name = "Parrot";
    }
}
