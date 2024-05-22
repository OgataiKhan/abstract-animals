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

        // Step 2: Interfaces

        MakeMove makeMove = new MakeMove();

        for (Animal animal : zoo) {
            System.out.println("I am " + animal.name);
            if(animal instanceof CanFly){
                makeMove.makeFly((CanFly) animal);
            } else if (animal instanceof CanSwim) {
                makeMove.makeSwim((CanSwim) animal);
            }
            System.out.println("************");
        }
    }
}
