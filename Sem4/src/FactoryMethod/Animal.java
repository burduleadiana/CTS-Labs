package FactoryMethod;

public class Animal {
    public interface AnimalFactory{
        Animal createAnimal();
    }

    public class DogFactory implements AnimalFactory{
        public Animal createAnimal(){
            return new Dog();
        }
    }

    public class CatFactory implements AnimalFactory{
        public Animal createAnimal(){
            return new Cat();
        }
    }
        public static void main(String[] args){

        }
}
