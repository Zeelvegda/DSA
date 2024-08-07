/* 51. Write a menu driven program to implement following operations on a circular 
queue using an Array
- Insert
- Delete
- Display all elements of the queue
 */

import java.util.Scanner;

public class CircularQue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        Circularqueue cque = new Circularqueue();
        while (true) {
            System.out.println("enter 1 to insert,2 to delete and 3 to exit");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("enetr element to insert");
                    cque.cqinsert(sc.nextInt());
                    cque.display();
                    break;
                case 2:
                    cque.cqdelete();
                    cque.display();
                    break;
                case 3:
                    return;
            }
        }

    }

}

class Circularqueue {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int F;
    int R;
    int q[];

    public Circularqueue() {
        F = -1;
        R = -1;
        q = new int[n];
    }

    public void cqinsert(int data) {
        if (R == n - 1) {
            R = 0;
        } else {
            R = R + 1;
        }
        if (R == F) {
            System.out.println("overflow");
            return;
        }
        q[R] = data;
        if (F == -1) {
            F = 0;
        }

    }

    int y = 0;

    public void cqdelete() {
        if (F == -1) {
            System.out.println("underflow");
        } else {
            y = q[F];
            if (F == R) {
                F = 0;
                R = 0;
            }
            if (F == n) {
                F = 0;
            } else {
                F = F + 1;
            }
        }
    }

    public void display() {
        if (F <= R) {
            for (int i = F; i <= R; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println(" ");
        } else {
            for (int i = F; i < n; i++) {
                System.out.print(q[i] + " ");
            }
            for (int i = 0; i < F; i++) {
                System.out.print(q[i] + " ");
            }
        }
        System.out.println(" ");

    }
}
