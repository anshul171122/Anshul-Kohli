package maxsubarraycount;
import java.util.*;
public class Maxsubarraycount {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int k=s1.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }
        int d;
        d=((n-(k-1))*(n-(k-1)+1))/2;
        System.out.println(d);
    }
    
}
