// Linked Lists

/*

* * A linked list is a very simple data structure. It is essentially a sequence of elements where each elements links to the next element.
* A linked list can contain any type of data ( strings, characters, numbers ), and the elements can be sorted or unsorted.
* They can contain duplicate elements or all unique elements
* One of the things that distinguish a linked list from an array, which shares many of the same properties is that in the array, the elements are indexed.
    * In contrast, in a linked list one would have to start from the head and work their way through until they get to the targeted
        * The advantage of a linked list is that insertions and deletions can be very quick and can be done in constant time
        * The disadvantages of linked list is that it is very slow to get to the kth element - This is a prime example of: O(n) - Linear Time

* Doubly Linked List is like linked list but in addition to each element having it linked to the next element, each element also links the previous element
* For certain operations that could be useful - i.e. **

* */


// This is an algorithmic approach for a Singly-Linked List Data Structure
public class linked_lists {
public class Node {
    // The object will have a "next-value"
    Node next;
    int data;
    // Add constructor
    public Node(final int data) {
        this.data = data;
    }
}

// Define a class "LinkedList" that will wrap the head
public class LinkedList {
    Node head;

    // Append Method
public void append(final int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        // Have a pointer at the current node at the head of the linked list and then it will "walk" through the linked lists until the end.
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        // When reaching the end of the linked list create a new Node
        current.next = new Node(data);
    }

    // Prepend Method
    public void prepend(final int data) {
        final Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // Delete with Value Method
    public void deleteWithValue(final int data) {
        // This method will walk through the linked list and stop one before the element we want to delete. It will update the element's next pointer. So it will re-route/"walk around" the pointer to be the pointer after the targeted/deleted-element
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
        // If current dot next dot data does not equal to the data we're trying to lead
                if (current.next.data == data) {
                    // If the next value you want to delete, don't go to the element, but instead just walk around it.  Set my pointer to be my next pointer's next pointer
                    current.next = current.next.next;
                    return;

                }
                current = current.next;
            }
        }
    }
}