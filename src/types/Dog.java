package types;

import interfaces.IAnimal;

public class Dog implements IAnimal{
    
    @Override 
    public void makeSound(){
        System.out.println("HAUUUUU");
       
    }
}