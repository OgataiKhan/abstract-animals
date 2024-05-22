package org.zoo;

public class Dolphin extends Animal implements CanSwim{

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

    @Override
    public void swim() {
        System.out.println("I am swimming!");
    }
}
