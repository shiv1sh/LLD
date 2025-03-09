package DeignPatterns.StrategyDesignPatterns.WithStrategyPattern.Strategy;

public class SportsDriveStartegy implements DriveStrategy {
    public void drive(){
        System.out.println("Sports drive capability");
    }
}