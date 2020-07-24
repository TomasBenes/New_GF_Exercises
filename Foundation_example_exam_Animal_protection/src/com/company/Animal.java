package com.company;

public class Animal {
    String ownerName;
    boolean isHealthy;
    int healCost;
    String name;

    public Animal () {
       this.name = "Animal";
    }

    public Animal (String name) {
        this.name = name;
    }

    public void heal () {
        this.isHealthy = true;
    }

    public boolean isAdoptable () {
        if (this.isHealthy) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (!this.isHealthy) {
            return this.name + " is not healthy (" + this.healCost + "€), and not adoptable";
        } else {
            return this.name + " is healthy, and adoptable";
        }
    }
}
