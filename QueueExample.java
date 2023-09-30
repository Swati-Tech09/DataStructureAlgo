import java.util.LinkedList;
import java.util.Queue;

// Queue - FIFO, We cannot instantiate Interface , hence class LinkedList used
public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        q.add(12);
        q.add(11);
        q.add(9);
        System.out.println("Queue- " +q);
        System.out.println(q.poll());
        System.out.println("Queue- " +q);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
