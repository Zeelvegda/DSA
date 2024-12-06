//73. WAP to delete alternate nodes of a doubly linked list
class Node {
  int data;
  Node prev;
  Node next;

  Node(int data) {
      this.data = data;
      this.prev = null;
      this.next = null;
  }
}

class DoublyLinkedList {
  Node head;

  void deleteAlternateNodes() {
      if (head == null || head.next == null) {
          return;
      }

      Node current = head;
      while (current != null && current.next != null) {
          Node nextNode = current.next;
          current.next = nextNode.next;

          if (current.next != null) {
              current.next.prev = current;
          }

          current = current.next;
      }
  }

  void printList() {
      Node current = head;
      while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
      }
      System.out.println();
  }
}

public class Main {
  public static void main(String[] args) {
      DoublyLinkedList dll = new DoublyLinkedList();
      dll.head = new Node(1);
      dll.head.next = new Node(2);
      dll.head.next.prev = dll.head;
      dll.head.next.next = new Node(3);
      dll.head.next.next.prev = dll.head.next;
      dll.head.next.next.next = new Node(4);
      dll.head.next.next.next.prev = dll.head.next.next;
      dll.head.next.next.next.next = new Node(5);
      dll.head.next.next.next.next.prev = dll.head.next.next.next;

      System.out.println("Original Doubly Linked List:");
      dll.printList();

      dll.deleteAlternateNodes();

      System.out.println("Doubly Linked List after deleting alternate nodes:");
      dll.printList();
  }
}