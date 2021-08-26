import java.io.*;
import java.util.ArrayList;

public class EmployeeList {

    ArrayList<Employee> allEmployee = new ArrayList<Employee>();

    EmployeeList() {

        try {

            File file = new File("Assignment3/src/employee.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] detailsStr = line.split(",");
                Employee employee = new Employee();
                employee.setName(detailsStr[0]);
                employee.setAge(Integer.parseInt(detailsStr[1]));
                employee.setDOB(detailsStr[2]);
                employee.setEmail(detailsStr[3]);
                allEmployee.add(employee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}