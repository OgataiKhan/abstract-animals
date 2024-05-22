package org.zoo;

public class Dolphin extends Animal{

    // ATTRIBUTES


    // CONSTRUCTORS

    public Dolphin(String name) {
        super(name);
    }

    // METHODS

    @Override
    public void makeSound() {
        System.out.println("Whistle");
    }

    @Override
    public void printDiet() {
        System.out.println("I am a carnivore");
    }
}
