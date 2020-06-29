/*
    * In a doubly linked list, each Node would have two links - one to the next Node and another to the previous Node
    * Programatically speaking, this is how it will be displayed:

    ```java

    public class ListNode {
        int data;
        ListNode previous;
        ListNode next;


        public ListNode(int data) {
            this.data = data;
        }
    }

    ```
*/

public class doubly_linked_lists {

    // Create Head and Tail Pointers

    private ListNode head;
    private ListNode tail;
    private int length; // This integer variable will return the count of # nodes in the doubly linked list
    private class ListNode {
        // Three things it needs to contain: data, the next Node and the previous Node
        private int data;
        private ListNode next;
        private ListNode previous;

        // Create a constructor for the ListNode
        public ListNode(int data) {
            this.data = data;
        }
    }
        // Create the constructor for the doubly_linked_lists
        public doubly_linked_lists(){
            this.head = null;
            this.tail = null;
            this.length = 0;
        }

        // Two methods used for this: isEmpty() and length()
        public boolean isEmpty(){
            return length == 0; // head == null
        }

        public int length() {
            return length;
        }


    }













































}