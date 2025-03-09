package DeignPatterns.StrategyDesignPatterns.WithStrategyPattern;

import DeignPatterns.StrategyDesignPatterns.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    public Vehicle(DriveStrategy obj){
        driveObject = obj;
    }
    public void drive(){
        driveObject.drive(); 
    }
}
