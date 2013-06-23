package abstractFactory;

import abstractFactory.ingredients.*;

public abstract class Pizza {
    public String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official factoryPattern.PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}