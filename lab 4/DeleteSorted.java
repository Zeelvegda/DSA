/*Write a program to delete a number from an array that is already sorted in an 
ascending order*/
import java.util.Scanner;
public class DeleteSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int size=sc.nextInt();
        int[] array=new int[size];
        int[] ans=new int[size+1];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
         }
      
         System.out.println("Enter the element");
         int element=sc.nextInt();
         int i=0;
         while(array[i]<element){
            ans[i]=array[i];
            i++;
         }
         while(i<size-1){
            ans[i]=array[i-1];

         }
         for(i=0;i<size-1;i++){
            System.out.println(ans[i]);
         }




    }
}
