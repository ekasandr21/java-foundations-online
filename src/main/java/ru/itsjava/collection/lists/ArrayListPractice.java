package ru.itsjava.collection.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Andrew", 17000.0);
        Watch gShock = new Watch("GHOCK", "Best denser", 12890.0);

        watchesList.add(seiko);
        watchesList.add(gShock);

        for (Watch elemWatch: watchesList){
            System.out.println(elemWatch);
        }

        watchesList.remove(0);

        for (Watch elemWatch: watchesList){
            System.out.println(elemWatch);
        }
    }
}
