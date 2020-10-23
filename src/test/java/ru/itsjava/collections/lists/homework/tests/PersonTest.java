package ru.itsjava.collections.lists.homework.tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.homework.tests.Person;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс часы должен: ")
public class PersonTest {
    public static final String DEFAULT_NAME = "Me";
    public static final int DEFAULT_AGE = 19;
    public static final int EXPECTED_AGE = 30;
    public static final int TRUE_AGE = 20;
    public static final int FALSE_AGE = 10;

    @DisplayName(" корректно создавать конструктор")
    @Test
    public void shouldCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));

    }

    @DisplayName(" корректно менять возраст")
    @Test
    public void shouldHaveUpdatePerson() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        actualPerson.setAge(EXPECTED_AGE);
        assertEquals(EXPECTED_AGE, actualPerson.getAge());
    }

    @DisplayName(" корректно выполнять метод birthday")
    @Test
    public void shouldExecuteMethodBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        actualPerson.birthday(DEFAULT_AGE);
        assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());
    }

    @DisplayName(" корректно выполнять метод takeBeer")
    @Test
    public void shouldExecuteMethodTakeBeer() {
        Person actualTruePerson = new Person(DEFAULT_NAME, TRUE_AGE);
        Person actualFalsePerson = new Person(DEFAULT_NAME, FALSE_AGE);

        assertTrue(actualTruePerson.takeBeer());
        assertFalse(actualFalsePerson.takeBeer());
    }
}
