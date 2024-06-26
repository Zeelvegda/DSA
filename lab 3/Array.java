import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element ");
            array[i]=sc.nextInt();
        }
        
        System.out.println("Enter the element ");
        for(int i=0;i<size;i++){
        System.out.print(array[i]);
        }
    }
}