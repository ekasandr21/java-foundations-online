package ru.itsjava.homework.interfacesh;

public interface Talkable {
    default void talk() {
        System.out.println("Bla-bla-bla");
    }
}
