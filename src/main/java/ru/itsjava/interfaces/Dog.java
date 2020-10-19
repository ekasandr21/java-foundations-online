package ru.itsjava.interfaces;

public class Dog implements Walkable, Swimmable, Runnable, Flyable {
    @Override
    public void run() {
        System.out.println("Run! Dog!");
    }

    @Override
    public void walk() {
        System.out.println("Walk! Dog!");
    }

    @Override
    public void swim() {
        System.out.println("Swim! Dog!");
    }

    @Override
    public void fly() {
        System.out.println("Something went wrong");
    }

    @Override
    public int maxRunDistance() {
        return 100;
    }

    @Override
    public double maxSwimSpeed() {
        return 5.0;
    }

    @Override
    public String maxFlyDistance() {
        return "Nope";
    }
}
