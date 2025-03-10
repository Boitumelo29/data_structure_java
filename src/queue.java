import java.util.LinkedList;
import java.util.Queue;

public class queue {


    public static void main(String[] args) {


        //queue is an interface and not a class and because of that we can not create a new instance of it
        Queue<String> queue = new LinkedList<>();
        // Queue = FIFO - First in Last Out Data Structure

        //add = enqueue, offer()
        //remove = dequeue, poll, it is also good as it does not cause exceptions
        // we can use peek, to view object at the top of our queue, and it does not remove it

        queue.offer("Boitumelo");
        queue.offer("Tumi");
        queue.offer("Thobejane");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Tumi"));
        // results: [Boitumelo, Tumi, Thobejane],
        //Boitumelo
        //Boitumelo - poll has removed Boitumelo from list
        //[Tumi, Thobejane] and now this is the final list
    }
}
