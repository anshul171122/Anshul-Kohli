package loc;
import java.util.*;
 class Node
    {
        Node left;
        Node right;
        int data;
        Node(int da)
        {
            data=da;
        }
    }
class lca
{
 
    
    static Node root;
    lca()
    {
        root=null;
    }
    lca(int da)
    {
        root=new Node(da);
    }
    Node checkiflac(Node root,Node a,Node b)
    {
        if(root==null)
        {
            return root;
        }
        if(a==root)
        {
            return a;
        }
        if(b==root)
        {
            return b;
        }
        Node left=checkiflac(root.left,a,b);
        Node right=checkiflac(root.right,a,b);
        if(left!=null && right!=null)
        {
            return root;
        }
        Node temp;
        if(left==right)
        {
            temp=right;
        }
        else
        {
            temp=left;
        }
        return temp;
    }
}
public class Loc {
    public static void main(String[] args) {
        lca bt = new lca (1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        Node a = bt.root.left.left;
        Node b = bt.root.left.right;
        Node answer1 = bt.checkiflac(bt.root,a,b);
        
        Node c = bt.root.left.left;
        Node d = bt.root.right.left;        
        Node answer2 = bt.checkiflac(bt.root,c,d);
     
        Node e = bt.root.right;
        Node f = bt.root.left.left;
        Node answer3 = bt.checkiflac(bt.root,e,f);
        
        Node g = bt.root.left;
        Node h = bt.root.left.left;
        Node answer4 = bt.checkiflac(bt.root,g,h);
        
        Node i = bt.root.right;
        Node j = bt.root.right;
        Node answer5 = bt.checkiflac(bt.root,i,j);
        
        System.out.println("LCA(" + a.data + "," + b.data + ") = "+answer1.data);
        System.out.println("LCA(" + c.data + "," + d.data + ") = "+answer2.data);
        System.out.println("LCA(" + e.data + "," + f.data + ") = "+answer3.data);
        System.out.println("LCA(" + g.data + "," + h.data + ") = "+answer4.data);
        
    }
    
}
