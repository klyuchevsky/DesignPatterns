package Beverage;

public abstract class Beverage {
    protected String description = "Abstract beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
