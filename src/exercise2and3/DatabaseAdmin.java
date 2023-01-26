package exercise2and3;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, String birthday, String address, String dateOfEmployment, String position, String dbTechnology) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin " + super.getAddress();
    }
}