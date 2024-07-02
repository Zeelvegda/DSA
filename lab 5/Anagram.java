// Design anagram game using array.  
// 1.Allow a user to enter N words and store it in an array.  
// 2.Generate a random number between 0 to N-1.  
// 3.Based on the random number generated display the word stored at that index of an array and allow user to enter its anagram.  
// 4.Check whether the word entered by the user is an anagram of displayed number or not and display an appropriate message.  
// 5.Given a word A and word B. B is said to be an anagram of A if and only if the characters present in B is same as characters present in A, 
// irrespective of their sequence. For ex: “LISTEN” == “SILENT” 

import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of words : ");
        n = sc.nextInt();
        String [] a = new String[n];

        int m;
        System.out.print("Enter words : ");
        for(int i=0; i<n; i++){
           a[i] = sc.next();
        }

        System.out.print("Enter a number between 0 to " +(n-1)+ " : ");
        m = sc.nextInt();

        //Anagram   S1=listen, S2=silent
        //after sorting both arrays,
        //S1=eilnst == S2=eilnst

        String temp;
        System.out.print("Enter your Anagram : ");
        temp = sc.next();
        
        char c1[] = temp.toCharArray();
        char c2[] = a[m].toCharArray();

        if(c1.length != c2.length){
            System.out.print("not");
        }
        else{
            Arrays.sort(c1);
            Arrays.sort(c2);
                for(int i=0; i<c1.length; i++){
                    if(c1[i] != c2[i]){
                        System.out.print("not");
                    }
                }
                System.out.print("yes");
            }
       }
}









/*import java.util.Scanner;
import java.util.Arrays;

public class Anargame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        int m =(int) (Math.random()*n);
        // System.out.println(m);

        System.out.println(arr[m]);

        System.out.println("enter anagram: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char[] c=arr[m].toCharArray();

        Arrays.sort(ch);
        Arrays.sort(c);
        int flag = 0;
        for(int i=0; i<c.length; i++){
            if(c[i]==ch[i]){
                flag++;
                continue;
            }
            else{
                System.out.println("not anagram");
                break;
            }
        }
        if(flag==c.length){
            System.out.println("Anagram");
        }
        
        
    }
}
*/