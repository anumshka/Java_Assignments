import java.util.*;

public class SortByDOB implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.getDOB().compareTo(b.getDOB());
    }
}