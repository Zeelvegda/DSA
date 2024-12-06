/*71. Write a menu driven program to implement following operations on the 
circular linked list.
- Insert a node at the front of the linked list.
- Delete a node from specified position.
- Insert a node at the end of the linked list.
- Display all nodes.
*/
public class Menudriven_Circular{
  class node{
    int data;
    node next;

    public node(int data){
      this.data=data;
      this.next=null;
     }
    }
  node head;
  node last;

  public void insertAtFirst(int data){
    node newNode = new node(data);
      if(head==null){
        newNode.next=newNode;
        head=newNode;
        last=newNode;
      }
    }
    public void insertAtEnd(int data){
      node newNode = new node(data);
      if(head==null){
        newNode.next=newNode;
        head=newNode;
        last = newNode;
      }
      else{
        newNode.next=head;
        last.next=newNode;
        last=newNode;
      }
    }
    public void insertAtOrder(int data1){
      node newNode = new node(data1);
      if(head==null){
        newNode.next=newNode;
        head=newNode;
        last=newNode;
    }
    else{
      node temp = head;
      while(temp.next!=null && temp.data<data1){
        temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }
  }
  public void display(){
    node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.println(temp.data);
 }
 public static void main(String[]args){
  Menudriven_Circular c1=new Menudriven_Circular();
  c1.insertAtFirst(1);
  c1.insertAtOrder(5);
  c1.display();
 }
}
