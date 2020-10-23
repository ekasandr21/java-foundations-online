package ru.itsjava.homework.tests;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private int age;

    public void birthday(int age) {
        age++;
        setAge(age);
    }

    public boolean takeBeer() {

        return age > 18;
    }
}
