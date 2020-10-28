package ru.itsjava.collection.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktpr", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valrntinOmega = new Watch("OMega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(viktorSeiko, vitaliySeiko, dmitriySeiko, valrntinOmega));

        //Вывод часов Seiko

        for (Watch elemWatch : watches) {
            if (elemWatch.getFirm().equals("Seiko")) {
                System.out.println(elemWatch + " ");
                System.out.println();
            }
        }
        System.out.println();

        //Вывод часов, которые стоят больше 25000
        System.out.println("Вывод часов > 25_000.0");
        for (Watch elemWatch : watches) {
            if (elemWatch.getPrice() > 25_000.0) {
                System.out.println(elemWatch + " ");

            }
        }
        System.out.println();

        //Вывод одних часов, которые стоят больше 25000
        System.out.println("Вывод часов > 25_000.0");
        for (Watch elemWatch : watches) {
            if (elemWatch.getPrice() > 25_000.0) {
                System.out.println(elemWatch + " ");
                break;
            }
        }
        System.out.println();

        //пропустить перве два элемента фирмы Seiko
        System.out.println("Пропустить первые два элемента фирмы Seiko");
        //Это я сам быстро сделал
        /*int i=0;
        for (Watch elemWatch : watches){
            if (elemWatch.getFirm().equals("Seiko")){
                i++;
                if (i>2){
                    System.out.println(elemWatch + " ");
                }
            }
        }
        System.out.println()*/
        ;
        int seikoCount = 0;
        for (int i = 0; i < watches.size() - 1; i++) {
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2) {
                seikoCount++;
            } else {
                System.out.println(watches.get(i));
            }
        }
    }

}
