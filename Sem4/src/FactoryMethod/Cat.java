package FactoryMethod;

public class Cat extends Animal implements Animal.AnimalFactory{
    public Animal createAnimal(){
        Cat cat=new Cat();
        System.out.println("Cat");
        return cat;

    }
}
