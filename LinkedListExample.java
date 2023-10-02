import java.util.LinkedList;


// LinkedList can use as Stack with push - LIFO
// offer can work as queue -FIFO
// It is best for Insert/Delete , search is costly
public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<>();

        l.push("A");
        l.push("B");
        l.push("C");

        System.out.println(l.poll());

        l.offer("A");
        l.offer("B");
        l.offer("C");
        System.out.println(l.poll());


    }
}
