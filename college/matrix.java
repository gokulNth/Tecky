package college;

import java.util.Arrays;

public class matrix 
{
    public static void main(String[] args) 
    {
        int a[][] = new int[][]{{1,10,3},{4,2,6},{7,7,9}};
        int b[] = new int[3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(j==1)
                {
                    b[i]=a[i][j];
                }
            }
        }
//        Arrays.sort(b);
        for(int i=b.length-1,q=0;i>=0;i--,q++)
        {
            a[q][1]=b[i];
        }
        int b1[]=new int[3];
        for(int i=0,k=0,o=0;i<b.length;i++,k++)
        {
            for(int j=i;j<b.length;j++)
            {
                if(b[i]<b[j])
                {
                    o=1;
                }
                else
                {
                    o=0;
                }
            }
            if(o==1)
            {
                System.out.println(b[i]);
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
