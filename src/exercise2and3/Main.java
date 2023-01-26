package exercise2and3;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Ilie", "Nastase", "1965-11-01", "Bucuresti", "2022-10-01", "Programmer", "Java");
        System.out.printf("Our %s is %s, who is %s years old.\n", programmer.getPosition(), ReturnPersonRelatedData.getFullName(programmer), ReturnPersonRelatedData.getAge(programmer));
        System.out.printf("%s is from %s, joined our team in %s and he loves %s.\n", programmer.getFirstName(), programmer.getAddress(), programmer.getDateOfEmployment(), programmer.getLanguage());

        DatabaseAdmin dbAdmin = new DatabaseAdmin("Ion", "Tiriac", "1957-06-01", "Bucuresti", "2020-04-01", "Database administrator", "SQL");
        System.out.printf("Our %s is %s, who is %s years old.\n", dbAdmin.getPosition(), ReturnPersonRelatedData.getFullName(dbAdmin), ReturnPersonRelatedData.getAge(dbAdmin));
        System.out.printf("%s is from *** %s ***, joined our team in %s and he loves %s.\n", dbAdmin.getFirstName(), dbAdmin.getAddress(), dbAdmin.getDateOfEmployment(), dbAdmin.getDbTechnology());
    }
}
