package DeignPatterns.DecoratorPattern.DecoratorClass;

import DeignPatterns.DecoratorPattern.BaseClass.BasePizza;

public abstract class ToppingDecorator extends BasePizza{
    BasePizza pizza;

    public abstract int cost();
}
