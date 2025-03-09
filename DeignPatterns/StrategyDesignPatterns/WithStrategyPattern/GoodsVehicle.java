package DeignPatterns.StrategyDesignPatterns.WithStrategyPattern;

import DeignPatterns.StrategyDesignPatterns.WithStrategyPattern.Strategy.NormalDriveStartegy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormalDriveStartegy());
    }
}
