package ru.itsjava.interfaces;

public class Cat implements Walkable, Swimmable, Runnable, Flyable {
    @Override
    public void run() {
        System.out.println("Run! Cat!");
    }

    @Override
    public void walk() {
        System.out.println("Walk! Cat!");
    }

    @Override
    public void swim() {
        System.out.println("Swim! Cat! But don't scratch me!");
    }

    @Override
    public void fly() {
        System.out.println("Something went wrong");
    }

    @Override
    public int maxRunDistance() {
        return 50;
    }

    @Override
    public double maxSwimSpeed() {
        return 2.0;
    }

    @Override
    public String maxFlyDistance() {
        return "Nope";
    }
}
