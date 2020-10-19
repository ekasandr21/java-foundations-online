package ru.itsjava.object;

import ru.itsjava.oop.Birds;
import ru.itsjava.oop.Crows;
import ru.itsjava.oop.Parrots;

public class ObjectPractice {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2);

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog charly = new Dog("Charly", 4);
        Dog murka = new Dog("Murka", 4);
        Dog murka2 = new Dog("Murka", 4);

        System.out.println("murka.equals(murka2) = " + murka.equals(murka2));
        System.out.println("charly.equals(murka) = " + charly.equals(murka));

        System.out.println("charly.toString() = " + charly);
      /*  Birds parrot1 = new Crows("", "what", "is", "Wrong", "black", true, 12);
        Birds parrot2 = new Crows("", "what", "is", "NotWrong", "black", true, 12);
        Birds parrot3 = new Crows("", "what", "is", "Wrong", "black", true, 12);
        Birds parrot4 = new Crows("", "what", "is", "Wrong", "black", true, 15);
*/
        /*System.out.println("parrot1.equals(parrot2) = " + parrot1.equals(parrot2));
        System.out.println("parrot2.equals(parrot3) = " + parrot2.equals(parrot3));
        System.out.println("parrot1.equals(parrot3) = " + parrot1.equals(parrot3));
        System.out.println("parrot1.equals(parrot3) = " + parrot4.equals(parrot1));
        System.out.println("parrot1.equals(parrot1) = " + parrot1.equals(parrot1));*/


    }
}
