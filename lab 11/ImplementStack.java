//60. Write a program to implement stack using singly linked list.

 import java.util.Scanner;
public  class ImplementStack {
    class Node{
        int info;
        Node link;

    public Node(int data) {
        this.info = data;
        this.link = null;
    }
} 
public Node front = null;

public void push(int data){
    
    Node newNode = new Node(data);
   
    if(front == null){
        front = newNode;
        return;
    }
    
    Node save = front;
    
    front = newNode;
   
    front.link = save;

}

public int poll (){
    if(front==null){
        System.out.println("Queue is empty");
        return -1;
    }
   
    if(front.link == null){
        int f = front.info;
        front = null;
        return f;
    }
    Node save = front;
    
    while(save.link.link != null){
        save = save.link;   
    }
    int f = save.link.info;
    save.link = null;
    return f; 
}

public void display() {
    if (front == null) {
        System.out.println("Stack is empty");
        return;
    }
    Node save = front;
    while (save != null) {
        System.out.print("->"+save.info);
        save = save.link;
    }
    System.out.println("");
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementStack queue = new ImplementStack();

        System.out.println("Enter 1 if you want to push element in the queue,");
        System.out.println("Enter 2 if you want to delete element from the queue,");
        System.out.println("Enter 3 if you want to display the queue");
        System.out.println("Enter 4 if you don't have any further changes");

        boolean isTheEnd = false;
        while (true) {
            System.out.println("Please enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be pushed:");
                    int x = sc.nextInt();
                    queue.push(x);
                    break;
                case 2:
                    int poll = queue.poll();
                    if (poll != -1) {
                       System.out.println("Popped element is: " + poll);
                    } 
                    break;
                case 3:
                     queue.display();
                     break;
                case 4:
                    isTheEnd = true;
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
 