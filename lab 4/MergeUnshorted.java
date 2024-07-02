
import java.util.*;


public class MergeUnshorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1 ");
        int n = sc.nextInt();
        System.out.println("Enter array 2 ");
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] newArray = new int[n+m];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
            newArray[i] = arr1[i];
        }

        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
            newArray[i+n] = arr2[i];
        }

        Arrays.sort(newArray);

        for(int i=0; i<n+m; i++){
            System.out.print(newArray[i]+" ");
        }


    }
}
