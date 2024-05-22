package org.zoo;

public class Dog extends Animal{

    // ATTRIBUTES


    // CONSTRUCTORS

    public Dog(String name) {
        super(name);
    }

    // METHODS

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void printDiet() {
        System.out.println("I am an omnivore");
    }
}
