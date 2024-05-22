package org.zoo;

public class Eagle extends Animal implements CanFly{

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

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
