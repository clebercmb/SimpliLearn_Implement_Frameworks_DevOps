package com.example.devops;

public enum Color {
    WHITE("white"), BLACK("white"), BLUE("blue"), GREEN("green"), GRAY("grey"), YELLOW("yellow");

    private String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
