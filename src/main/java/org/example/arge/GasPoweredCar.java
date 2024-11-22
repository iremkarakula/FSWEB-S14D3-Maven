package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, int cylinders, double avgKmPerLitre) {
        super(name, description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public String startEngine() {
        return "GasPoweredCar is starting";
    }

    @Override
    public String drive() {
        runEngine(this);
        return "GasPoweredCar is driving";
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }



}
