package com.example.devops;

public class Vehicle extends Car{

    public Vehicle(Integer noOfWheels, Color color, String brand) {
        super(noOfWheels, color,brand);
    }

    @Override
    public void drive() {
        System.out.println("Car is in driving mode");
    }

    @Override
    public void park() {
        System.out.println("Car is in parking mode");

    }
}
