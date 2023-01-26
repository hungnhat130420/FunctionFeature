package org.functional;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFeature {
    public static void main(String[] args) {
        List<Person> employees = List.of (  new Person("John", Gender.MALE),
                new Person("Alex", Gender.FEMALE),
                new Person("Ana", Gender.FEMALE),
                new Person("Keno", Gender.FEMALE),
                new Person("Wright", Gender.MALE),
                new Person("Min", Gender.MALE),
                new Person("ST", Gender.MALE)
        );
        employees.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(gender -> System.out.println(gender));

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}
