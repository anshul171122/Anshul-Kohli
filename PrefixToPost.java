package prefixtopost;
import java.util.*;
public class PrefixToPost {
    public static void main(String[] args) {
        Scanner s1=new Scanner (System.in);
        String str=s1.next();
        Stack<String> st=new Stack<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='*' || str.charAt(i)=='/')
            {
                String str1=st.pop();
                String str2=st.pop();
                str2=str1 +str2+str.charAt(i);
                st.push(str2);
            }
            else {
                String a=String.valueOf(str.charAt(i));
                st.push(a);
            }
        }
        String newstr=st.pop();
        System.out.println(newstr);
    }
    
}
