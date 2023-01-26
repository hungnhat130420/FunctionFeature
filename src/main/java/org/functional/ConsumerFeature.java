package org.functional;

import java.util.function.Consumer;

public class ConsumerFeature {
    public static void main(String[] args) {
//        greetingCustomer(new Customer("Ana", "09444"));

        greetCustomerConsumer.accept(new Customer("Janna", "3333"));
    }

    // Consumer
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println( "hello " + customer.name + "have customer " + customer.phone);

    static class Customer {
        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }

    static void greetingCustomer (Customer customer) {
        System.out.println("Hello " + customer.name + "have phone " + customer.phone);
    }

}
