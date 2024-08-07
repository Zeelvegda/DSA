/*50. Write a menu driven program to implement following operations on the Queue 
using an Array
 ENQUEUE
 DEQUEUE
 DISPLAY*/
 import java.util.*;

public class QueueImplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number index : ");
        MyQueue q = new MyQueue(5);
        q.fn_enqueue(3);
        q.fn_enqueue(5);
        q.fn_enqueue(4);
        q.fn_enqueue(8);
        q.fn_enqueue(9);
       

        q.fn_dequeue(3);
        q.fn_dequeue(5);
         q.fn_dequeue(4);
         q.fn_dequeue(8);
         q.fn_dequeue(9);
       
        q.fn_display();
        
    }
}

class MyQueue {
    Scanner s = new Scanner(System.in);
    int n;
    int f = -1, r = -1;
    int arr[];

    MyQueue(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void fn_enqueue(int y) {
        if (r >= n - 1) {
            System.out.println("queue overflow");
            return;
        } else {
            r++;
        }
        arr[r] = y;
        if (r != 0) {
            f = -1;
        }

    }

    public void fn_dequeue(int y) {
        if (f == -1) {
            System.out.println("Queue underflow!!!");
        } 
        
            else if (f == r) {
                f = -1;
                r = -1;
                System.out.println("Queue is Empty!!!");
            } else {
                arr[f] = 0;
                //System.out.println("A number is dequeued!!!");
                f++;
            }
        }
    

    public void fn_display() {
        for (int temp : arr) {
            System.out.print(temp + " ");
        }
    }
}
