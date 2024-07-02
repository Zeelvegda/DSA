// Write a program to delete duplicate numbers from an array.
import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array:");
        int a = sc.nextInt();

        int a1[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter a[" + i + "]:");
            a1[i] = sc.nextInt();

        }
        System.out.println("before");
        for (int i = 0; i < a; i++) {
            System.out.println("a[" + i + "]:" + a1[i]);
        }
        int k = 0;
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (a1[i] == a1[j]) {
                    for (k = j; k < a - 1; k++) {
                        a1[k] = a1[k + 1];
                    }
                    k--;
                    a--;
                }
            }
        }
        System.out.println("after");
        for (int i = 0; i < a; i++) {
            System.out.println("a[" + i + "]:" + a1[i]);
        }
    }
}