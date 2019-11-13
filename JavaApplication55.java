package javaapplication55;
import java.util.*;
public class JavaApplication55 {
    public static void main(String[] args) {
     Scanner s1=new Scanner(System.in);
     int a=s1.nextInt();
     int arr[]=new int[a];
     int arr2[]=new int [30];
     int c=0;
     for(int i=0;i<a;i++)
     {
         arr[i]=s1.nextInt();
     }
     int sum=s1.nextInt();
     for(int i=0;i<a;i++)
     {
         for(int j=i;j<a;j++)
         {
             int index=0;
             c=0;
             for(int k=i;k<=j;k++)
             {
                 arr2[index]=k;
                 index++;
                c=c+arr[k];
                
             }
             //System.out.println(c);
             if(c==sum)
                {
                     System.out.print(arr2[0] + "," + arr2[index-1]);
               }
         }
         
     }
    }
    
}
