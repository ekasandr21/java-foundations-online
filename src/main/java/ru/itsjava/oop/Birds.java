package ru.itsjava.oop;

import java.util.Objects;

public class Birds {
    //Немного задротства
    //anserifomes - отряд
    //anaditae - семейство
    //anser - вид
    private final String anserifomes;
    private final String anaditae;
    private final String anser;
    //Хватит задротства
    private boolean isHomey;
    private final String nickName;
    private boolean isFlaying;
    private final String color;
    private int age;

    public Birds(String anserifomes, String anaditae, String anser,
                 String nickName, String color, boolean isFlaying, int age) {
        this.age = age;
        this.anaditae = anaditae;
        this.anserifomes = anserifomes;
        this.anser = anser;
        this.nickName = nickName;
        this.color = color;
        this.isFlaying = isFlaying;
    }

    //Это строчка проверяет правильные ли мы передаем переменные
    @Override
    //здесь мы пишем что метод публичный возвращает булевую переменную и его название и то, что он передает
    //в данном случае объект
    public boolean equals(Object o) {
        //проверяем ссылается ли ссылка на тот же объект, если да то возвращаем true, т.е. они одинаковы получается
        if (this == o) return true;
        //У меня Java 14-ая поэтому я так понимаю у меня подругому этот метод реализован, но как я понимаю суть похожая
        //проверяем не ссылается ли объект на ничто  или  не равен ли класс классу входящего объекта
        //получается если то, что мы сравниваем ссылается на ничто возвращаем false
        // если класс не равен классу объекта(входящего), то тоже возвращаем false
        if (o == null || getClass() != o.getClass()) return false;
        //приводим тип данных, удостоверяемся что это точно тот тип данных
        Birds birds = (Birds) o;
        //возвращаем: если age равен тому, что мы ввели при создании объекта  и
        // nickName равен(эквивалентен) тоже тому, который мы ввели при создании
        // проще говоря мы тут уже, наконец-то, сравниваем, переопределенным equals, и возвращаем true или false|
        return age == birds.age &&
                nickName.equals(birds.nickName);
    }

    @Override
    public int hashCode() {
        //возвращаем hashCode никнейма и возвраста
        return Objects.hash(nickName, age);
    }
}
