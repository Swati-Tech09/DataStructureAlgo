import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//Priority Queue - FIFO , in priority order
public class PriorityQueueExample {
    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(10.0);
        queue.offer(2.0);
        queue.offer(15.0);
        queue.offer(1.0);

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

    }
}
