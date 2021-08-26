import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Making a list of the .txt file
        EmployeeList employeeList = new EmployeeList();
        ArrayList<Employee> allEmployee = employeeList.allEmployee;
        System.out.println("""
                Enter 1 for Adding an employee
                2 for Deleting an employee
                3 for Searching,Sorting and Displaying all the employees
                """);
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                AddEmployee addEmployee = new AddEmployee(allEmployee);
                break;

            case 2:
                DeleteEmployee deleteEmployee = new DeleteEmployee(allEmployee);
                break;

            case 3:
                SearchEmployee searchEmployee = new SearchEmployee(allEmployee);
                break;

        }

    }
}
