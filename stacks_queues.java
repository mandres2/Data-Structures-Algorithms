/*

* Stacks and queues are both linear data structures
    * Contains one element within another
* Both are flexible with their sizes
    * That means one doesn't have to initially allocate them to have a particular size; Instead you can add elements as you go and then also shrink down
* The main difference is how elements are removed from the stack or from the queue.
    * A stack is what would be called a LIFO data structure -- last in, first out
        * Metaphorically speaking, it's like stack of plates
    * In contrast, a queue is a FIFO data structure -- first in, first out
        * A good example is like a line of people waiting to get into a movie theater, when the doors open, the employees first serve the ones that were standing in line at the very
        beginning
*/

public class stacks_queues {

    // Queue Implementation
    public static class Queue {
        // This is an inner class that that just keeps a pointer or variable that represents the data
        private static class Node {
            private int data;
            // Each pointer needs to lead to the next data
            private Node next;
            // Insert Constructor
            private Node (int data) {
                this.data = data;
            }
        }
    }

    private Node head; // Remove from the head
    private Node tail; // Add data here

    // Methods
    public boolean isEmpty() {
        // return head if the head is null, if the head is null the queues empty otherwise it is not
        return head == null;
    }
    public int peek() {
        // Peek method will return head.data -- This will throw an exception when head is equal to null; if you want, you can go explicitly check for that exception
        return head.data;
    }
    public void add(int data) {
        // add to tail
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }
    public int remove() {
        // Remove head from the linked list

        // Obtain head data
        int data = head.data;
        head = head.next; // Removes from the queue
        if (head == null) {
            tail = null;
        }
        // If the head is equal to null set the tail to equal to null and return the data
        return data;
    }

    // Stack Implementation

    public class Stack {
        private static class Node {
            private int data;
            private Node next;
            private Node (int data) {
                this.data = data;
            }
        }
    }
    private Node top; // Note: There is no need for a head or tail because the data structure is LIFO

    // Methods
    public boolean isEmpty() {
        return top == null;
    }
    public int peek() {

    }
    public void push(int data) {

    }
    public int pop() {

    }







}