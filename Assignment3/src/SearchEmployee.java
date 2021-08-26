import java.util.*;

public class SearchEmployee {

    //Print to display the details
    void print(ArrayList<Employee> allEmployee) {
        for (Employee employee : allEmployee) {
            System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getDOB() + " " + employee.getEmail() + " ");
        }
    }

    //Search based on any query
    void display(int query,ArrayList<Employee> allEmployee)
    {
        switch(query)
        {
            case 1 :
                for(Employee employee : allEmployee)
                {
                    System.out.println(employee.getName());
                }
                break;

            case 2 :
                for(Employee employee : allEmployee)
                {
                    System.out.println(employee.getAge());
                }
                break;

            case 3 :
                for(Employee employee : allEmployee)
                {
                    System.out.println(employee.getEmail());
                }
                break;

            case 4 :
                for(Employee employee : allEmployee)
                {
                    System.out.println(employee.getDOB());
                }
                break;
        }
    }

    //Sort by a particular parameter
    void sortBy(int parameter, char order,ArrayList<Employee>allEmployee)
    {
        if(parameter==1)
        {
            if(order=='A')
            {
               allEmployee.sort(new SortByName());
            }
            else
            {
               Comparator<Employee> comparator = Collections.reverseOrder(new SortByName());
               allEmployee.sort(new SortByName());
            }
        }

        if(parameter==2)
        {
            if(order=='A')
            {
                allEmployee.sort(new SortByAge());
            }
            else
            {
                Comparator<Employee> comparator = Collections.reverseOrder(new SortByAge());
                allEmployee.sort(new SortByAge());
            }
        }

        if(parameter==3)
        {
            if(order=='A')
            {
                allEmployee.sort(new SortByDOB());
            }
            else
            {
                Comparator<Employee> comparator = Collections.reverseOrder(new SortByEmail());
                allEmployee.sort(new SortByEmail());
            }
        }

        if(parameter==4)
        {
            if(order=='A')
            {
                allEmployee.sort(new SortByEmail());
            }
            else
            {
                Comparator<Employee> comparator = Collections.reverseOrder(new SortByDOB());
                allEmployee.sort(new SortByDOB());
            }
        }
        print(allEmployee);

    }

    //Asking for the options related to search
    SearchEmployee(ArrayList<Employee>allEmployee)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Search all the employees by any one the fields");
        System.out.println("""
                Enter 1 for Name
                2 for Age
                3 for DOB
                4 for Email""");
        int query=Integer.parseInt(sc.nextLine());
        display(query,allEmployee);
        System.out.println("Sort all the employees by any one of the parameters");
        System.out.println("""
                Enter 1 for Name
                2 for Age
                3 for DOB
                4 for Email""");
        int parameter=Integer.parseInt(sc.nextLine());
        System.out.println("Also,Specify the order A for ascending and D for descending");
        char order = sc.next().charAt(0);
        sortBy(parameter,order,allEmployee);
    }

}
