package hashtablesjdk;

import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        HashMap<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        hashMap.put("Wilson", mikeWilson);
//        hashMap.put("Wilson", johnDoe);

        Employee employee = hashMap.putIfAbsent("Smith", mikeWilson);

        System.out.println(hashMap.containsKey("Jones"));
        System.out.println(hashMap.containsValue(marySmith));

//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        hashMap.forEach((k, v) -> System.out.println("Key: " + k + " - Employee: " + v));
    }
}
