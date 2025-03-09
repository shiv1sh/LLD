package DeignPatterns.StrategyDesignPatterns.WithStrategyPattern;

import DeignPatterns.StrategyDesignPatterns.WithStrategyPattern.Strategy.DriveStrategy;
import DeignPatterns.StrategyDesignPatterns.WithStrategyPattern.Strategy.SportsDriveStartegy;

public class Main{
    public static void main(String args[]) {
        // Vehicle vehicle = new SportsVehicle();
        // vehicle.drive();
        
        DriveStrategy obj = new SportsDriveStartegy();
        Vehicle vehicle = new Vehicle(obj);
        vehicle.drive();
    }
}
