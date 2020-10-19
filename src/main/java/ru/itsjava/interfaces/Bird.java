package ru.itsjava.interfaces;

public class Bird implements Walkable, Swimmable, Runnable, Flyable {
    @Override
    public void run() {
        System.out.println("Run! Bird! If you can");
    }

    @Override
    public void walk() {
        System.out.println("Walk! Bird!");
    }

    @Override
    public void swim() {
        System.out.println("Swim! Bird! If you can");
    }

    @Override
    public void fly() {
        System.out.println("Fly! Bird");
    }

    @Override
    public int maxRunDistance() {
        return 2;
    }

    @Override
    public double maxSwimSpeed() {
        return 1.0;
    }

    @Override
    public String maxFlyDistance() {
        return "Very far away";
    }
}
