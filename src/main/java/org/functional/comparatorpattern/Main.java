package org.functional.comparatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "0934545454",
                LocalDate.of(2000, 4, 13)
        );
//        System.out.println( new CustomerValidateService().isValid(customer) ? "Adult" : "Child");
//        CustomerRegistrationValidator.ValidationResult result = isValidEmail() ;
    }
}
