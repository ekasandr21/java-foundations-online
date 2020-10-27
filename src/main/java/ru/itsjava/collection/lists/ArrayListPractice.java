package ru.itsjava.collection.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

//        List<Watch> watchesList = new ArrayList<>();
//        Watch seiko = new Watch("Seiko", "Andrew", 17000.0);
//        Watch gShock = new Watch("GHOCK", "Best denser", 12890.0);
//
//        watchesList.add(seiko);
//        watchesList.add(gShock);
//
//        for (Watch elemWatch: watchesList){
//            System.out.println(elemWatch);
//        }
//
//        watchesList.remove(0);
//
//        for (Watch elemWatch: watchesList){
//            System.out.println(elemWatch);
//        }

        List<Watch> watchesOmegaList = new ArrayList<>();
        Watch andrewOmega = new Watch ("Omega","Andrew", 100_000.0);
        Watch romanOmega = new Watch ("Omega","Roman", 100_000.0);

        watchesOmegaList.add(andrewOmega);
        watchesOmegaList.add(romanOmega);
        System.out.println("watchesOmegaList = " + watchesOmegaList);


    }
}
