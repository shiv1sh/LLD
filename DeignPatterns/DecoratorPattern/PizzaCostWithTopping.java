package DeignPatterns.DecoratorPattern;

import DeignPatterns.DecoratorPattern.BaseClass.BasePizza;
import DeignPatterns.DecoratorPattern.ChildClass.MargritaPizza;
import DeignPatterns.DecoratorPattern.DecoratorClass.Topings.ExtraCheese;

public class PizzaCostWithTopping {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese( new MargritaPizza());
        System.out.println(pizza.cost());
    }
}

