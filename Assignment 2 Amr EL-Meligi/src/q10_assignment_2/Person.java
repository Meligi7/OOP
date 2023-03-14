package q10_assignment_2;

public class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    public Person(){
    }

    public Person(String name, String address, int phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
