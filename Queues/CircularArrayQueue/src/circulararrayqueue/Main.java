package circulararrayqueue;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee larryPage = new Employee("Larry", "Page", 321);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.remove();
        queue.add(larryPage);

        queue.printQueue();
//        System.out.println(queue.peek());
//        System.out.println(queue.size());
//        queue.remove();
//        System.out.println(queue.peek());
//        System.out.println(queue.size());
    }
}
