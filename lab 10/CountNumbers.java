//58. Write a program to count the number of nodes in a singly circularly linked list

import java.util.* ;

public class CountNumbers {

    class Node{
        int info;
        Node link;
        public Node(int info){
            this.info = info;
            this.link = null;
        }
    }
    public Node first = null;
    void insertAtFirst(int info){
        Node newNode = new Node(info);

        if(first == null){
            first = newNode;
            return;
        }
        Node temp = first;
        first = newNode;
        first.link = temp;
    }
    void countNode(){      
        int count=0;
        if(first == null){
            count = 0;
        }
        else{
            Node current = first;
            while(current.link!=null){
                count++;
            }
        }
        System.out.println("No of nodes:" + count);
    }
    public static void main(String[] args) {
        CountNumbers d1 = new CountNumbers();
        d1.insertAtFirst(5);
        d1.countNode();
    }
}
