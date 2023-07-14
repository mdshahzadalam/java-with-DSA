package LinkedList.Assignments;
public class Ass_code1 {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node head;
    //insert a new node at the front of the list
    public void push(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    //check whether the value c is present in linked list
    public boolean search(Node head , int x)
    {
        Node current =head;
        while(current != null)
        {
            if(current.data==x)
            {
                return true;
                
            }
            current =current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Ass_code1 llist=new Ass_code1();
        llist.push(20);
        llist.push(22);
        llist.push(25);
        llist.push(10);
        llist.push(30);
        llist.push(23);

        if(llist.search(llist.head, 22))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
