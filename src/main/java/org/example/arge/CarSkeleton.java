package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {

    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        return getName() + " is starting";
    };
    public String drive(){
        runEngine(this);
        return getName() + " is driving";
    };
    public void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof GasPoweredCar){
            GasPoweredCar gasPoweredCar = (GasPoweredCar)carSkeleton;
            System.out.println(gasPoweredCar.getAverageKmPerLiter() + " " + gasPoweredCar.getCylinders());
        }
        else if(carSkeleton instanceof ElectricCar){
            ElectricCar electricCar = (ElectricCar)carSkeleton;
            double avgKmPerCharge = electricCar.getAvgKmPerCharge();
            int batterySize = electricCar.getBatterySize();
            System.out.println(avgKmPerCharge + " " + batterySize);


        } else if(carSkeleton instanceof HybridCar){
            HybridCar hybridCar = (HybridCar)carSkeleton;
            double avgKmPerLitre = hybridCar.getAvgKmPerLiter();
            int batterySize = hybridCar.getBatterySize();
            int cylinders = hybridCar.getCylinders();
            System.out.println(avgKmPerLitre + " " + batterySize + " " +cylinders);
        }
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
