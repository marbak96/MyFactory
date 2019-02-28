package myfactory;

import interfaces.IAnimal;
import types.AnimalFactory;
import types.Animals;


public class MyFactory {

    public static void main(String[] args) {
        IAnimal animal = AnimalFactory.createAnimalObject(Animals.DOG);
        animal.makeSound();
        
    }
}
