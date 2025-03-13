package DeignPatterns.DecoratorPattern.DecoratorClass.Topings;

import DeignPatterns.DecoratorPattern.BaseClass.BasePizza;
import DeignPatterns.DecoratorPattern.DecoratorClass.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    BasePizza pizza;
    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }
    public int cost(){
        return pizza.cost() + 20;
    }
}
