package Tutorial6.Activity2;

public class Car {
    public Car(double mpg) {
        milesPerGallon = mpg;
        gas = 0;
        drive = 0;
    }

    public void addGas(double amount) {
        gas = gas + amount;
    }

    public void drive(double distance) {
        drive = drive + distance;
    }

    public double getGasInTank()
    {
        double mpg;
        double distance;
        distance = drive;
        mpg = gas * milesPerGallon / distance;
        return gas;
    }

    private double drive;
    private double gas;
    private double milesPerGallon;
}

