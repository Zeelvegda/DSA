//59. WAP to check whether 2 singly linked lists are same or not.

import java.util.*;

public class LinkedSameOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList abc = new LinkedList();
        boolean count = true;
        while (count) {
            System.out.println("want to insert?");
            String a = sc.next();
            if (a.equals("yes")) {

                System.out.println("enter a number to insert in list 1");
                list1.append(sc.nextInt());

                System.out.println("enter a number to insert in list 2");
                list2.append(sc.nextInt());

            } else {
                count = false;
            }
        }
        list1.display();
        list2.display();
        abc.isSameList(list1, list2);

    }
}

class LinkedList {
    public class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    Node first = null;

    public void append(int data) {
        Node newnode = new Node(data);

        if (first == null) {
            first = newnode;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newnode;
        }
    }

    public void isSameList(LinkedList list1, LinkedList list2) {
        Node save1 = list1.first;
        Node save2 = list2.first;

        while (save1 != null && save2 != null) {
            if (save1.info != save2.info) {
                System.out.println("falsee");
                return;
            }
            save1 = save1.link;
            save2 = save2.link;
        }

        System.out.println("true");
    }

    public void display() {
        if (first == null) {
            System.out.println("null");
        } else {
            Node save = first;
            while (save != null) {
                System.out.print(save.info + "-->");
                save = save.link;

            }
            System.out.println("null");
        }
    }
}


/* 
import java.util.*;
public class LinkedSameOrNot {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     LinkedList list1=new LinkedList();
     LinkedList list2=new LinkedList();
     LinkedList abc=new LinkedList();
     boolean count=true;
    while(count){
        System.out.println("want to insert?");
        String a=sc.next();
        if(a.equals("yes")){
          
                System.out.println("enter a number to insert in list 1");
                list1.append(sc.nextInt());
             
           
                System.out.println("enter a number to insert in list 2");
                list2.append(sc.nextInt());
            
        }else{
            count=false;
        }
    }
    list1.display();
    list2.display();
     abc.isSameList(list1,list2);

    }
}
class LinkedList{
    public class Node{
        int info;
        Node link;
   
      public Node(int data){
        this.info=data;
        this.link=null;
      }
   }
  Node first=null;
   public void append(int data){
        Node newnode=new Node(data);

        if(first==null){
            first=newnode;
        }else{
            Node save=first;
            while(save.link!=null){
                  save=save.link;
            }
            save.link=newnode;
        }
   }
   public void isSameList(LinkedList list1,LinkedList list2){
        Node save1=list1.first;
        Node save2=list2.first;

        while(save1!=null && save2!=null){
            if(save1.info!=save2.info){
                 System.out.println("falsee");
                 return;
            }
            save1=save1.link;
            save2=save2.link;
        }

        System.out.println("true");  
     }

     public void display(){
        if(first==null){
            System.out.println("null");
        }else{
            Node save=first;
            while(save!=null){
                System.out.print(save.info+"-->");
                save=save.link;
                
            }
            System.out.println("null");
        }
     }
}
*/

