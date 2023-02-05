package org.functional.comparatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidateService {
    public boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public boolean isPhoneValid(String phone) {
        return phone.contains("09");
    }

    public boolean isAdult(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears() > 16;
    }
    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail())
                && isPhoneValid(customer.getPhoneNumber())
                && isAdult(customer.getDob());
    }
}
