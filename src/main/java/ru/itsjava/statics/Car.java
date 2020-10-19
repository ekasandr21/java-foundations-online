package ru.itsjava.statics;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    private final String firm;
    private String color;
    public static double cost = 2_000_000.0;

}
