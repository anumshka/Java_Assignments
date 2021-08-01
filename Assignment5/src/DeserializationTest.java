import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class DeserializationTest {

    public static void main(String[] args) {
        //File Input Stream
        FileInputStream fileStream = null;

        try {
            fileStream = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Object Input Stream
        ObjectInputStream os = null;

        try {
            os = new ObjectInputStream(fileStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Object allStudents = null;

        try {

            if (os != null) {
                allStudents = os.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Getting back the stored list
        @SuppressWarnings("unchecked")
        ArrayList<Student> storedStudents = (ArrayList<Student>) allStudents;

        //Printing the details of the students from the list one by one
        if (storedStudents != null) {
            for (Student student : storedStudents) {
                student.print();
            }
        } else {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
