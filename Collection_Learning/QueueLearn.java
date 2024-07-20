import java.util.LinkedList;
import java.util.Queue;

public class QueueLearn {

    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        System.out.println(queue.offer(2));
        System.out.println(queue.offer(5));
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println("------------------------------");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println("------------------------------");
        System.out.println(queue.poll());
    }
}
