// Write a program to insert a number at a given location in an array
import java.util.Scanner;
public class InsertNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int size=sc.nextInt();
        int[] array=new int[size];
        int[] ans=new int[size+1];
        for(int i=0;i<size;i++){
           array[i]=sc.nextInt();
        }
        System.out.println("Enter the index ");
        int index=sc.nextInt();
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        for(int i=0;i<index;i++){
            ans[i]=array[i];
 }
    ans[index]=number;
     for(int i=index+1;i<size+1;i++){
        ans[i]=array[i-1];
     }
     for(int i=0;i<size+1;i++){
       System.out.println(ans[i]);
     }
}
}