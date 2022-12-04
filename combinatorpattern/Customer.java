package combinatorpattern;

import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String email;
    private final String phonenumber;
    private final LocalDate dob;

    public Customer(String name, String email, String phonenumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public LocalDate getDob() {
        return dob;
    }
}
