import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeFile {

    EmployeeFile(ArrayList<Employee> allEmployee) {
        try {
            FileWriter writer = new FileWriter("Assignment3/src/employee.txt");
            for (Employee employee : allEmployee) {
                writer.write(employee.getName() + "," + employee.getAge() + "," + employee.getDOB() + "," + employee.getEmail() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("IO Exception raised");
        }
    }

}
