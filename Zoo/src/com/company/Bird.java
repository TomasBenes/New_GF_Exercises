package com.company;

public class Bird extends Animal {

    public Bird (String name) {
        this.name = name;
    }

    @Override
    public String breed() {
        this.typeOfBreed = "laying eggs.";
        return typeOfBreed;
    }
}
