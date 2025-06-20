import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExample {
     static void stackExample() {
        Stack<Integer> stack = new Stack<>(); // Stack is a LIFO (Last In First Out) data structure
        // Push elements onto the stack
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            System.out.println("Pushed " + i + " onto the stack");
        }

        // Print the current stack
        System.out.println("Current stack: " + stack);

        // Stack isEmpty check
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack is not empty");
        }

        // Peek at the top element of the stack
        if (!stack.isEmpty()) {
            int topElement = stack.peek();
            System.out.println("Top element of the stack is: " + topElement);
        } else {
            System.out.println("Cannot peek, the stack is empty");
        }

        // Length of the stack
        int stackSize = stack.size();
        System.out.println("Size of the stack: " + stackSize);

        // Pop elements from the stack
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println("Popped " + value + " from the stack");
        }
        System.out.println("After popping all elements, the stack is " + (stack.isEmpty() ? "empty" : stack));
    }

    static void queueExample() {
        Queue<Integer> queue = new LinkedList<>(); // Queue is a FIFO (First In First Out) data structure
        // Enqueue elements into the queue
        for (int i = 1; i <= 5; i++) {
            queue.offer(i); // or queue.add(i);
            System.out.println("Enqueued " + i + " into the queue");
        }
        System.out.println("Queue after adding elements: " + queue);

        // Length of the queue
        int queueSize = queue.size();
        System.out.println("Size of the queue: " + queueSize);

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }

        // Peek at the front element of the queue
        if (!queue.isEmpty()) {
            int frontElement = queue.peek();
            System.out.println("Front element of the queue is: " + frontElement);
        } else {
            System.out.println("Cannot peek, the queue is empty");
        }

        // Dequeue elements from the queue
        while (!queue.isEmpty()) {
            int value = queue.poll(); // or queue.remove();
            System.out.println("Dequeued " + value + " from the queue");
        }
    }

    public static void main(String[] a) {
        stackExample();
        queueExample();
    }
}
