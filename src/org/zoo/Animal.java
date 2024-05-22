package org.zoo;

public abstract class Animal {

    // ATTRIBUTES

    protected String name;

    // CONSTRUCTORS

    public Animal(String name) {
        this.name = name;
    }

    // METHODS

    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void makeSound();

    public abstract void printDiet();
}
