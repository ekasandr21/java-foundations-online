package ru.itsjava.object;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor

public class Dog {
    private final String nickname;
    private int pawsCount;


    /*public Dog(String nicknamem, int pawsCount){
        this.nickname = nicknamem;
        this.pawsCount = pawsCount;
    }*/


    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return nickname.equals(dog.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public String to String(){
        return "Dog { nickname:" + nickname + " paws:" + pawsCount + "}";
    }*/
}
