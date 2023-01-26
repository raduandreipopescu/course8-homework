package exercise2and3;

import java.time.LocalDate;

public interface Person {
    String getFirstName();

    String getLastName();

    LocalDate getBirthday();

    String getAddress();
}