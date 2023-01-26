package exercise2and3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReturnPersonRelatedData {

    public static String getFullName(Employee employee) {
        return (employee.getFirstName() + " " + employee.getLastName());
    }

    public static long getAge(Employee employee) {
        return ChronoUnit.YEARS.between(employee.getBirthday(), LocalDate.now());
    }
}
