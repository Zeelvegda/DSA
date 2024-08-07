/*52. Write a menu driven program to implement following operations on the 
Doubled Ended Queue using an Array
- Insert at front end, Insert at rear end
- Delete from front end, Delete from rear end
- Display all elements of the queue
 */
import java.util.Scanner;

public class DoubledQue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        Doublyqueue dq=new Doublyqueue();
        while(true){
            System.out.println("enter 1-insert at rear,2-insert at front,3-delete at rear,4-delete at front,5-exit");
            int a=sc.nextInt();
            switch(a){
                case 1:System.out.println("enter element to insert at rear");
                       dq.dq_insert_rear(sc.nextInt());
                       dq.display();
                       break;
                case 2:System.out.println("enter element to insert at front");
                       dq.dq_insert_front(sc.nextInt());
                       dq.display();
                       break;
                case 3:dq.dq_delete_rear();
                       dq.display();
                       break;
                case 4:dq.dq_delete_front();
                        dq.display();
                       break;
                case 5:return;       
                       

            }
        }


    }
}
class Doublyqueue{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q[];
     int F;
     int R;
     public Doublyqueue(){
        F=-1;
        R=-1;
        q=new int[n];
     }
     public void dq_insert_rear(int data){
           if(R>=n-1){
            System.out.println("overflow");
           }else{
             R++;
             q[R]=data;
             if(F==-1){
                F=0;
             }
           }
     }
     public void dq_insert_front(int data){
        if(F==0){
            System.out.println("overflow");
            return;
        }else{
            if(F==-1){
                F=0;
                R=0;
            }else{
                F--;
            }
            q[F]=data;
        }
     }
     int y=0;
     public void dq_delete_front(){
        if(F==-1){
            System.out.println("underflow");
        }else{
            y=q[F];
            if(F==R){
                F=0;
                R=0;
            }
            F++;
        }
     }
     public void dq_delete_rear(){

        if(R==0){
            System.out.println("underflow");
        }else{
            y=q[R];
        }
           if(R==F){
                F=0;
                R=0;
           }else{
            R--;
           }
     }
     public void display(){
        for(int i=F;i<=R;i++){
            System.out.print(q[i]+" ");
        }
        System.out.println("");
     }
} 