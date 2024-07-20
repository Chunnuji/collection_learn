import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DequeLearn {

    public static void main(String[] args){

        //Can add and remove from both sides
        //Can be used as Stack
        //DEQUE//

        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println(deque.offerLast(2));
        System.out.println(deque.offerLast(3));
        System.out.println(deque.offerFirst(5));
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
//        System.out.println(deque.poll());
//        System.out.println(deque.peek());
        System.out.println(deque);


        //STACK//
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);

        stack.push(2);
        System.out.println("-------------------------");
//        System.out.println(stack.push(11));
        System.out.println(stack.pop());


        //PRIORITYQUEUE//

        Queue<Integer> dq = new PriorityQueue<>();

        dq.add(1);
        dq.add(2);
        dq.add(11);
        dq.add(0);
        System.out.println("-------------------------");
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq);

    }

}
