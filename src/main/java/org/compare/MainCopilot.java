package org.compare;

import java.util.Arrays;
import java.util.List;

public class MainCopilot {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        int [] arrayNumbers = {1,2,3,4,5};
        String [] arrayString = {"a", "bcc", "d", "e", "f"};


        System.out.println("Array numbers: " + arrayNumbers.length + 1);

        System.out.println("Array String: " + arrayString.length + 1);

        // define and get list of number from 1 to 4 and get highest number and print it
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int highest = numbers.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        int smallest = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
//        System.out.println("Smallest number is: " + highest);

        List<Integer> listNumber = Arrays.asList(1, 2, 3, 4);

//        listNumber.
    }

}
