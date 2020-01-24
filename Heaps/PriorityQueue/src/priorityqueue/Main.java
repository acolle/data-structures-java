package priorityqueue;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(25);
        pq.add(34);
        pq.add(123344);
        pq.add(-432);
        pq.add(442332);

        System.out.println(pq.peek());

        pq.remove();

        System.out.println(pq.peek());

    }
}
