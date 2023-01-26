package org.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> employees = List.of (  new Person("John", Gender.MALE),
                                            new Person("Alex", Gender.FEMALE),
                                            new Person("Ana", Gender.FEMALE),
                                            new Person("Keno", Gender.FEMALE),
                                            new Person("Wright", Gender.MALE),
                                            new Person("Min", Gender.MALE),
                                            new Person("ST", Gender.MALE)
                                        );

//        List<Person> females = new ArrayList<>();
//        for (Person femaleEmployees : employees) {
//            if (Gender.FEMALE.equals(femaleEmployees.gender)) {
//                females.add(femaleEmployees);
//            }
//        }
        //
//        for (Person femaleEmployees : females) {
//            System.out.println(femaleEmployees);
//        }
        //

        Predicate<Person> predicatePerson = person -> Gender.FEMALE.equals(person.gender);
        employees.stream()
                .filter(predicatePerson)
                .collect(Collectors.toList())
                .forEach(System.out::println);
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