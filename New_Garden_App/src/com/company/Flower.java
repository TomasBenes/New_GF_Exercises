package com.company;

import java.util.ArrayList;

public class Flower extends Garden {

    public Flower (String colorOfFlower, double currentWaterAmountOfFlower) {
        this.colorOfPlant = colorOfFlower;
        this.currentWaterAmount = currentWaterAmountOfFlower;
    }



    public boolean needsWater () {
        if (this.currentWaterAmount < 5) {
            return true;
        } else {
            return false;
        }
    }
}
