package toppings;

import base.BasePizza;

public class Mushrooms extends ToppingDecorator{
    BasePizza pizza;

    public Mushrooms(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 15;
    }
}
