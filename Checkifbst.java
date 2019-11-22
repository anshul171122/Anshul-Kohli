package checkifbst;
import java.util.*;
class Node
    {
        int data;
        Node left,right;
        Node(int da)
        {
            data=da;
        }
        
    }
class bst
{
    
    static Node root;
    int ifbst(Node root)
    {
        if(root.left==null || root.right==null)
        {
           
           return 1;
        }
        if(root.left.data>root.data)
        {
            
            return 0;
        }
        if(root.right.data<root.data)
        {
            return 0;
        }
         if(root.left.data<root.data)
        {
             ifbst(root.left);
             
        }
         
         if(root.right.data>root.data)
        {
         
            ifbst(root.right);
        }
        return 1;
    }
}
public class Checkifbst {
    public static void main(String[] args) {
     
        bst bi=new bst();
        bst.root=new Node(8);
        bst.root.left=new Node(3);
        bst.root.left.left=new Node(1);
        bst.root.left.right=new Node(6);
        bst.root.right=new Node(10);
        bst.root.right.right=new Node(14);
        int d=bi.ifbst(bst.root);
        if(d==1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("No");
        }
    }
    
}
