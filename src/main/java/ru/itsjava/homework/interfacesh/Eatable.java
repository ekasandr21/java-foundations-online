package ru.itsjava.homework.interfacesh;

public interface Eatable {
    default void eat() {
        System.out.println("Om-nom-nom");
    }
}
