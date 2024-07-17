/*39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
program to solve the above problem.*/

import java.util.Scanner;

public class StackDemo {
    int top = -1;
    int n;
    char[] arr;

    StackDemo(int n) {
        this.n = n;
        arr = new char[n];
    }

    public void push(char x) {
        if (top >= (n - 1)) {
            System.out.println("stack overflow");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public void pop() {
        if (top <= 0) {
            System.out.println("stack underflow");
        } else {
            top -= 1;
        }
    }
}

public class Recognize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackDemo st = new StackDemo(10);
       // String str = sc.nextLine();
      //  int n = str.length();
        String str="abcba";
        int i=0;
        int[] stack;
        //i=index
        char x=0;
        char next =str.charAt(i);
       
        while ( next!= 'c') {
           if(i==str.length()){
            System.out.println("invalid string");
           }
           else{
            st.push(next);
            i++;
            next=str.charAt(i);
           }
        }

        int top;
        while (stack[top]!='c') {
            i++;
            next=str.charAt(i);
            
            if (next!=x) {
                i++;
                next=str.charAt(i);
                st.pop();
            }
            else{
                System.out.println("invalid string");
            }
        }



    }

}