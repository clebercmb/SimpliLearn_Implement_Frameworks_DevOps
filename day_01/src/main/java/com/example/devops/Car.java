package com.example.devops;

public abstract class Car {

    private Integer noOfWheels;
    private Color color;
    private String brand;

    public abstract void drive();
    public abstract void park();

    public Car(Integer noOfWheels, Color color, String brand) {
        this.noOfWheels = noOfWheels;
        this.color = color;
        this.brand = brand;
    }

    public Integer getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(Integer noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color=" + color +
                ", brand='" + brand + '\'' +
                '}';
    }
}
