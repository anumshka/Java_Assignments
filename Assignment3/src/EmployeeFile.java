import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeFile {

    EmployeeFile(ArrayList<Employee> allEmployee) {
        try {
            FileWriter writer = new FileWriter("Assignment3/src/employee.txt");
            for (Employee obj : allEmployee) {
                writer.write(obj.getName() + "," + obj.getAge() + "," + obj.getDOB() + "," + obj.getEmail() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("IO Exception raised");
        }
    }

}
