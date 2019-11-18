package longestbalpalindrome;
import java.util.*;
public class Longestbalpalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String s=input.next();
        char ch[]=new char[100];
        s = input.next();
        int len = s.length();
        char a[]=s.toCharArray();
        String ans="";
        int z = 0;         
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<=len;j++)
            {
                String temp = s.substring(i, j);
                if(checkPallindrom(temp))
                {
                    if((j-i)>z)
                    {
                        z = j-1;
                        ans = temp;
                    }
                }
            }
        }
        System.out.println(ans);        
    }

    public static boolean checkPallindrom(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}

    
    

