//38:method 2 
import java.util.*;

public class Stack {
  int top = -1;
  int n;
  int[] arr;

  Stack(int n) {
    this.n = n;
    arr = new int[n];
  }

  public void push(int x) {
    if (top >= (n - 1)) {
      System.out.println("stack overflow");
    } else {
      top += 1;
      arr[top] = x;
    }
  }

  public int pop() {
    int temp;
    if (top <= 0) {
      System.out.println("stack underflow");
      return 0;
    } else {
      temp = arr[top];
      top -= 1;
    }
    return temp;
  }

  public void peep(int i) {
    if ((top - i + 1) <= 0) {
      System.out.println("stack underflow");
    } else {
      System.out.println(arr[top - i + 1]);
    }
  }

  public void change(int x, int i) {
    if ((top - i + 1) <= 0) {
      System.out.println("stack underflow");
    } else {
      arr[top - i + 1] = x;
      System.out.println(arr[top - i + 1]);
    }
  }
  public void display(){
    for(int i=0; i<=top; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int query = 1;
    Stack s = new Stack(n);

    while (query != 0) {

      System.out.println("Menu:");
      System.out.println("Enter 1 for push");
      System.out.println("Enter 2 for pop");
      System.out.println("Enter 3 for peep");
      System.out.println("Enter 4 for change");
      System.out.println("Enter 5 to display");
      int q = sc.nextInt();

      if (q == 1) {
        int x=sc.nextInt();
        s.push(x);
      } else if (q == 2) {
        s.pop();
      } else if (q == 3) {
        int i = sc.nextInt();
        s.peep(i);
      } else if(q==4){
        System.out.println("enter element value:");
        int x = sc.nextInt();
        System.out.println("enter ith element value:");
        int i = sc.nextInt();
        s.change(x, i);
      }
      else{
        s.display();
      }

      System.out.println("do you want to perform more operations : ");
      query = sc.nextInt();
    }
  }

}


/*39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
program to solve the above problem.*/



// import java.util.Scanner;

// public class Recognize{
//     int top = -1;
//     int n;
  
//     char[] arr;

//     StringGrammar2(int n) {
//         this.n = n;
//         arr = new char[n];
//     }

//     public void push(char x) {
//         if (top >= (n - 1)) {
//           System.out.println("stack overflow");
//         } else {
//           top += 1;
//           arr[top] = x;
//         }
//     }

//     public void pop() {
//         if (top <= 0) {
//           System.out.println("stack underflow");   
//         } else {
//           top -= 1;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
        
//         int n = str.length();
//         StringGrammar2 s = new StringGrammar2(n);

//         int i = 0,count=0;

//         while (str.charAt(i) != 'b') {
//             s.push(str.charAt(i));
//             i++;
//         }
      
//         boolean flag = true;
      
//         for (int j = i; j < n; j++) {
//             if (str.charAt(j)=='b') {
//                 count++;
//                 s.pop();
//             }
//             else{
//                 flag=false;
//                 System.out.println("invalid string");
//             }
//         }
       
//         if (flag==true && i==count) {
//             System.out.println("Valid string");
//         }
//         else{
//             System.out.println("Invalid String");
//         }
//     }
// }






}
