package DeignPatterns.StrategyDesignPatterns.WithStrategyPattern.Strategy;

public class NormalDriveStartegy implements DriveStrategy{
    public void drive(){
        System.out.println("Normal drive startegy");
    }
}
