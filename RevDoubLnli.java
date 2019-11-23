
package revdoublnli;
import java.util.*;
class doubli
{
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int da)
        {
            data=da;
        }
    }
    Node head;
    Node last;
    doubli insert(doubli li,int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            temp.next.prev=temp;
            last=newnode;
        }
        return li;
    }
    void displayrev(doubli li)
    {
        Node temp=last;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.prev;
            
        
        }
        
        
    }
}
public class RevDoubLnli {
    public static void main(String[] args) {
        doubli li=new doubli();
        li.insert(li,0);
        li.insert(li,1);
        li.insert(li,2);
        li.insert(li,3);
        li.displayrev(li);
    }
    
}
