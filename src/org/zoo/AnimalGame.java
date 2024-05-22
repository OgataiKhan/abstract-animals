package org.zoo;

public class AnimalGame {
    public static void main(String[] args) {

        // Create animals array
        Animal[] zoo = {new Dog("Balto"), new Sparrow("Spearow"), new Eagle("Franklin"), new Dolphin("Flipper")};

        // Use methods
        for (Animal animal : zoo) {
            System.out.println("I am " + animal.name);
            System.out.println("I am sleeping:");
            animal.sleep();
            System.out.println("I am awake!");
            animal.makeSound();
            System.out.println("This is my diet:");
            animal.printDiet();
            System.out.println("************");
        }
    }
}
