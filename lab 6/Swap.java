//33. Write a program to swap two numbers using user-defines method

import java.util.*;
public class Swap {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Enter first num ");
    a=sc.nextInt();
    int b;
    System.out.println("Enter second num ");
    b=sc.nextInt();
    swapnum s=new swapnum();
    s.swapnum(a,b);
    sc.close();
}
}
class swapnum{
    public void swapnum (int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a"+a);
        System.out.println("b"+b);
    }
}
