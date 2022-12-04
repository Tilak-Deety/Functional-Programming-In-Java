package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Tilak",
                "tilakdeety@gmail.com",
                "+917936542958",
                LocalDate.of(2000,2,25)
        );
        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.isValid(customer));
    }
}
