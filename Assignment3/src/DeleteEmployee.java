import java.util.ArrayList;
import java.util.Scanner;

public class DeleteEmployee {

    //The arraylist after deletion
    ArrayList<Employee> deletedAllEmployee;

    void print(ArrayList<Employee> allEmployee) {
        for (Employee employee : allEmployee) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getDOB() + " " + employee.getEmail() + " ");
        }
    }

    //This Constructor deletes the employee and writes it to the employee.txt file
    DeleteEmployee(ArrayList<Employee> allEmployee) {
        System.out.println("Name/id to delete: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (Employee employee : allEmployee) {
            if (employee.getName().equals(s)) {
                allEmployee.remove(employee);
                break;
            }
        }

        deletedAllEmployee = allEmployee;
        print(deletedAllEmployee);

        //updates the .txt file
        EmployeeFile employeeFile = new EmployeeFile(deletedAllEmployee);
    }

}
