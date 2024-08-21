//61. Write a program to implement queue using singly linked list.
 import java.util.Scanner;

public class ImplementQue {

    class Node{
        int info;
        Node link;

    public Node(int data) {
        this.info = data;
        this.link = null;
    }
} 
    
    public Node top = null;
    
    public void push(int data){
        
        Node newNode = new Node(data);
      
        if(top == null){
            top = newNode;
            return;
        }
        
        Node temp = top;
        
        top = newNode;
        
        top.link = temp;

    }
    public int pop() {
        if(top == null){
            System.out.println("LinkedList is empty");
            return-1;
        }

        int popped = top.info;
        top = top.link;
        return popped;
    }
    
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node save = top;
        while (save != null) {
            System.out.print(save.info + " ");
            save = save.link;
        }
        System.out.println("");
    }

    
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementQue s = new ImplementQue();
        System.out.println("Enter 1 if you want to push element in the stack,");
        System.out.println("Enter 2 if you want to delete element from the stack,");
        System.out.println("Enter 3 if you want to display the stack");

        boolean isTheEnd = false;
        while (true) {
            System.out.println("Please enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be pushed:");
                    int x = sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                    int popped = s.pop();
                    if (popped != -1) {
                       System.out.println("Popped element is: " + popped);
                    } 
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.out.println("Please Enter valid choice");
            }
            if (isTheEnd) {
                break;
            }
        }
        System.out.println("Program Terminates");
    }
}
 