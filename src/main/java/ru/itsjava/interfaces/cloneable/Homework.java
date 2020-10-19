package ru.itsjava.interfaces.cloneable;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) throws CloneNotSupportedException {
        //???
        /*Person[] persons = new Person[]{new Person("Mike", "Octaine",32),
                new Person("Andrew", "Lebedev",19),
                new Person("Mike", "Octaine",20)};*/
        //COMPARABLE
        Person mike = new Person("Mike", "Octaine", 32);
        Person andrew = new Person("Andrew", "Octaine", 19);
        Person mike2 = new Person("Mike", "Octaine", 30);
        Person mike3 = new Person("Nick", "Octaine", 30);
        Person mike4 = new Person("Mike", "Oswald", 14);

        Person[] persons = {mike, mike4, mike3, mike2};

        System.out.println("mike.compareTo(mike2) = " + mike.compareTo(mike3));

        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));
        System.out.println();
        Arrays.sort(persons);
        System.out.println("Arrays.toString(persons) = " + Arrays.toString(persons));

        //CLONE

        Person andrew2 = (Person) andrew.clone();
    }
}
