package remdup;
import java.util.Scanner;
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
   public linkedlist insert(linkedlist li,int data)
   {
       Node temp=new Node(data);
       if(head==null)
       {
           head=temp;
       }
       else
       {
           Node last;
           last=head;
           while(last.next!=null)
           {
               last=last.next;
           }
           last.next=temp;
       }
       return li;
   }
   void  removedup(linkedlist li)
   {
       Node pre,curr;
       pre=head;
       
       while(pre!=null && pre.next!=null)
       {
           curr=pre;
           while(curr.next!=null)
           {
               if(pre.data==curr.next.data )
               {
                   //pre.next=curr.next;
                   curr.next=curr.next.next;
                   System.out.println(pre.data);
               }
               else
               {
               curr=curr.next;
               }
           }
           pre=pre.next;
       }
   }
   void display(linkedlist li)
   {
    Node temp=head;
    System.out.println("the linkedlist after rem. is : ");
    while(temp!=null)
    {
        System.out.print(temp.data + " ");
    temp=temp.next;
    }
    
   }
}
public class RemDup {
    public static void main(String[] args) {
       linkedlist li=new linkedlist();
       Scanner s1=new Scanner (System.in);
       int n=s1.nextInt();
       int arr[]=new int [n];
       for(int i=0;i<n;i++)
       {
           arr[i]=s1.nextInt();
           li.insert(li, arr[i]);
       }
       li.removedup(li);
       li.display(li);
    }
    
}
