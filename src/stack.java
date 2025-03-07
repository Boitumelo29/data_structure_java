import java.util.Stack;

public class stack {
    public static void main(String[] args) {



        Stack<String> stack = new Stack<>();
        // stack is a LIFO(last in first out data structure)
        //stores objects into vertical tower
        //use push to add to the top
        //use pop to remove from the top

        stack.push("Apples");
        stack.push("Bananas");
        stack.push("Grapes");

        System.out.println(stack);
        //  removes top object first in the stack
        String newStack = stack.pop();
        System.out.println(stack);
        System.out.println(newStack);

        // but if you dont want to remove the any object in the stack then you can use peak
        //we can review object at the top of the stack using peek without removing it from stack
        stack.peek();
        System.out.println(stack);

        // to search we can just use: stack.search
        System.out.println(stack.search("Apples"));

        //Why stacks:
        //1. undo redo features in text editors
        //2. moving forward/backward through browser
        //3. backtracking algorithms
        //4. calling functions
    }
}
