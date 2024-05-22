package org.zoo;

public class Sparrow extends Animal {

    // ATTRIBUTES


    // CONSTRUCTORS

    public Sparrow(String name) {
        super(name);
    }

    // METHODS

    @Override
    public void makeSound() {
        System.out.println("Tweet");
    }

    @Override
    public void printDiet() {
        System.out.println("I am an omnivore");
    }
}
