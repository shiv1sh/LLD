package DeignPatterns.StrategyDesignPatterns.WithStrategyPattern;

import DeignPatterns.StrategyDesignPatterns.WithStrategyPattern.Strategy.NormalDriveStartegy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle(){
        super(new NormalDriveStartegy());
    }
}
