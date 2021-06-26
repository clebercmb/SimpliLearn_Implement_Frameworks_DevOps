package com.example.devops;

public abstract class Car {

    private Integer noOfWheels;
    private Color color;

    public abstract void drive();
    public abstract void park();

    public Car(Integer noOfWheels, Color color) {
        this.noOfWheels = noOfWheels;
        this.color = color;
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

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color=" + color +
                '}';
    }
}
