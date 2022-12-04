package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isEmailValid(String email){
        return  email.contains("@");
    }
    private boolean isPhoneNumberValid(String phonenumber){
        return phonenumber.startsWith("+91");
    }
    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

    public boolean isValid (Customer customer){
        return (isEmailValid(customer.getEmail())
                && isPhoneNumberValid(customer.getPhonenumber())
                && isAdult(customer.getDob()));
    }
}
