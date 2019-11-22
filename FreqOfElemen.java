
package freqofelemen;
import java.util.*;
public class FreqOfElemen {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                
                if(arr[i]==arr[j] && j>=i)
                {
                    c++;
                if(j>i)
                {
                    arr[j]=111;
                }
                }
                
            }
            if(arr[i]!=111)
            {
            System.out.println(arr[i]+" "+c);
            }
        }
    }
    
}
