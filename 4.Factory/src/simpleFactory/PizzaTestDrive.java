package simpleFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    }
}
