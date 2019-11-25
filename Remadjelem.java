package remadjelem;
import java.util.*;
public class Remadjelem {
   
    public static void  check(String str)
    {
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                if(i<str.length()-2 && str.charAt(i)!=str.charAt(i+2))
                {
                    i=i+2;
                }
                else
                    i++;
                
            }
            if(i!=str.length()-1)
            {
                str1=str1+str.charAt(i);
            }
         if(i==str.length()-1 && str.charAt(i)!=str.charAt(i-1))
         {
          str1=str1+str.charAt(i);   
         }
        }
        System.out.print(str1);
        
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner (System.in);
        String str=s1.next();
        check(str);
    }
    
}
