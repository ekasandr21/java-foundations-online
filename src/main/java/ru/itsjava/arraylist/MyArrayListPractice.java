package ru.itsjava.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {

//        MyArrayList list = new MyArrayList();
//        System.out.println(list.size());
//         list.add("Privet");
//         list.add("Poka");
//
//        System.out.println("После добавления двух элементов: " + list.size());
//        list.add("Privet");
//        list.add("Poka");
//        list.add("Poka");
//        list.add("Poka");
//        list.add("Poka");
//        list.add("Poka");
//        list.add("Poka");
//        list.add("Poka");
//        list.add("Poka");
//        list.add("Poka");
//        list.add("Poka");
//
//        System.out.println(list.size());
//
//        System.out.println(list);
//        System.out.println();
//        System.out.println("list.isEmpty() = " + list.isEmpty());
//
//        System.out.println("list.contains(\"Poka\") = " + list.contains("Poka"));
//        System.out.println("list.contains(\"Pokaa\") = " + list.contains("Pokaa"));
//
//        list.clear();
//        System.out.println(list);
//        System.out.println("list.size() = " + list.size());
        MyArrayList list= new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");
        list.add("elem4");

//        list.remove(1);
//        System.out.println(list);

//        System.out.println("list.get(3) = " + list.get(3));
//        System.out.println("list.set(1, \"elem123\") = " + list.set(1, "elem123"));
        list.add(6,"elemNew");
        System.out.println("My: ");
        System.out.println(list);

    }
}
