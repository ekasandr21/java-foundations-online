package ru.itsjava.string;

public class StringPractice {
    public static void main(String[] args) {
//        String name = "Vitaliy";
//        String copyName = "Vitaliy";
//
//        System.out.println("(name == copyName) = " + (name == copyName));
//
//        String constructorName = new String("Vitaliy");
//        System.out.println("(constructorName == name) = " + (constructorName == name));
//        String interConstructorName = constructorName.intern();
//
//        System.out.println("(interConstructorName == name) = " + (interConstructorName == name));

        String str = "Я строка";
        String str2 = "Я строка, но другая";
        String str3 = "я  строка";
        String str4 = "вжух";
        String str5 = "Я СТРОКА";

        //методы сравнения
        str.equals(str3);// проверяет идентичны ли эти объекты
        str.compareTo(str3);// лексикографическое сравнение строк
        str.equalsIgnoreCase(str3);// игнорирует регистр
        str.compareToIgnoreCase(str3);// игнорирует регист

        // методы CharSequence
        str.length();//длина строки
        str.charAt(3);//возвращает символ по заданному индексу
        str.subSequence(3, 5);//возвращает часть строки между заданными индексами

        //методы сравнения строки с объектом
        // str.contentEquals();
        // str.contentEquals();

        //занесение строки в пул строк
        String example = new String("Пример");
        example.intern();//занесли в пул строк

        //методы, связанные с символами строк
        str3.toUpperCase();//преобразование в верхний регистр
        str5.toLowerCase();//в нжний регистр
        str.toCharArray();//преобразыует к исходному массиву char

        //Соединение строк
        System.out.println("(str + str2) = " + (str + str2));//соединили строки за счет "+" - конкатенация

        //Извлеченме подстрок
        str3.substring(2, 5);// возвращает подстроку

        // удаление лишних пробелов
        str3.trim();

        //приведение элементарных типов и объектов к строке
        //static String valueOf();

        //сопоставление строк и образцов
        str2.replace(",", str4);// заменяет один элемент строки на другой

        //разделить строки по заданному символу
        str2.split("р");//разбили строку
    }
}
