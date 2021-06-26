package com.example.devops;

public class Vehicle extends Car{

    public Vehicle(Integer noOfWheels, Color color) {
        super(noOfWheels, color);
    }

    @Override
    public void drive() {
        System.out.println("Started driving");
    }

    @Override
    public void park() {
        System.out.println("Start parking");

    }
}
