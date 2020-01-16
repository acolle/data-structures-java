package hashtableschallenge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> {
            System.out.println(e);
        });

        HashMap<Integer, Employee> hashMap = new HashMap<Integer, Employee>();
        Iterator<Employee> iterator = employees.iterator();
        LinkedList<Employee> duplicates = new LinkedList<>();

        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if (hashMap.containsKey(employee.getId())) {
                duplicates.add(employee);
            } else {
                hashMap.put(employee.getId(), employee);
            }
        }

        // once duplicates identified, delete them
        for (Employee employee: duplicates) {
            employees.remove(employee);
        }

        System.out.println("---------------");
        employees.forEach(e -> {
            System.out.println(e);
        });
    }
}
