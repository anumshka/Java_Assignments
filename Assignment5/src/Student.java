import java.io.Serializable;

public class Student implements Serializable {
    String firstName;
    String dateOfBirth;
    Address address;

    public Student(String firstName, String dateOfBirth, Address address) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
    //getter methods

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() {
        return address;
    }
    //print

    public void print() {

        System.out.println("Name: " + getFirstName() + " DOB: " + getDateOfBirth());
        System.out.println(getAddress().print());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}






