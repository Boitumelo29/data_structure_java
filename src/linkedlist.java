import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        // linked list is similar to both stack and queue
        // linked list is DS that stores series of nodes, each containing 2 parts(data + address)
        // nodes are in non-consecutive memory locations
        // elements are linked using pointers

        //singly linked list [data| address] -> [data| address]
        //doubly linked list [address|data|address] <-> [address|data|address] (stores address of next node and previous)


        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.pop();// should remove d from list
        System.out.println(linkedList);// [C, B, A]

        //we are adding to our list
//        linkedList.offer("E");
        linkedList.offer("F");
        linkedList.offer("G");
        linkedList.poll();
        System.out.println(linkedList);// [B, A, E, F, G]

        linkedList.add(4, "E");
        linkedList.remove("G");
        linkedList.indexOf("E");


        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("AA");
        linkedList.addLast("H");
    }
}
