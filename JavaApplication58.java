package javaapplication58;
import java.util.*;
public class JavaApplication58 {
    public static void main(String[] args) {
        
        Scanner s1=new Scanner(System.in);
        String str=s1.next();
        Stack<Character> st=new Stack<>();
        char ch[]=str.toCharArray();
        char temp;
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
            {
                st.push(ch[i]);
                
            }
            if(ch[i]==')')
            {
                temp=(char)st.peek();
                if(temp=='(')
                {
                    st.pop();
                }
            }
            if(ch[i]==']')
            {
                temp=(char)st.peek();
                if(temp=='[')
                {
                    st.pop();
                }
            }
            if(ch[i]=='}')
            {
                temp=(char)st.peek();
                if(temp=='{')
                {
                    st.pop();
                }
            }
        }
        if(st.empty())
        {
            System.out.print("BALANCED");
        }
        else
        {
            System.out.print("Nope");
        }
                    
    }
    
}
