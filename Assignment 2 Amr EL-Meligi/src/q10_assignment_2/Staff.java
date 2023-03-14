package q10_assignment_2;

import java.util.Date;

public class Staff extends Employee
{

    private String title;

    public Staff(String name, String address, int phoneNumber, String email, String office, int salary, Date dateHired, int officeHours, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        String first = super.toString();
        return first + " Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
