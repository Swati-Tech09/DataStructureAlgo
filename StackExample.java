import java.util.Stack;

//Stack : LIFO - push to add, pop to remove
public class StackExample {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println("Before pop: " +s);
        s.pop();
        System.out.println("After pop: " +s);
        System.out.println("Peek-" + s.peek());
        System.out.printf("Is Empty" +s.empty());
    }
}
