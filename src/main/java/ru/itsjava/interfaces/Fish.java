package ru.itsjava.interfaces;

public class Fish implements Walkable, Swimmable, Runnable, Flyable {
    @Override
    public void run() {
        System.out.println("It'll be sus, if you run");
    }

    @Override
    public void walk() {
        System.out.println("It'll be sus, if you walk");
    }

    @Override
    public void swim() {
        System.out.println("Swim! Fish");
    }

    @Override
    public void fly() {
        System.out.println("Ofk, it's not a truthful flight, but there are exist kind of fish which can");
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
        return "I don't know";
    }
}
