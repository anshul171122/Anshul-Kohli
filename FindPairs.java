package findpairs;
import java.util.*;
public class FindPairs {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int m=s1.nextInt();
        int k=s1.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr1[i]=s1.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i]+arr1[j]==k)
                {
                    System.out.print(arr[i] + " " +arr1[j]+",");
                }
                
            }
        }
    }
    
}
