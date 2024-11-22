package org.example.arge;

public class ElectricCar extends  CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public String startEngine() {
        return "ElectricCar is starting";
    }

    @Override
    public String drive() {
        runEngine(this);
        return "ElectricCar is driving";
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
