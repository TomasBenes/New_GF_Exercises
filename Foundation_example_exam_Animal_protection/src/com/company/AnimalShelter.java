package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter {
    int budget;
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList <String> adoptersName = new ArrayList<>();

    public AnimalShelter () {
        this.budget = 50;
    }

    public int rescue (Animal animal) {
        this.animals.add(animal);
        return this.animals.size();
    }

    public int heal () {
        for (Animal animal:animals) {
            if (!animal.isHealthy && this.budget >= animal.healCost) {
                animal.heal();
                this.budget -= animal.healCost;
                return 1;
            }
        }
        return 0;
    }

    public void addAdopter (String name) {
        this.adoptersName.add(name);
    }

    public void findNewOwner () {
        Random random = new Random();
        ArrayList <Animal> adoptableAnimals = new ArrayList<>();
        /*int randomIndex = random.nextInt(adoptersName.size());*/
        String randomName = adoptersName.get(random.nextInt(adoptersName.size()));
        for (Animal animal: animals) {
            if (animal.isAdoptable()) {
                adoptableAnimals.add(animal);
            }
        }
        Animal randomAnimal = adoptableAnimals.get(random.nextInt(adoptableAnimals.size()));
        adoptersName.remove(randomName);
        animals.remove(randomAnimal);
    }

    public int earnDonation (int amount) {
        this.budget += amount;
        return this.budget;
    }

    @Override
    public String toString() {
        String shelter = "Budget: " + this.budget + "€,\n" + "There are " + this.animals.size() + " animal(s) and " + this.adoptersName.size() + " potential adopter(s)\n";
        for (Animal animal:animals) {
            if (!animal.isHealthy) {
                shelter += animal.name + " is not healthy (healing would cost: " + animal.healCost + "€), and not adoptable\n";
            } else {
                shelter += animal.name + " is healthy, and adoptable\n";
            }
        }
        return shelter;
    }
}
