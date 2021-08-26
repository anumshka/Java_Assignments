import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationTest {

    public static void main(String[] args) {
        //File Output Stream
        FileOutputStream fileStream = null;
        try {
            fileStream = new FileOutputStream(args[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Object Output Stream
        ObjectOutputStream os = null;
        try {
            os = new ObjectOutputStream(fileStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4 Students and 4 Addresses
        Address address1 = new Address("New York", "New York City", 123, "USA");
        Student student1 = new Student("Tay", "01/01/2001", address1);

        Address address2 = new Address("Chicago", "Illinois", 456, "USA");
        Student student2 = new Student("Ray", "05/06/2001", address2);

        Address address3 = new Address("Los Angeles", "California", 789, "USA");
        Student student3 = new Student("Cay", "02/04/2000", address3);

        Address address4 = new Address("San Francisco", "California", 1011, "USA");
        Student student4 = new Student("Shay", "09/04/2001", address4);

        //A list of Students
        ArrayList<Student> allStudents = new ArrayList<Student>();

        //Adding all the four students
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);

        //Writing the object to the file
        try {
            if (os != null) {
                os.writeObject(allStudents);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try {
            if (os != null) {
                os.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





