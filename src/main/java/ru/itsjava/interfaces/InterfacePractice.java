package ru.itsjava.interfaces;

public class InterfacePractice {
    public static void main(String[] args) {
        Creatable khotabych = new Gin();

        khotabych.createWish();

        Creatable badGin = new BadGin();
        badGin.createWish();

        khotabych.canYouCreateWish();
        badGin.canYouCreateWish();

       /* Man man = new Man();
        Bird bird = new Bird();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        System.out.println("Man maxRunDistance : " + man.maxRunDistance());
        System.out.println("Man maxFlyDistance : " + man.maxFlyDistance());
        System.out.println("Man man.maxSwimSpeed : " + man.maxSwimSpeed());
        man.run();
        man.swim();
        man.walk();
        man.fly();
        System.out.println();

        System.out.println("Dog maxRunDistance : " + dog.maxRunDistance());
        System.out.println("Dog maxFlyDistance : " + dog.maxFlyDistance());
        System.out.println("Dog man.maxSwimSpeed : " + dog.maxSwimSpeed());
        dog.run();
        dog.swim();
        dog.walk();
        dog.fly();
        System.out.println();

        System.out.println("Cat maxRunDistance : " + cat.maxRunDistance());
        System.out.println("Cat maxFlyDistance : " + cat.maxFlyDistance());
        System.out.println("Cat man.maxSwimSpeed : " + cat.maxSwimSpeed());
        cat.run();
        cat.swim();
        cat.walk();
        cat.fly();
        System.out.println();

        System.out.println("Fish maxRunDistance : " + fish.maxRunDistance());
        System.out.println("Fish maxFlyDistance : " + fish.maxFlyDistance());
        System.out.println("Fish man.maxSwimSpeed : " + fish.maxSwimSpeed());
        fish.run();
        fish.swim();
        fish.walk();
        fish.fly();
        System.out.println();

        System.out.println("Bird maxRunDistance : " + bird.maxRunDistance());
        System.out.println("Bird maxFlyDistance : " + bird.maxFlyDistance());
        System.out.println("Bird man.maxSwimSpeed : " + bird.maxSwimSpeed());
        bird.run();
        bird.swim();
        bird.walk();
        bird.fly();*/

    }
}
