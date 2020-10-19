package ru.itsjava.homework.interfacesh;

public class Check {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Man man = new Man();
        Plant plant = new Plant();


        cow.eat();
        cow.talk();
        System.out.println();
        man.talk();
        man.eat();
        System.out.println();
        plant.eat();

    }
}
