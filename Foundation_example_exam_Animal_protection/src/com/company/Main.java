package com.company;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal();
        System.out.println(animal.name);

        Cat cat = new Cat();
        System.out.println(cat.name);

        Dog dog = new Dog();

        AnimalShelter animalShelter1 = new AnimalShelter();
        animalShelter1.rescue(animal);
        animalShelter1.rescue(cat);
        animalShelter1.rescue(dog);
        System.out.println(animalShelter1.toString());

    }
}
