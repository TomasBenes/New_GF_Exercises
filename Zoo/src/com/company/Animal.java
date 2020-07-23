package com.company;

public abstract class Animal {
    String name;
    String gender;
    int age;
    String typeOfBreed;

    public String getName() {
        return this.name;
    }

    public abstract String breed ();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
