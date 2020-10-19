package ru.itsjava.interfaces;

public class Man implements Walkable, Swimmable, Runnable, Flyable {
    @Override
    public void run() {
        System.out.println("Run! Man!");
    }

    @Override
    public void walk() {
        System.out.println("Walk! Man!");
    }

    @Override
    public void swim() {
        System.out.println("Swim! Man!");
    }

    @Override
    public void fly() {
        System.out.println("Oh, no! You need to get a ticket on plane");
    }


    @Override
    public int maxRunDistance() {
        return 200;
    }

    @Override
    public double maxSwimSpeed() {
        return 10.0;
    }

    @Override
    public String maxFlyDistance() {
        return "Very far away, if you're on a plane";
    }


}
