package com.company;

import java.util.ArrayList;

public class Garden {
    ArrayList <Flower> flowers;
    ArrayList <Tree> trees;
    String colorOfPlant;
    double currentWaterAmount;


    public Garden () {

    }

    /*public Garden (ArrayList <Flower> differentFlowers, ArrayList <Tree> differentTrees) {
        this.flowers = differentFlowers;
        this.trees = differentTrees;
    }*/

    public void initialWaterStateOfPlants () {
        for (Flower flower : this.flowers) {
            if (flower.needsWater()){
                System.out.println("The " + flower.colorOfPlant + " Flower needs water");
            }
        }
        for (Tree tree : this.trees) {
            if (tree.needsWater()) {
                System.out.println("The " + tree.colorOfPlant + " Tree needs water");
            }
        }
        System.out.println();
    }

    public void watering (double wateringAmount) {
        System.out.println("Watering with " + wateringAmount);
        for (Flower flower : this.flowers) {
            flower.currentWaterAmount += (wateringAmount / 4) * 0.75;
                if (flower.needsWater()) {
                    System.out.println("The " + flower.colorOfPlant + " Flower needs water");
                } else {
                    System.out.println("The " + flower.colorOfPlant + " Flower doesnt need water");
                }
        }
        for (Tree tree : this.trees) {
            tree.currentWaterAmount += (wateringAmount / 4) * 0.4;
                if (tree.needsWater()) {
                    System.out.println("The " + tree.colorOfPlant + " Tree needs water");
                } else {
                    System.out.println("The " + tree.colorOfPlant + " Tree doesnt need water");
                }
        }
        System.out.println();
    }
}
