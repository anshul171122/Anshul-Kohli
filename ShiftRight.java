package shiftright;
import java.util.*;
class linkedlist
{
    class Node
    {
        int data;
        Node next;
        Node(int da)
        {
            data=da;
        }
    }
    Node head;
    linkedlist insert(linkedlist li,int data)
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
        }
        return li;
    }
    void removing_dup(linkedlist li,int n,int k)
    {
        Node temp=head;
        for(int i=0;i<n-1;i++)
        {
            temp=temp.next;
        }
        temp.next=head;
        System.out.println(temp.data);
        temp=head;
        System.out.println(temp.data);
        for(int i=0;i<k-1;i++)
        {
            temp=temp.next;
        }
        head=temp.next;
        System.out.println(temp.data);
        temp=head;
        for(int i=0;i<n-1;i++)
        {
            temp=temp.next;
        }
        System.out.println(temp.data);
        temp.next=null;
    }
    public void display(linkedlist li)
    {
     Node temp=head;
     while(temp!=null)
     {
         System.out.print(temp.data);
         temp=temp.next;
     }
    }
}
public class ShiftRight {
    public static void main(String[] args) {
       Scanner s1=new Scanner(System.in);
       int n=s1.nextInt();
       int arr[]=new int[n];
       linkedlist li=new linkedlist();
       for(int i=0;i<n;i++)
       {
           arr[i]=s1.nextInt();
           li.insert(li, arr[i]);
       }
       int k=s1.nextInt();
       li.removing_dup(li, n, k);
       li.display(li);
    }
    
}
