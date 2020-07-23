package com.company;

public class Animal {
    String ownerName;
    boolean isHealthy;
    int healCost;

    public void heal () {
        this.isHealthy = true;
    }

    public boolean isAdoptable () {
        if (this.isHealthy == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ownerName='" + ownerName + '\'' +
                ", isHealthy=" + isHealthy +
                ", healCost=" + healCost +
                '}';
    }
}
