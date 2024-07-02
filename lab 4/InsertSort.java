/*Write a program to insert a number in an array that is already sorted in an 
ascending order.*/
import java.util.*;

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n an array : ");
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] newArray = new int[n+1];
       
        int j=0;
        while(j<n && arr[j]<num){
            newArray[j] = arr[j];
            j++;
        }

        newArray[num] = num;

        for(int i = num+1; i<n+1; i++){
            newArray[i] = arr[i-1];
        }

        for(int i=0; i<n+1; i++){
            System.out.print(newArray[i]+" ");
        }
    }

}








