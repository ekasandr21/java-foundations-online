package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) {
     Boy vitalik = new Boy("Vitalik", 15, 165);
     Boy vasya= new Boy("Vasya", 14, 160);
     Boy vanya= new Boy("VAnya", 18, 180);

        System.out.println("vitalik.compareTo(vasya) = " + vitalik.compareTo(vasya));
        System.out.println("vasya.compareTo(vanya) = " + vasya.compareTo(vanya));

        Boy[] boys = {vitalik, vanya,vasya};
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        Arrays.sort(boys);
        System.out.println(Arrays.toString(boys)) ;
    }
}
