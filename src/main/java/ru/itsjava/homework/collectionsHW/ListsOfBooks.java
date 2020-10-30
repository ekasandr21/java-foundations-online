package ru.itsjava.homework.collectionsHW;

import ru.itsjava.collection.lists.Watch;

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
        Book[] books20 = new Book[]{
                new Book("Nam", "День, когда я понял жизнь", 600),
                new Book("Nam", "Чудо", 500),
                new Book("Nam", "Три друга", 546),
                new Book("Name", "Клюква", 321),
                new Book("Name", "Домысел", 623),
                new Book("Name", "Как-то раз...", 543),
                new Book("Noname", "Мир", 121),
                new Book("Noname", "Необъятный вечер", 97),
                new Book("Noname", "Веселый час", 60),
                new Book("Noname", "Привет!", 432),
                new Book("Pushkin", "Евгений Онегин", 479),
                new Book("Pushkin", "Сборник стихов", 300),
                new Book("Pushkin", "Руслан и Людмила", 341),
        };

        List<Book> books20List = new ArrayList<>(Arrays.asList(books20));

        //Элемент по индексу
        System.out.println("books20.get(0) = " + books20List.get(0));
        //последний элемент
        System.out.println("books20.get(books20.size()) = " + books20List.get(books20List.size() - 1));

        //добавить 5 эл-ов подряд
        books20List.add(new Book("Adder", "One", 1));
        books20List.add(new Book("Adder", "Two", 2));
        books20List.add(new Book("Adder", "Three", 3));
        books20List.add(new Book("Adder", "Four", 4));
        books20List.add(new Book("Adder", "Five", 5));
        //Шестой элемент в третью позицию и седьмой в первую
        books20List.add(3, new Book("Adder", "Six", 6));
        books20List.add(0, new Book("Adder", "Seven", 7));

        //Удаление элемента
        books20List.remove(5);
        Book remBook = new Book("Remover", "HowItRemove", 35);
        books20List.add(remBook);
        books20List.remove(remBook);

        //Проеврка наличие элемента
        System.out.println("books20.contains(remBook) = " + books20List.contains(remBook));
        //вывод списка
        System.out.println(books20List);


        //UPDATE: ДОБАВИЛ СПИСОК С 20 ЧЕРЕЗ КОНСТРУКТОР

        List<Book> books20UPD = new ArrayList<>(20);

        //Отфильтровать список по некоторому условию
        //а)Индекс делится на 3
        System.out.println("Фильтр по индексу кратному 3");

        for (int i = 0; i < books20List.size(); i++) {
            double res = i % 3;
            if (res == 0) {
                System.out.println(books20List.get(i));
            }
        }
        System.out.println("Проверка: " + books20List.get(0) + ", " + books20List.get(3));

        //б)вернуть кол-во книг, которые равны Java
        System.out.println();
        System.out.println("Кол-во книг, которые равны Java");
        for (Book elemBook : books20List) {
            if (elemBook.getName().equals("Java")) {
                System.out.println(elemBook + " ");
            }
        }
        System.out.println();

        //Пропустить первые 3 книги в списке
        System.out.println("Пропустить первые три книги в списке");
        int bookCount = 0;
        for (int i = 0; i < books20List.size(); i++) {
            if (bookCount < 2) {
                bookCount++;
            } else {
                System.out.println(books20List.get(i));
            }
        }
        System.out.println();

        //Пропустить первые три книги, которые равны Java
        //Но сначала добавим эти книги :)
        Book[] booksAdd = new Book[]{
                new Book("Java", "Who", 450),
                new Book("Java", "Who", 451),
                new Book("Java", "Who", 452),
                new Book("Java", "Who", 453),
        };
        List<Book> bookAddList = new ArrayList<>(Arrays.asList(booksAdd));
        books20List.addAll(bookAddList);

        System.out.println("Пропустить три книги, которые равны Java");
        int javaCount = 0;
        for (int i = 0; i < books20List.size(); i++) {
            if (books20List.get(i).getName().equals("Java") && javaCount < 3) {
                javaCount++;//System.out.println(books20List.get(i));
            } else {
                System.out.println(books20List.get(i));
            }
        }
        System.out.println();

        //Вернуть первую книгу индекс который делиться на 3
        //!!!
        //Тут один момент: я, когда создавал книги на name указывал автора,
        //а на author соответственно название
        //поэтому я тут брал name
        //!!!

        System.out.println("Вернуть первую книгу, длинна автора которой делится на 3");
        for (int i = 0; i < books20List.size(); i++) {
            double res = books20List.get(i).getName().length() % 3;
            if (res == 0) {
                System.out.println(books20List.get(i));
                break;
            }
        }
        System.out.println();

        //Вернуть все книги, у которых длина автора делится на 3
        System.out.println("Вернуть все книги, у которых длина автора делится на 3");
        for (int i = 0; i < books20List.size(); i++) {
            double res = books20List.get(i).getName().length() % 3;
            if (res == 0) {
                System.out.println(books20List.get(i));
            }
        }
        System.out.println();

        //Вернуть мужчин, котороым >18 & <27 и имя начинается на "Н"
        Person[] persons = new Person[]{
                new Person("Никита", 17, true),
                new Person("Кирилл", 17, true),
                new Person("Андрей", 17, true),
                new Person("Камилла", 20, false),
                new Person("Анна", 17, false),
                new Person("Николай", 17, true),
                new Person("Марина", 18, false),
                new Person("Александр", 17, true),
                new Person("Нияз", 27, true),
                new Person("Никита", 18, true),
                new Person("Нурсултан", 26, true)
        };

        List<Person> personList = new ArrayList<>(Arrays.asList(persons));

        //NEED HELP!!!
        // ДО МЕНЯ НЕ ДОШЛО КАК СДЕЛАТЬ ЛУЧШЕ С ПЕРВОЙ БУКВОЙ ИМЕНИ

        System.out.println("Вывод мужчин подходящих для службы");
        for (Person elemPerson : personList) {
            if (elemPerson.getName().charAt(0) == 'Н' && elemPerson.getAge() > 18 &&
                    elemPerson.getAge() < 27 && elemPerson.isMale()) {
                System.out.println(elemPerson + " ");
            }
        }
        System.out.println();
        //NEED HELP!!!

        //Найти средний  возраст женщин
        int ageAllWomen = 0;
        int ageWomanCount = 0;
        System.out.println("Средний возраст женщин");
        for (Person elemPerson : personList) {
            if (!elemPerson.isMale()) {
                ageAllWomen = ageAllWomen + elemPerson.getAge();
                ageWomanCount++;
            }
        }
        System.out.println("Средний возраст женщин: " + ageAllWomen / ageWomanCount);
    }
}
