package Condiment;

import Beverage.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House blend coffee";
    }

    public double cost() {
        return .89;
    }
}
