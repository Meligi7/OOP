package q10_assignment_2;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private int salary;
    private Date dateHired;

    public Employee(String name, String address, int phoneNumber, String email, String office, int salary, Date dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        String first = super.toString();
        return first + " Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                '}';
    }
}

