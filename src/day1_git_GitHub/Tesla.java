package day1_git_GitHub;

public class Tesla extends Car {

    private boolean isBatteryChangeable;

    public Tesla(String model, String color, int year, double price, String fuel, boolean isBatteryChangeable) {

        super("Tesla",model,color,year,price,fuel);
        this.isBatteryChangeable = isBatteryChangeable;
    }
    @Override
    public void start() {

        System.out.println(getBrand()+ " "+ getModel()+ " is able to be started keyless !!");
    }


}
