package simpleFactory;


public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
