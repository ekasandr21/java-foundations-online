package ru.itsjava.homework.collectionsHW;

import ru.itsjava.homework.exceptionHW.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsOfBooks {
    public static void main(String[] args) {
        //пустой список
        List<Book> booksList = new ArrayList<>();

        //список размером 20 книг
        //когда добавляешь элемент в список, список увеличивается на:
        //(старое кол-во*1,5)+1
        //тогда получается надо добавить 13 элементов
        //но что-то мне подсказывает я сделал не так
        Book[] books = new Book[]{
                new Book("Nam","День, когда я понял жизнь",600),
                new Book("Nam","Чудо",500),
                new Book("Nam","Три друга",546),
                new Book("Name","Клюква",321),
                new Book("Name","Домысел",623),
                new Book("Name","Как-то раз...",543),
                new Book("Noname","Мир",121),
                new Book("Noname","Необъятный вечер",97),
                new Book("Noname","Веселый час",60),
                new Book("Noname","Привет!",432),
                new Book("Pushkin","Евгений Онегин",479),
                new Book("Pushkin","Сборник стихов",300),
                new Book("Pushkin","Руслан и Людмила",341),
        };

        List<Book> books20 = new ArrayList<>(Arrays.asList(books));

        //Элемент по индексу
        System.out.println("books20.get(0) = " + books20.get(0));
        //последний элемент
        System.out.println("books20.get(books20.size()) = " + books20.get(books20.size()-1));

        //добавить 5 эл-ов подряд
        books20.add(new Book("Adder", "One",1));
        books20.add(new Book("Adder", "Two",2));
        books20.add(new Book("Adder", "Three",3));
        books20.add(new Book("Adder", "Four",4));
        books20.add(new Book("Adder", "Five",5));
        //Шестой элемент в третью позицию и седьмой в первую
        books20.add(3, new Book("Adder", "Six",6));
        books20.add(0, new Book("Adder", "Seven",7));

        //Удаление элемента
        books20.remove(5);
        Book remBook = new Book("Remover", "HowItRemove", 35);
        books20.add(remBook);
        books20.remove(remBook);

        //Проеврка наличие элемента
        books20.contains(remBook);

        //вывод списка
        System.out.println(books20);

    }
}
