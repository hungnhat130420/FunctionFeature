package org.functional;

import java.util.function.Function;

public class FunctionFeature {

    public static void main(String[] args) {
//        int crement = increment(0);


        Integer result = incrementFunction.apply(2);
        System.out.println(result);

    }

    static Function<Integer, Integer> incrementFunction = increment ->  increment + 1;

    static int increment (int number) {
        return number + 1;
    }
}
