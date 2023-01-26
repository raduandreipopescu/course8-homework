package exercise2and3;

public class Programmer extends Employee {
    private String language;

    public Programmer(String firstName, String lastName, String birthday, String address, String dateOfEmployment, String position, String language) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}