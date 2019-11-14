package javaapplication57;
import java.util.*;
public class JavaApplication57 {
    public static void main(String[] args) {
        
        Scanner s1=new Scanner(System.in);
        String str=s1.next();
        char ch[]=str.toCharArray();
        int l=0;
        int r=str.length()-1;
        char temp;
        while(l<r)
        {
            if(ch[l]>='a' && ch[r]<='z')
            {
                if(ch[r]>='a' && ch[r]<='z')
                {
                  temp=ch[l];
                  ch[l]=ch[r];
                  ch[r]=temp;
                  l++;
                  r--;
                }
                else
                {
                    r--;
                }
            }
            else
            {
                l++;
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    }
    
}
