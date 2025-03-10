import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class pqueue {
    //p-queue: priority-queue

    public static void main(String[] args) {

        // Priority Queue = FIFO data structure that serves elements
        //                  with highest priority first
        //                  before elements with low priority

//        Queue<Double> queue = new PriorityQueue<>();
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); //-- will print list in reverse order


        queue.offer(10.2);
        queue.offer(9.2);
        queue.offer(8.2);
        queue.offer(7.2);

        // while the queue is not empty print queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            // results queue gets printed in ascending order
        }
    }
}
