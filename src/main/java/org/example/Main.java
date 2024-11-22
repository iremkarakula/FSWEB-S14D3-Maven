package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        printResult(car);

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        printResult(mitsubishi);

        Car ford = new Ford(6, "Ford Falcon");

        printResult(ford);

        Car holden = new Holden(6, "Holden Commodore");

        printResult(holden);


        CarSkeleton electricCar = new ElectricCar("mercedes", "mmmmmm", 10, 11);
        CarSkeleton hybridCar = new HybridCar("bmw", "bbbbbb", 20, 21, 2);
        CarSkeleton gasPoweredCar = new GasPoweredCar("toyota", "ttttt", 20, 21);

        drive(electricCar);
        startEngine(electricCar);
        drive(hybridCar);
        startEngine(hybridCar);
        drive(gasPoweredCar);
        startEngine(gasPoweredCar);


    }
    public static void printResult(Car obj){
        System.out.println(obj.startEngine());

        System.out.println(obj.accelerate());

        System.out.println(obj.brake());

    }
    public static void drive(CarSkeleton obj){
        System.out.println(obj.drive());
    }
    public static void startEngine(CarSkeleton obj){
        System.out.println(obj.startEngine());
    }

}