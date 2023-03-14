package q10_assignment_2;

public class Student extends Person{
    private final String status;

    public Student(String name, String address, int phoneNumber, String email,String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        String start = super.toString();
        return start + " Student{" +
                "status='" + status + '\'' +
                '}';
    }
}
