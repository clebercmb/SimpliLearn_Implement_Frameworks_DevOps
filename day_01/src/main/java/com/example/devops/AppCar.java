package com.example.devops;

public class AppCar {

    public static void main(String[] args) {
        Car car1 = new Vehicle(4,Color.BLACK, "BMW");
        Car car2 = new Vehicle(4,Color.YELLOW, "FORD");

        System.out.println(car1);
        car1.drive();

    }
}
