package ru.itsjava.oop;

public class Car {
    private final String brand;
    private final String name;
    private final int maxSpeed;
    private final int seats;
    private int mileage; //Если машиной до сих пор пользуются
    private String color; //Можно поменять

    public Car(String brand, String name, int maxSpeed, int seats,
               int mileage, String color) {
        this.brand =brand;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.seats = seats;
        this.mileage = mileage;
        this.color = color;
    }
}

