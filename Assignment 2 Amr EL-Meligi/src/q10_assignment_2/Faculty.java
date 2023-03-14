package q10_assignment_2;
import java.util.Date;

public class Faculty extends Employee{
    private int officeHours;
    private String rank;

    @Override
    public String toString() {
        String first = super.toString();
        return first + " Faculty{" +
                "officeHours=" + officeHours +
                ", rank='" + rank + '\'' +
                '}';
    }

    public Faculty(String name, String address, int phoneNumber, String email, String office, int salary, Date dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
}
