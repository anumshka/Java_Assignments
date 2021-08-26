import java.util.*;

public class SortByEmail implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.getEmail().compareTo(b.getEmail());
    }
}