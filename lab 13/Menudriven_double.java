/*72. Write a menu driven program to implement following operations on the doubly 
linked list.
- Insert a node at the front of the linked list.
- Delete a node from specified position.
- Insert a node at the end of the linked list. (Home Work)
- Display all nodes. (Home Work) */
import java.util.*;
class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    Node head;

    void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        Node nextNode = temp.next.next;
        temp.next = nextNode;
        if (nextNode != null) {
            nextNode.prev = temp;
        }
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Menudriven_double {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoices:");
            System.out.println("1. Insert at front");
            System.out.println("2. Delete at position");
            System.out.println("3. Insert at end");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int data1 = sc.nextInt();
                    dll.insertAtFront(data1);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = sc.nextInt();
                    dll.deleteNodeAtPosition(position);
                    break;
                case 3:
                    System.out.print("Enter element to insert: ");
                    int data2 = sc.nextInt();
                    dll.insertAtEnd(data2);
                    break;
                case 4:
                    dll.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}