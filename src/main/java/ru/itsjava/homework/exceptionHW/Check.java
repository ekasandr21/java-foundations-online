package ru.itsjava.homework.exceptionHW;

public class Check {
    public static void main(String[] args) {
        try {
            Person person = new Person("name", 190);
        }catch (AgeNotValidException ageNotValidException){
            ageNotValidException.printStackTrace();
        }
    }
}
