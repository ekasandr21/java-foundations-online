package ru.itsjava.interfaces;

import javax.sound.midi.Soundbank;

public class BadGin implements Creatable{

    @Override
    public void createWish(){
        System.out.println("Плохо исполнил желание!");
    }

    @Override
    public void canYouCreateWish(){
        System.out.println("I don't grant wishes");
    }
}
