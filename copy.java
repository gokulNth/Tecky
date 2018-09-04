import java.io.*;
import  java.util.*;
import java.lang.System.*;
class copy
{
    public static int k=0;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{10,41,18,50,43,31,29,25,59,96,67};
        prime(a);
    }
    public static void prime(int[] a)
    {
        int o=0;
        int[] b = new int[6];
        for(int i=0;i<a.length;i++)
        {
            k=0;
            for(int j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                    k++;
            }
            if(k==2)
            {
                b[o]=a[i];
                o++;
            }
        }
       Arrays.sort(b);
       o=0;
       for(int i=1;i<b.length;i++)
       {
           o=o+b[i];
       }
        System.out.println("Leaving Small "+o);
        o=0;
       for(int i=0;i<b.length-1;i++)
       {
           o=o+b[i];
       }
        System.out.println("Leaving big "+o);
    }
}