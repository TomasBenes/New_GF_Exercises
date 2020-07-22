package com.company;

public class Tree extends Garden{

    public Tree (String colorOfTree, double currentWaterAmountOfTree) {
        this.colorOfPlant = colorOfTree;
        this.currentWaterAmount = currentWaterAmountOfTree;
    }

    public boolean needsWater () {
        if (this.currentWaterAmount < 10) {
            return true;
        } else {
            return false;
        }
    }
}
