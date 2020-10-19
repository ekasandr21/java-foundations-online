package ru.itsjava.homework.interfacesh;

public class Cow implements Talkable, Eatable {
    @Override
    public void eat() {
        System.out.println("Om-nom-nom-nom-nom Om-nom-nom-nom...");
    }

    @Override
    public void talk() {
        System.out.println("Mooooo");
    }
}

