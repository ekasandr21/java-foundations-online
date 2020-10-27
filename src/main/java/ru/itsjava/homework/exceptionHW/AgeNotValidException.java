package ru.itsjava.homework.exceptionHW;

public class AgeNotValidException extends RuntimeException{
    public AgeNotValidException(String message) {
        super(message);
    }

}
