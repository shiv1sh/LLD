package DeignPatterns.StrategyDesignPatterns.WithStrategyPattern;
import DeignPatterns.StrategyDesignPatterns.WithStrategyPattern.Strategy.SportsDriveStartegy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new  SportsDriveStartegy());
    }
}
