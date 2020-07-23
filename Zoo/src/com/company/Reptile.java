package com.company;

public class Reptile extends Animal {

    public Reptile (String name) {
        this.name = name;
    }

    @Override
    public String breed() {
        this.typeOfBreed = "laying eggs.";
        return typeOfBreed;
    }
}
