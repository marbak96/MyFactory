package types;

import interfaces.IAnimal;

public class Cow implements IAnimal{
    
    @Override 
    public void makeSound(){
        System.out.println("MUUUUUUU");
    }
}