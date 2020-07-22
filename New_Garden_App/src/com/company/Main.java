package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/inheritance/garden-app/README.md
        // EXERCISE GARDEN APP

        Garden garden = new Garden();
        Flower rose = new Flower("yellow", 0);
        Flower tulip = new Flower("blue",0);
        Tree plum = new Tree("purple",0);
        Tree orange = new Tree("orange",0);
        garden.flowers = new ArrayList<>();
        garden.trees = new ArrayList<>();
        garden.flowers.add(rose);
        garden.flowers.add(tulip);
        garden.trees.add(plum);
        garden.trees.add(orange);
        garden.initialWaterStateOfPlants();
        garden.watering(40);
        garden.watering(70);
    }
}
