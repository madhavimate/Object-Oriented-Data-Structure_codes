class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    
    void delete(int key) {
        Node temp = head;
        Node prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If the key was not present in the list
        if (temp == null) {
            return;
        }

        // Unlink the node from the linked list
        prev.next = temp.next;
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Sorting the linked list using Bubble Sort
    void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head, index = null;
        int temp;

        while (current != null) {
            index = current.next;

            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(2);
        list.insert(8);
        list.insert(1);
        list.insert(6);

        System.out.println("Linked List after Insertion:");
        list.traverse(); 

        list.delete(8);

        System.out.println("Linked List after Deletion of 8:");
        list.traverse(); 

        list.sort();

        System.out.println("Linked List after Sorting:");
        list.traverse();

        int searchKey = 5;
        if (list.search(searchKey)) {
            System.out.println("Element " + searchKey + " found in the Linked List.");
        } else {
            System.out.println("Element " + searchKey + " not found in the Linked List.");
        }
       System.out.println("-------------------------------");
       System.out.println("This code is developed by MADHU");
    }
}
