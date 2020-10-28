package ru.itsjava.homework.collectionsHW;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private  int age;
    private boolean isMale;

}
