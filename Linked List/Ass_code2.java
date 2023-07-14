package LinkedList.Assignments;

class Node{
        int data;
        Node next;
        
        };
public class Ass_code2 {    
    Node head;
    Ass_code2(){
        
        head=null;

    }
    //insert a new node at the front of the list
    public void push_back(int newData)
    {
        Node newNode=new Node();
        newNode.data=newData;
        newNode.next=null;
        if(head == null)
        {
            head = newNode;
        }
        else{
            Node temp= new Node();
            temp=head;
            while(temp.next != null)
            {
                temp=temp.next;
                
            }
            temp.next=newNode;
        }

    }
    public void push_at( int newData, int position)
    {
        Node newNode=new Node();
        newNode.data=newData;
        newNode.next=null;

        if(position < 1)
        {
            System.out.println("position should be >= 1");
        }
        else if(position ==1){
            newNode.next=head;
            head=newNode;

        }
        else
        {
            Node temp=new Node();
            temp=head;
            for(int i=1;i<position-1;i++)
            {
                if(temp != null)
                {
                    temp = temp.next;
                }
            }
            if(temp != null)
            {
                newNode.next=temp.next;
                temp.next=newNode;
            }
            else{
                System.out.println("the previous node is null");
            }
        }
    }
    public void print()
    {
        Node temp = new Node();
    temp = this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  }

    
    public static void main(String[] args) {
        Ass_code2 llist=new Ass_code2();
        llist.push_back(3);
        llist.push_back(6);
        llist.push_back(5);
        llist.push_back(7);
        llist.push_back(10);

        llist.print();
        //insert an element at position 2
        llist.push_at(8, 2);
        llist.print();

    }
}
