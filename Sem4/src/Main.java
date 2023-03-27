public class Main {
    public static void main(String[] args){
        PizzaFactory PizzaFactory=new PizzaFactory();

        Pizza cheesePizza=PizzaFactory.createPizza("Cheese");

        cheesePizza.typePizza();

        Pizza pepperoniPizza=PizzaFactory.createPizza("Pepperoni");

        pepperoniPizza.typePizza();
    }
}
