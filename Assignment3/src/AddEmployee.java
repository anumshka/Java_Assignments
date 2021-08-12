import java.util.ArrayList;
import java.util.Scanner;

public class AddEmployee {

    //This is the new arraylist after addition
    ArrayList<Employee> addedAllEmployee;

    //Print to display the details
    void print(ArrayList<Employee> allEmployee) {
        for (Employee employee : allEmployee) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getDOB() + " " + employee.getEmail() + " ");
        }
    }

    //This constructor constructs the new arraylist and writes it to the file
    AddEmployee(ArrayList<Employee> allEmployee) {
        //Copying the prevoius list
        addedAllEmployee = allEmployee;
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter the details : ");

        System.out.println("Name: ");
        String name = sc.nextLine();
        employee.setName(name);

        System.out.println("Age: ");
        int age = sc.nextInt();
        employee.setAge(age);
        sc.nextLine();

        System.out.println("Date of Birth: ");
        String dob = sc.nextLine();
        employee.setDOB(dob);

        System.out.println("Email : ");
        String Email = sc.nextLine();
        employee.setEmail(Email);

        //Add the new employee
        addedAllEmployee.add(employee);
        print(addedAllEmployee);

        //Write the new added list to the employee.txt file
        EmployeeFile employeeFile = new EmployeeFile(addedAllEmployee);
    }

}
