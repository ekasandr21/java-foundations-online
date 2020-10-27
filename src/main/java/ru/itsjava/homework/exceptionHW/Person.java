package ru.itsjava.homework.exceptionHW;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws AgeNotValidException {
        this.name = name;
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("Incorrect");
        }
        this.age = age;
    }

//    public Person(String name, int i) {
//    }


}

