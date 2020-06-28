// Linked Lists

/*

* * A linked list is a very simple data structure. It is essentially a sequence of elements where each elements links to the next element.
* A linked list can contain any type of data ( strings, characteres, numbers ), and the elements can be sorted or unsorted.
* They can contain duplicate elements or all unique elements
* One of the things that distinguish a linked list from an array, which shares many of the same properties is that in the array, the elements are indexed.
    * In contrast, in a linked list one would have to start from the head and work their way through until they get to the targeted
        * The advantage of a linked list is that insertions and deletions can be very quick and can be done in constant time
        * The disadvtanges of linked list is that it is very slow to get to the kth element - This is a prime example of: O(n) - Linear Time

* Doubly Linked List is like linked list but in addition to each element having it linked to the next element, each element also links the previous element
* For certain operations that could be useful - i.e. **

* */
public class linked_lists {
public class Node {
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
        // Have a pointer at the current node at head of the linked list and then it will "walk" through the linked lists until the end.
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(final int data) {
        final Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(final int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
//            If current dot next dot data does not equal to the data we're trying to lead
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
//                If the next value you want to delete, don't go to the element, but instead just walk around it.  Set my pointer to be my next pointer's next pointer.
            }
            current = current.next;
    }
}

}

}