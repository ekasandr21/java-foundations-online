package ru.itsjava.interfaces.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {
    private final String name;
    private final String surname;
    private double age;

    @Override
    public int compareTo(Person o) {

        if (0 == surname.compareTo(o.surname)) {
            if (0 == name.compareTo(o.name)) {
                if (age == o.age) {
                    return 0;
                }
                return (int) (age - o.age);
            }
            return name.compareTo(o.name);
        }
        return surname.compareTo(o.surname);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
