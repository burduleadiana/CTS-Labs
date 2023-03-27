package FactoryMethod;

public class Dog extends Animal implements Animal.AnimalFactory {
    public Animal createAnimal(){
        Dog dog=new Dog();
        System.out.println("Dog");
        return dog;
    }
}
