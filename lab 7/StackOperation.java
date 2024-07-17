/*38. Write a menu driven program to implement following operations on the Stack 
using an Array
PUSH, POP, DISPLAY,PEEP, CHANGE*/

import java.util.Scanner;

class StackDemo {
    int top;
    int[] stack;
    int size;

    StackDemo(int size) {
        stack = new int[size];
       // this.size = size;
        top=-1;
    }

    void push(int n) {
        if (top > (size - 1)) {
            System.out.println("Stack overflow");
        } else {
            top++;
           stack[top] = n;
        }
    }


    int pop(int n) {
        if (top == -1) {
            System.out.println("stack underflow");
            
        } else {
            top--;
            return( stack[top]);
        }
      return n ;
       
    }

    int peep(int i) {
        if (top - i + 1 <= -1) {
            System.out.println("stack underflow");
        } else {
            return(stack[top - i + 1]);
        }
        return i;
    }

    void change(int x, int i) {
        if ((top - i + 1) <= -1) {
            System.out.println("stack underflow");
        } else {
            stack[top - i + 1] = x;
            //(stack[top - i + 1]);
        }
    }


    void display() {
        for (int i = 0; i <= stack.length; i++) {
            System.out.println("stack of i");
        }
        System.out.println();
    }
}


public class StackOperation {
    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        StackDemo obj = new StackDemo(10);

        obj.push(2);
       // obj.pop();
        obj.peep(2);
        obj.change(4, 4);
        obj.display();

    }
}
