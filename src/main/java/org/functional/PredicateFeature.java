package org.functional;

import java.util.function.Predicate;

public class PredicateFeature {

    public static void main(String[] args) {
//        System.out.println(isValidPhone("086654654654"));
//        System.out.println(isValidPhone("07454554544"));

        System.out.println( isPredicatePhone.test("07454554544"));
    }

    static Predicate<String> isPredicatePhone = phone -> phone.startsWith("07") && phone.length() == 11;
    static boolean isValidPhone( String phone ) {
        return phone.startsWith("07") && phone.length() == 11;
    }
}
