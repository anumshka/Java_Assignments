import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {
    String firstName;
    Date dateOfBirth;
    Address address;

    public Student(String firstName, String dateOfBirth, Address address) {
        this.firstName = firstName;
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.address = address;
    }
    //getter methods

    public Date getDateOfBirth() {
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
        String newstr = new SimpleDateFormat("MM/dd/yyyy").format(getDateOfBirth());
        System.out.println("Name: " + getFirstName() + " DOB: " + newstr);
        System.out.println(getAddress().print());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}






