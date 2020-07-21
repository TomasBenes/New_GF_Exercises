package com.company;

import java.util.ArrayList;

public class Garden {
    ArrayList <Flower> flowers;
    ArrayList <Tree> trees;
    int currentWaterAmount;
    int wateringAmount;
    boolean needsWater;


    public void watering (int wateringAmount) {
        for (Flower flower : this.flowers) {
            if (flower.needsWater == true)
            flower.currentWaterAmount += this.wateringAmount/ (this.flowers.size() + this.trees.size());
        for (Tree tree : this.trees)
            tree.currentWaterAmount += this.wateringAmount/ (this.flowers.size() + this.trees.size());
        }
    }
}
