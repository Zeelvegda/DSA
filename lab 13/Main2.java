//74. WAP to split a circular linked list into two halves
class Node {
  int data;
  Node next;

  Node(int data) {
      this.data = data;
      this.next = null;
  }
}

class CircularLinkedList {
  Node head;

  void splitCircularLinkedList(CircularLinkedList list1, CircularLinkedList list2) {
      if (head == null) {
          return;
      }

      Node slow = head;
      Node fast = head;

      while (fast.next != head && fast.next.next != head) {
          slow = slow.next;
          fast = fast.next.next;
      }

      if (fast.next.next == head) {
          fast = fast.next;
      }

      list2.head = slow.next;

      slow.next = head;

      fast.next = list2.head;

      list1.head = head;
  }

  void printList(CircularLinkedList list) {
      if (list.head == null) {
          return;
      }

      Node current = list.head;
      do {
          System.out.print(current.data + " ");
          current = current.next;
      } while (current != list.head);

      System.out.println();
  }
}

public class Main2 {
  public static void main(String[] args) {
      CircularLinkedList list = new CircularLinkedList();
      list.head = new Node(1);
      list.head.next = new Node(2);
      list.head.next.next = new Node(3);
      list.head.next.next.next = new Node(4);
      list.head.next.next.next.next = new Node(5);
      list.head.next.next.next.next.next = list.head;

      CircularLinkedList list1 = new CircularLinkedList();
      CircularLinkedList list2 = new CircularLinkedList();

      list.splitCircularLinkedList(list1, list2);

      System.out.println("First half:");
      list1.printList(list1);

      System.out.println("Second half:");
      list2.printList(list2);
  }
}