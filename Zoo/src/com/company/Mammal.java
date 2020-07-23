package com.company;

public class Mammal extends Animal {

    public Mammal (String name) {
        this.name = name;
    }


    @Override
    public String breed() {
        this.typeOfBreed = "pushing miniature versions out.";
        return typeOfBreed;
    }
}
