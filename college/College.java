package college;

import java.util.Scanner;

public class College 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[200],j,i,k,q=0,b=-1,c=0;
        int a = new Scanner(System.in).nextInt();
        if(a>9)
        {
            for(k=1;k<=a;k++)
            {
                j=0;
                for(i=1;i<=k;i++)
                {
                    if(k%i==0)
                        j++;
                }
                if(j==2&&k>10)
                {
                    arr[q]=k;
                    q++;
                }
            }
            for(i=0;i<q;i++)
                if(arr[i]>100)
                {
                    q=i;
                    break;
                }
            for(i=0;i<q;i++)
            {
                if(a==arr[i])
                {
                    b=1;
                    System.out.println(arr[i]);   
                }
                for(j=0;j<q;j++)
                {
                    if(a==arr[i]+arr[j])
                    {
                        b=2;
                        System.out.println(arr[i]+"  "+arr[j]);   
                    }
                    for(k=0;k<q;k++)
                    {
                        if(a==arr[i]+arr[j]+arr[k])
                        {
                            b=3;
                            System.out.println(arr[i]+"  "+arr[j]+"  "+arr[k]);
                        }
                    }
                }
            }
            System.out.println(b);
        }
        else
            System.out.println("Invalid Number");
    }
}