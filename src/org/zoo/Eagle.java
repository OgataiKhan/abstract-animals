package org.zoo;

public class Eagle extends Animal{

    // ATTRIBUTES


    // CONSTRUCTORS

    public Eagle(String name) {
        super(name);
    }

    // METHODS

    @Override
    public void makeSound() {
        System.out.println("Screech");
    }

    @Override
    public void printDiet() {
        System.out.println("I am a carnivore");
    }
}
