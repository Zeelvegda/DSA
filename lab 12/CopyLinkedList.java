//63. Write a program to copy a linked list.
public class CopyLinkedList {
    public Node first = null;
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }
    void copy(CopyLinkedList list1,CopyLinkedList list2){  
        Node save1=list1.first;
        Node save2=null; 
        if(save1.link==null){
                System.out.println("stack is empty");
                return;
        }
         else{
            
            while (save1!=null) {
                save2=new Node(save1.info);
                save1=save1.link;
                System.out.println(save2.info);

            }
           
         }
        }

       void InsertAtFirst(int data) {
            Node newNode = new Node(data);
            if (first == null) {
                first = newNode;
                return;
            } 
            else {
                newNode.link = first;
                first = newNode;
            }
        
    }
    void Display() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        CopyLinkedList c = new CopyLinkedList();
        CopyLinkedList list1=new CopyLinkedList();
        CopyLinkedList list2=new CopyLinkedList();
        list2.first=list1.first;
        list1.InsertAtFirst(1);
        list1.InsertAtFirst(2);
        list1.InsertAtFirst(6);
        list1.Display();
        c.copy(list1,list2);
        list2.Display();

}
}