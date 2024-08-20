/*56. Write a program to implement a node structure for singly linked list. Read the 
data in a node, print the node. */

/*57. Write a menu driven program to implement following operations on the singly 
linked list. 
 Insert a node at the front of the linked list.
 Display all nodes.
 Delete a first node of the linked list.
 Insert a node at the end of the linked list.
 Delete a last node of the linked list.
 Delete a node from specified position.*/

class LinkedListDemo {
    public Node first = null;
    
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    void InsertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        } else {
            newNode.link = first;
            first = newNode;
        }
    }

    void InsertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newNode;
        }
    }

    void InsertAtOrder(int data) {
        Node newNode = new Node(data);
        if (first == null || newNode.info <= first.info) {
            newNode.link = first;
            first = newNode;
            return;
        } else {
            Node save = first;
            while (save.link != null && newNode.info >= save.link.info) {
                save = save.link;
            }
            newNode.link = save.link;
            save.link = newNode;
        }

    }

    private void DeleteNode(int data) {
        Node save=null;
        Node pred=null;
        if (first == null) {
            System.out.println("linked list is empty");
        } else {
            if (data == first.info) {
                first = first.link;
                return;
            } 
            else {
                save = first;
                
                while (save.link != null && save.info != data) {
                    pred = save;
                    save = save.link;
                }
            }
            if (save.info !=data) {
                System.out.println("node not found");
            } else {
                pred.link = save.link;
            }
        }
    }

    void Display() {
        Node temp = first;

        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        LinkedListDemo n1 = new LinkedListDemo();
        n1.InsertAtFirst(1);
        n1.InsertAtFirst(2);
        n1.InsertAtFirst(6);
        n1.InsertAtLast(2);
        // n1.InsertAtOrder(4);
        // n1.InsertAtOrder(8);
        // n1.InsertAtOrder(5);
        // n1.InsertAtOrder(2);
        n1.DeleteNode(6);
        n1.Display();

    }
}